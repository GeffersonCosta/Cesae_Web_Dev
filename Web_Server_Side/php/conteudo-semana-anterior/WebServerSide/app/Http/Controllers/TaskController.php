<?php

namespace App\Http\Controllers;

use App\Models\Task;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Response;

class TaskController extends Controller
{
    public function allTasks()
    {
        $search = request()->query('search') ? request()->query('search') : null;
        $tasks = $this->getAllTasks($search);
        //dd($tasks);
        return view('tasks.all_tasks', compact('tasks'));
    }

    protected function getAllTasks($search)
    {
        $tasks = DB::table('tasks')
            ->join('users', 'users.id', '=', 'tasks.user_id')
            ->select('tasks.*', 'users.name as user_name');

        if ($search) {
            $tasks->where("users.name", "LIKE", "%{$search}%");
        }

        $allTasks = $tasks->get();
        return $allTasks;
    }

    //Tem que preencher todos os campos obrigatórios
    /*     public function insertTask()
    {
        DB::table('tasks')
            ->insert([
                'name' => 'Jardim',
                'description' => 'Arrumar o jardim.',
                'status' => 1,
                'due_at' => now(),
                'user_id' => '11'
            ]);
        return Response::json('sucesso');
    } */

    public function viewTask($id)
    {
        $task = Task::where('id', $id)->first();
        $users = User::all();
        //dd($taskById);
        return view('tasks.add_task', compact('task', 'users'));
    }

    public function deleteTask($id)
    {
        User::where('id', $id)->delete();
        Task::where('user_id', $id)->delete();
        return back();
    }

    public function addTask()
    {
        $users = User::all();
        return view('tasks.add_task', compact('users'));
    }

    public function createTask(Request $request)
    {
        $action = '';
        if (isset($request->id)) {
            $action = 'atualizado';
            $request->validate([
                'name' => 'string|required|max:50',
                'description' => 'string|required|max:60',
                'user_id' => 'required|exists:users,id',
            ]);

            Task::where('id', $request->id)
                ->update([
                    'name' => $request->name,
                    'description' => $request->description,
                    'user_id' => $request->user_id,
                ]);
        } else {
            $action = 'inserido';
            $request->validate([
                'name' => 'string|required|max:50',
                'description' => 'string|required|max:60',
                'user_id' => 'required|exists:users,id',
            ]);

            Task::insert([
                'name' => $request->name,
                'description' => $request->description,
                'user_id' => $request->user_id,
                'due_at' => $request->due_at,
            ]);
        }

        return redirect()->route('tasks.all')->with('message', 'Tarefa' . $action . 'com sucesso!');
    }
}
