<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\BandController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\AlbumController;
use App\Http\Controllers\DashboardController;





// Route::get('/', function () {
//     return view('bands.all_bands')->name('allbands');
// });
/**Bandas*/
Route::get('/home', [BandController::class, 'viewAllBands'])->name('all.bands');
Route::get('/', [BandController::class, 'viewAllBands'])->name('all.bands');
Route::get('/allBands', [BandController::class, 'viewAllBands'])->name('all.bands');


Route::get('/add_bands', [BandController::class, 'returnViewAddBand'])->name('add.bands')->middleware('auth');
Route::post('/create_bands',[BandController::class, 'createBands'])->name('create.bands')->middleware('auth');
Route::get('/delete_band/{id}',[BandController::class, 'deleteBand'])->name('delete.band')->middleware('auth');
Route::get('/update_band/{id}',[BandController::class, 'updateBand'])->name('update.band')->middleware('auth');


/**Albuns*/
Route::get('/allAlbums/{id}', [AlbumController::class, 'viewAllAlbums'])->name('all.albums');

Route::get('/add_albums', [AlbumController::class, 'returnViewAddAlbum'])->name('add.albums')->middleware('auth');
Route::post('/create_albums', [AlbumController::class, 'createAlbum'])->name('create.albums')->middleware('auth');
Route::get('/delete_album/{id}',[AlbumController::class, 'deleteAlbum'])->name('delete.Album')->middleware('auth');
Route::get('/update_album/{id}',[AlbumController::class, 'updateAlbum'])->name('update.album')->middleware('auth');


/**Users*/
Route::get('/users_add', [UserController::class, 'returnViewAddUser'])->name('users.add');
Route::post('users_create', [UserController::class, 'createUser'])->name('users.create');

/**Dashboard*/
Route::get('/dashboard', [DashboardController::class, 'returnViewDashboard'])->name('dashboard');
