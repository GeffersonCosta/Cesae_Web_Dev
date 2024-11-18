<?php

namespace App\Http\Controllers;

use App\Models\User;
use App\Models\Prenda;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Response;

class PrendaNatalController extends Controller
{
    public function viewPrendas()
    {
        $prendas = $this->getAllPrendas();
        /* $valorPrendas = $this->diferencaValor(); */
        //dd($prendas);
        return view('prendas.all_prendas', compact('prendas'/* , 'valorPrendas' */));
    }

    protected function getAllPrendas()
    {
        $prendas = DB::table('prendas')
            ->join('users', 'users.id', '=', 'prendas.user_id')
            ->select(
                'prendas.*',
                'users.name as user_name',
                DB::raw('(valorPrevisto - valorGasto) as diferencaValor'),
                DB::raw('CASE WHEN valorPrevisto - valorGasto >= 0 THEN "+" ELSE "-" END as sinalDiferenca')
            )
            ->get();
        //dd($prendas);
        return $prendas;
    }

    public function insertPrenda()
    {
        DB::table('prendas')
            ->insert([
                'nomePrenda' => 'Sandália',
                'valorPrevisto' => 50,
                'valorGasto' => 45.99,
                'user_id' => '10',
                'created_at' => now()
            ]);
        return Response::json('sucesso');
    }

    public function updatePrenda()
    {
        DB::table('prendas')
            ->where('id', 2)
            ->update([
                'nomePrenda' => 'Livro',
                'created_at' => now()
            ]);
        return Response::json('sucesso');
    }

    //Deleta uma prenda com um id específico
    /*     public function deletePrenda()
    {
        DB::table('prendas')
            ->where('id', 1)
            ->delete();
        return Response::json('sucesso');
    } */

    public function viewPrendaById($id)
    {
        $prendaById = Prenda::where('prendas.id', $id)
            ->join('users', 'users.id', '=', 'prendas.user_id')
            ->select(
                'prendas.*',
                'users.name as user_name',
                Prenda::raw('(valorPrevisto - valorGasto) as diferencaValor'),
                Prenda::raw('IF(valorPrevisto - valorGasto >= 0, "+", "-") as sinalDiferenca')
            )
            ->first();
        // dd($prendaById);
        return view('prendas.view_prenda', compact('prendaById'));
    }

    public function deletePrenda($id)
    {
        //Usando Query Builder
        //DB::table('prendas')->delete();
        Prenda::where('id', $id)->delete();
        return back();
    }

    //Devolve o valor absoluto (Sem o '+' ou '-')
    /*     public function diferencaValor()
    {
        $prendas = DB::table('prendas')
            ->select('valorPrevisto', 'valorGasto', DB::raw('ABS(valorPrevisto - valorGasto) as diferencaValor'))
            ->get();
        return $prendas;
    } */
}
