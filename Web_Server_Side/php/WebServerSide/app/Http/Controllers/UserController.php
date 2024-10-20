<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function users(){
        $cesaeInfo = $this -> getCesaeInfo();
        return view('users.all_users', compact('cesaeInfo'));
      }
      
    private function getCesaeInfo(){
       return $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
        ];
    }

}


