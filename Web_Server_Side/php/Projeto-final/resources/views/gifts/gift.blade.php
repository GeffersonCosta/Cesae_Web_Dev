@extends('layouts.femaster')

@section('content')
<h1>Prendas de Natal</h1>

<br><br>

<table class="table">
    <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Valor Previsto</th>
        <th scope="col">Valor Gasto</th>
        <th scope="col">Quem irá ganhar</th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
        @foreach ($gifts as $gift)
      <tr>
        <th scope="row">{{$gift -> id}}</th>
        <td>{{$gift -> name}}</td>
        <td>{{$gift -> value_predicted}}</td>
        <td>{{$gift -> value_spent}}</td>
        <td>{{$gift -> username}}</td>
        <td><a href="{{route('gifts.gift_show', $gift->id)}}" class="btn btn-primary">Ver</a></td>
        <td><a href="{{route('gifts.gift_delete', $gift->id)}}" class="btn btn-danger">Remover</a></td>
      </tr>
      @endforeach
    </tbody>
  </table>


@endsection
