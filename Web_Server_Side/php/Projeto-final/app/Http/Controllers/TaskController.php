<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Foundation\Auth\User;


class TaskController extends Controller
{

public function allTasks(){
//    $tasks = DB::table('tasks')->get();

  $tasks = DB::table("tasks")
        ->join("users","user_id","=","users.id")
        ->select("tasks.*", "users.name as userName")
        ->get();

     return view('tasks.all_task', compact('tasks'));
}

public function createTask(Request $request){
    // dd($request -> all());
    Task::insert([
        'name' => $request -> name,
        'description' => $request -> description,
        'user_id' => $request -> user_id,
    ]);
    return redirect()->route("all.Task");
}

public function returnViewAddTask(){
   $users = User::all();
    return view('tasks.add_task', compact('users'));
}


}
