<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class AuthController extends Controller
{
   public function destroy($sessionId){
     $sessionId.Auth::logout();
   }
}
