<?php

use Illuminate\Support\Facades\Route;

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






// rota de fallback, onde o user cai quando clica numa rota que não está registada

Route::fallback(function(){
   return "<a href=".route('homepage').">Estás perdido, volta aqui</a>";
});

Route::fallback(function(){
    return view('utils.fallback');
});


