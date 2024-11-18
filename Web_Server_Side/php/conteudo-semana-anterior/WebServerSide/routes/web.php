<?php

use App\Http\Controllers\DashboardController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\PrendaNatalController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\FormController;

Route::get('/', [IndexController::class, 'welcome'])->name('welcome');

// Redirecionar '/' para '/home'
Route::get('/', function () {
    return redirect()->route('home');
});

Route::get('/home', [HomeController::class, 'home'])->name('home');

Route::get('/users', [UserController::class, 'users'])->name('users.all');

Route::get('/users/add', [UserController::class, 'addUser'])->name('user.add');

Route::post('/createUsers', [UserController::class, 'createUser'])->name('users.create');

Route::get('/view_user/{id}', [UserController::class, 'viewUser'])->name('users.view');

Route::get('/edit_user/{id}', [UserController::class, 'editUser'])->name('users.edit');

Route::get('/delete_user/{id}', [UserController::class, 'deleteUser'])->name('users.delete');

Route::get('/insert_user', [UserController::class, 'insertUser'])->name('users.insert');

Route::get('/update_user', [UserController::class, 'updateUser'])->name('users.update');

Route::get('/updateOrInsert_user', [UserController::class, 'updateOrInsertUser'])->name('users.updateOrInsert');

Route::get('/delete_user', [UserController::class, 'deleteUsers'])->name('users.delete');

Route::get('/tasks', [TaskController::class, 'allTasks'])->name('tasks.all');

Route::get('/tasks/add', [TaskController::class, 'addTask'])->name('task.add');

Route::post('/createTasks', [TaskController::class, 'createTask'])->name('tasks.create');

Route::get('/view_task/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');

Route::get('/edit_task/{id}', [TaskController::class, 'editTask'])->name('tasks.edit');

Route::get('/delete_task/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');

Route::get('/insert_task', [TaskController::class, 'insertTask'])->name('tasks.insert');

Route::get('/prendasNatal', [PrendaNatalController::class, 'viewPrendas'])->name('prendas.all');

Route::get('/insert_prenda', [PrendaNatalController::class, 'insertPrenda'])->name('prendas.insert');

Route::get('/update_prenda', [PrendaNatalController::class, 'updatePrenda'])->name('prendas.update');

Route::get('/delete_prenda/{id}', [PrendaNatalController::class, 'deletePrenda'])->name('prendas.delete');

Route::get('/view_prenda/{id}', [PrendaNatalController::class, 'viewPrendaById'])->name('prendas.view');

/* Route::get('/diferencaValor_prenda', [PrendaNatalController::class, 'diferencaValor'])->name('prendas.diferencaValor'); */

Route::get('/homeDashboard', [DashboardController::class, 'index'])->name('utils.homeDashboard')->middleware('auth');

Route::get('/hello_world', function () {
    return '<h1>Hello World!</h1>';
});

Route::get('/hello_world/{name}', function ($name) {
    return '<h1>Hello ' . $name . '</h1>';
});

//Rota de fallback (Tratamento de exceção do 404)
Route::fallback(function () {
    return view('fallback.fallbackException');
});
