<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Foundation\Auth\User;
use Symfony\Component\HttpFoundation\Response;


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
      $todoConteudo =  listas::all();
        dd($todoConteudo);
      return view("users.insert-user", compact('listas'));

      /*DB::table('users')->insert([
            'name' => "henrique150",
            'email' => "gefferson200@gmail.com",
            'password' => "gefferson123469"
        ]);
        return view("users.insert-user");*/
     //-------------------------------------------------------
        // Db::table('users')
        // -> updateOrInsert(
        //     [
        //         'email' => 'Pedro@gmail.com',
        //         'password' => 'Pedro123456'
        //     ],
        //     [
        //         'name' => 'Pedro',
        //         'updated_at' => now(),
        //         'password' => 'abx123456'
        //     ],
        //     );}

        // db::table('users')
        // -> where('id', 10)
        // -> delete();

 }
}


