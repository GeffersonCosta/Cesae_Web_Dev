<?php

namespace App\Http\Controllers;

use App\Models\Bands;
use App\Models\Albums;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Storage;

class BandController extends Controller
{
    public function viewAllBands(){
        $allBands = Bands::all();
        // $allId = Albums::select('band_id')->get()->pluck('band_id')->toArray();
        // $amountAlbums = Bands::where('id', $allId)->get();
        return view('bands.all_bands', compact('allBands'));

    }
    public function returnViewAddBand(){
        $band = Bands::all();
        return view('bands.add_bands', compact('band'));
    }
    public function createBands(Request $request){
        $id = $request -> id;
        $photo = null;
        if($request -> hasFile('photo')){
           $photo = Storage::putFile('uploadedImagens', $request -> photo);

        }
        if($id != null){
            Bands::where('id', $request -> id) ->update([
                'name' => $request -> name,
                'photo' => $photo,
            ]);
        }else{
            Bands::insert([
                'name' => $request -> name,
                'photo' => $photo,
             ]);
        }
        return back();
    }
    public function deleteBand($id){
        Bands::where('id', $id)
        -> delete();
        return back();
    }

    public function updateBand($id){
        $band = Bands::where('id', $id) -> first();
        return view('bands.update_band', compact('band'));
    }



}
