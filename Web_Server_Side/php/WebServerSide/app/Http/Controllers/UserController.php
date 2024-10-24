<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function users(){
        $cesaeInfo = $this -> getCesaeInfo();
        $users = $this-> getAllUsersFromArray();
        /*dd($users);*/
        return view('users.all_users', compact('cesaeInfo','users'));
      }

    private function getCesaeInfo(){
       return $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
        ];
    }
    private function getAllUsersFromArray(){
       return $users = [
            ['id' => 1, 'name' => 'Joana', 'email' => 'Joana@gmail.com'],
            ['id' => 2, 'name' => 'Gefferson', 'email' => 'Gefferson@gmail.com'],
            ['id' => 3, 'name' => 'Henrique', 'email' => 'Henrique@gmail.com'],
        ];
    }
    public function insertUser(){
      DB::table('users')->insert([
            'name' => "henrique2",
            'email' => "gefferson6@gmail.com",
            'password' => "gefferson123469"
        ]);

    }
}


