<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class DashboardController extends Controller
{
    public function returnViewDashboard(){
        $user = Auth::User()->name;
        return view('dashboard.dashboard', compact('user'));
       }
}
