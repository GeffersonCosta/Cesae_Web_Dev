<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Foundation\Auth\User;
use Symfony\Component\HttpFoundation\Response;


class UserController extends Controller
{
    public function users(){
        // $cesaeInfo = $this -> getCesaeInfo();
        $users = $this-> getAllUsersFromDataBase();
        // return view('users.all_users', compact('users, cesaeInfo'));
        return view('users.all_users', compact('users'));
      }

    // private function getCesaeInfo(){
    //    return $cesaeInfo = [
    //         'name' => 'Cesae',
    //         'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
    //         'email' => 'cesae@cesae.pt'
    //     ];
    // }
    // private function getAllUsersFromArray(){
    //   $users = User::all();

    //   return view('users.all_users', compact('users'));

    // }


    public function getAllUsersFromDataBase(){
        $users = User::all();
        return $users;
      }

    public function insertUser(){

        // DB::table('users')->insert([
        //     'name' => "henrique182",
        //     'email' => "gefferson232@gmail.com",
        //     'password' => "abcfe1234ab"
        // ]);

    //   $users = User::all();
    //   return view("users.insert-user", compact("users"));



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


