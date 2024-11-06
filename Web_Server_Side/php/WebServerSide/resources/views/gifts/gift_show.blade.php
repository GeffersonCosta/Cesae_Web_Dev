@extends('layouts.femaster')

@section('content')
<h1>Prendas de Natal e valor gasto</h1>
<br><br>
<table class="table">
    <thead>
      <tr>
        <th scope="col">Nome</th>
        <th scope="col">Valor Previsto</th>
        <th scope="col">Valor Gasto</th>
        <th scope="col">Quem irá ganhar</th>
        <th scope="col">Total</th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>{{$gifts -> name}}</td>
        <td>{{$gifts -> value_predicted}}</td>
        <td>{{$gifts -> value_spent}}€</td>
        <td>{{$userName -> username}}</td>
        <td>{{$valorTotal}}€</td>
        <td></td>
        <td></td>
      </tr>
    </tbody>
  </table>

@endsection
