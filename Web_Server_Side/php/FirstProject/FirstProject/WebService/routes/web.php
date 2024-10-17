<?php

use App\Http\Controllers\HomeController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;

Route::get('/', [HomeController::class,"Welcome"])->name("welcome");

Route::get('/home', [HomeController::class,"Index"])->name("home");
Route::get('/home/welcome/{name}', [HomeController::class,"WelcomeUser"])->name("home/welcome/{name}");

Route::get('/allUsers', [UserController::class,"allUsers"])->name("users.all");
Route::get('/addUsers', [UserController::class,"addUsers"])->name("users.add");

//Rota Fallback!!!
Route::fallback(function(){
    return view('fallback.erro');
});

