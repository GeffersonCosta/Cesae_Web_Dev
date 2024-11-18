@extends('layouts.main_layout')
@section('content')

@if (session('message'))
<div class="alert alert-success">{{ session('message') }}</div>
@endif

<div class="container p-3">
    <div class="table-responsive">
        <h3>Tarefas da Base de dados</h3>
        <br>
        <form method="GET">
            <input type="text" name="search" id="" placeholder="Procurar" value="{{request()->query('search')}}">
            <button class="btn btn-secondary">Procurar</button>
        </form>
        <br>
        <table class="table table-striped table-bordered">
            <thead>
                <tr>
                <th scope="col">Id</th>
                <th scope="col">Nome</th>
                <th scope="col">Descrição da tarefa</th>
                <th scope="col">Data de conclusão</th>
                <th scope="col">Pessoa responsável</th>
                <th></th>
                </tr>
            </thead>
            <tbody>
                @foreach($tasks as $task)
                <tr>
                    <th scope="row">{{ $task -> id }}</th>
                    <td>{{ $task -> name }}</td>
                    <td>{{ $task -> description }}</td>
                    <td>{{ $task -> due_at }}</td>
                    <td>{{ $task -> user_name }}</td>
                    <td>
                        <a href="{{route('tasks.view', $task ->id)}}" class="btn btn-info">Ver/Editar</a>
                        <a href="{{route('tasks.delete', $task ->id)}}" class="btn btn-danger">Apagar</a>
                    </td>
                </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>

@endsection
