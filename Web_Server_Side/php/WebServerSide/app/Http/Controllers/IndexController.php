<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
   public function welcome(){
     return view('welcome');
   }
   public function home(){
    $myFirstVar = 'Hello World';
    $weekDays = $this -> getAllWeekDays();
    $info = $this -> getCourseInfo();
    return view('utils.home', compact('myFirstVar', 'weekDays', 'info'));
   }
   private function getAllWeekDays(){
    return $weekDays = ['Segunda', 'Terça', 'Quarta', 'Quinta'];
   }
   private function getCourseInfo(){
    return $courseInfo = [
        'name' => 'Web&Mobile',
        'hours' => 950
    ];
   }
}

