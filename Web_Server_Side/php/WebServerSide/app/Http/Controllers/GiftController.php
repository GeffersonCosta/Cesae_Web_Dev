<?php

namespace App\Http\Controllers;

use App\Models\Gift;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Foundation\Auth\User;
use App\Http\Controllers\GiftController;

class GiftController extends Controller
{
    public function allGifts(){
      $gifts = db::table("gifts")->join('users','users.id', '=', 'gifts.user_id')
      ->select("gifts.*","users.name as username")
      ->get();
      return view("gifts.gift",compact("gifts"));
    }
    public function giftShow($id){
        $userName = db::table("gifts")->join('users','users.id', '=', 'gifts.user_id')->select("gifts.*","users.name as username")->first();
        $gifts = Gift::where('id', $id)->first();
        $valorTotal = $gifts["value_predicted"]-$gifts["value_spent"];

         return view("gifts.gift_show", compact("gifts","userName", "valorTotal"));
    }
    public function giftDelete($id){
        Gift::where("id", $id)->delete();
        return back();
   }



}
