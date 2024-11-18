<?php

namespace App\Http\Controllers;
use App\Http\Controllers\UserController;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function home()
    {
        $myvar = 'Olá mundo!';
        $allName = $this->getName();

        $userController = new UserController();
        $cesaeInfo = $userController->showCesaeInfo();

        /* Mostra os dados que estão sendo devolvidos -> dd */
        /* dd($cesaeInfo); */
        return view('utils.home', compact('myvar', 'allName', 'cesaeInfo'));
    }

    protected function getName() {
        $allName = [
            'name' => 'Karoline',
            'apelido' => 'Rocha'
        ];
        return $allName;
    }
}
