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
                <th></th>
                <th></th>
                </tr>
            </thead>
            <tbody>
                @foreach($prendas as $prenda)
                <tr>
                    <th scope="row">{{ $prenda -> nomePrenda }}</th>
                    <td>{{ $prenda -> valorPrevisto }}</td>
                    <td>{{ $prenda -> valorGasto }}</td>
                    <td>{{ $prenda -> user_name }}</td>
                    <td>{{ $prenda -> diferencaValor}}</td>
                    <td>
                        @if ($prenda -> valorGasto > $prenda -> valorPrevisto)
                            <span style="color: red;">Gasto excessivo</span>
                        @else
                            <span style="color: green;">Dentro do previsto</span>
                        @endif
                    </td>
                    <td>
                        <a href="{{route('prendas.view', $prenda ->id)}}" class="btn btn-info">Ver</a>
                        <a href="{{route('prendas.delete', $prenda ->id)}}" class="btn btn-danger">Apagar</a>
                    </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>

@endsection
