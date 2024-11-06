<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Foundation\Auth\User;
use Illuminate\Support\Facades\Hash;
use Symfony\Component\HttpFoundation\Response;


class UserController extends Controller
{

    public function users(){
        $users = $this-> getAllUsersFromDataBase();
        return view('users.all_users', compact('users'));
      }

      public function getAllUsersFromDataBase(){
        $users = User::all();
        return $users;
      }


    public function returnViewAddUser(){
        return view("users.add_user");
 }

 public function createUser(Request $request){
    $request -> validate([
        'name' => 'string|required|max:20',
        'email' => 'email|required|unique:users',
        'password' => 'min:6|required',
    ]);

   User::insert([
    'name' => $request -> name,
    'email' => $request -> email,
    'password' => Hash::make($request -> password)
   ]);

   return redirect()->route("users.all")->with('message', 'Usuário adicionado com sucesso');
}

public function viewUser($id){
    $users = User::where("id", $id)->first();
   return view("users.show_user", compact("users"));
}

public function deleteUser($id){
    // $serName = User::where("id", $id)->first();
    User::where("id", $id) ->delete();
    return back();
}

}


