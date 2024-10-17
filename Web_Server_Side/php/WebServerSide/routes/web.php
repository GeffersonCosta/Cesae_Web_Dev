<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;

Route::get('/home', function () {
    return view('utils.home');
})->name('homepage');

Route::get('/', function () {
 return view('welcome');
})-> name('welcome');

Route::get('/helloworld', function () {
    return "<h1>Hello World</h1>";
});

Route::get('/helloworld/{name}', function ($name) {
    return "<h1>Hello ".$name."</h1>";
});

Route::get('/users', function () {
    return view('users.all_users');
})->name('users.all');

Route::get('/newUsers', function(){
    return view('newUsers.usersNew');
})->name('newUser');

Route::get('/home', [IndexController::class,'home'])->name('home');
//Route::get('/users', [UserController::class, 'users'])->name('users');
//Route::get('/home', [IndexController::class, 'home'])->name('welcome');

//rota de fallback, onde o user cai quando clica numa rota que não está registada

Route::fallback(function(){
   return "<a href=".route('homepage').">Estás perdido, volta aqui</a>";
});




