@extends('layouts.femaster')
@section('content')

<h1>Todas as Tarefas</h1>

<br><br>
<table class="table">
    <thead>
      <tr>
                <th scope="col">ID</th>
                <th scope="col">Nome</th>
                <th scope="col">Descrição</th>
                <th scope="col">Usuário</th>

      </tr>
    </thead>
    <tbody>
        @foreach ($tasks as $task)
      <tr>
        <th scope="row">{{$task -> id}}</th>
        <td>{{$task -> name}}</td>
        <td>{{$task -> description}}</td>
        <td>{{$task -> userName}}</td>
      </tr>
        @endforeach
    </tbody>
  </table>


@endsection
