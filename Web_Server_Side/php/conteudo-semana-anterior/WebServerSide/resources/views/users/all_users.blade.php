@extends('layouts.main_layout')
@section('content')

@if (session('message'))
<div class="alert alert-success">{{ session('message') }}</div>
@endif

<div class="container p-3">
    <div class="table-responsive">
        <h3>Usuários da Base de dados</h3>
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
                <th scope="col">Email</th>
                <th scope="col">NIF</th>
                <th>Foto</th>
                <th></th>
                </tr>
            </thead>
            <tbody>
                @foreach($users as $user)
                <tr>
                    <th scope="row">{{ $user -> id }}</th>
                    <td>{{ $user -> name }}</td>
                    <td>{{ $user -> email }}</td>
                    <td>{{ $user -> nif }}</td>
                    <td>
                        <img width="40px" height="40px" style="border-radius: 50%"
                        src="{{ $user->photo ? asset('storage/' . $user->photo) : asset('images/profile.png') }}">
                    </td>
                    <td>
                        <a href="{{route('users.view', $user ->id)}}" class="btn btn-info">Ver/Editar</a>
                        <a href="{{route('users.delete', $user ->id)}}" class="btn btn-danger">Apagar</a>
                    </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>

{{-- @foreach($users as $user)
    <ul>
        <li>{{ $user -> name }}</li>
        <li>{{ $user -> email }}</li>
        <li>{{ $user -> nif }}</li>
    </ul>
@endforeach --}}

@endsection
