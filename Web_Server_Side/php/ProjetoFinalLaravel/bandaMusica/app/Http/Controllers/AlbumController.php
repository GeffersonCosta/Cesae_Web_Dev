<?php

namespace App\Http\Controllers;

use App\Models\Bands;
use App\Models\Albums;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Storage;

class AlbumController extends Controller
{
    public function viewAllAlbums($id){
        $band = Bands::where('id', $id)->first();
        $allAlbums = Albums::where('band_id', $id)->get();
        return view('albums.all_albums', compact('allAlbums','band'));
       }
       public function returnViewAddAlbum(){
        $allBands = Bands::all();
        return view('albums.add_albums', compact('allBands'));
       }


       public function createAlbum(Request $request){
            $photo = null;
            $id = $request -> band_id;
            if($request -> hasFile('photo')){
                $photo = Storage::putFile('uploadedImagens', $request -> photo);
             }
            if($id != null){
                Bands::where('id', $request -> band_id)->increment('amount_albums');
                Albums::insert([
                    'name' => $request -> name,
                    'photo' => $photo,
                    'band_id' => $request -> band_id,
                    'due_at' => $request -> date,
                 ]);
            }else{
                Albums::where('id', $request -> album_id)->update([
                    'name' => $request -> name,
                    'photo' => $photo,
                    'due_at' => $request -> date,
                ]);
            }
             return back();
       }

       public function deleteAlbum($id){
         $album = Albums::where('id', $id)->first();
         Bands::where('id', $album->band_id)->decrement('amount_albums');
         Albums::where('id', $id)
         -> delete();
         return back();
       }

       public function updateAlbum($id){
        $album = Albums::where('id', $id) -> first();
        $allBands = Bands::all();
        return view('albums.update_album', compact('album','allBands'));
       }

}
