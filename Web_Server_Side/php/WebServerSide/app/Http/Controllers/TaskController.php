<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class TaskController extends Controller
{

public function allTasks(){

  //    $tasks = Task::all();
 // return view('tasks.all_task', compact('tasks'));
  return view('tasks.all_task');
}


}
