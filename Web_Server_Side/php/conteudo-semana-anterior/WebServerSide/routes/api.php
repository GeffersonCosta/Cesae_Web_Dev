<?php

use App\Http\Controllers\TaskApiController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

Route::get('/user', function (Request $request) {
    return $request->user();
})->middleware('auth:sanctum');

/* Route::get('/tasks', [TaskApiController::class, 'showTask']); */ //Devolve todas as tasks

/* Route::get('/task/{task}', [TaskApiController::class, 'show']); */

Route::apiResource('/task', TaskApiController::class);
