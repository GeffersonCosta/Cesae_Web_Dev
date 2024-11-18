@extends('layouts.main_layout')
@section('content')
<div class="container p-3">
    <div class="table-responsive">
        <h3>Prendas de Natal</h3>
        <table class="table table-striped table-bordered">
            <thead>
                <tr>
                <th scope="col">Nome da prenda</th>
                <th scope="col">Valor previsto</th>
                <th scope="col">Valor gasto</th>
                <th scope="col">Presenteador</th>
                <th scope="col">Diferença valor</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">{{ $prendaById -> nomePrenda }}</th>
                    <td>{{ $prendaById -> valorPrevisto }}</td>
                    <td>{{ $prendaById -> valorGasto }}</td>
                    <td>{{ $prendaById -> user_name }}</td>
                    <td>{{ $prendaById -> diferencaValor}}</td>
                    </tr>
            </tbody>
        </table>
    </div>
</div>

@endsection
