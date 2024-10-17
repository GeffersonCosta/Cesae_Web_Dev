<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function Index()
    {
        return view('utils.home');
    }

    public function Welcome()
    {
        return view('welcome');
    }

    public function WelcomeUser($name)
    {
        return "<h1>Hello $name </h1>";
    }
}
