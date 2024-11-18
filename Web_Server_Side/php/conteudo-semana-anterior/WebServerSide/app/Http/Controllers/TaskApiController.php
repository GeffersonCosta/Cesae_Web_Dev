<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use App\Http\Resources\TaskResource;
use App\Http\Resources\TaskResourceCollection;

class TaskApiController extends Controller
{

    public function index(): TaskResourceCollection
    {
        return new TaskResourceCollection(resource: Task::paginate(2)); //Devolve todas as tasks. 2 tasks por página.
        
    }

    /*     public function showTask()
    {
        $tasks = Task::all();
        return response()->json($tasks);
    } */

    public function create()
    {
        //
    }

    public function store(Request $request)
    {
        $request->validate([
            'name' => 'required',
            'user_id' => 'required',
        ]);

        Task::create($request->all());
        return response()->json('Task inserida!');

        /*         $task = Task::create($request->all());
        return response()->json(['message' => 'Task inserida!', 'task' => $task]); */
    }

    /*     public function show(Task $task)
    {
        return $task;
    } */

    public function show(Task $task): TaskResource //Devolve apenas os atributos definidos no Resource
    {
        return new TaskResource($task);
    }

    public function edit(string $id)
    {
        //
    }

    public function update(Request $request, Task $task) /* : TaskResource */
    {
        /*         $task = $task->update($request->all());
        return new TaskResource($task); */

        $task->update($request->all());
        return response()->json('Task atualizada com sucesso!');
    }

    public function destroy(Task $task)
    {
        $task->delete();
        return response()->json('Task deletada com sucesso!');
    }
}
