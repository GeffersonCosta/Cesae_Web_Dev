@extends('layouts.femaster')
@section('content')


<h1>Usuário inserido no banco de dados</h1>
<ul>
    @foreach ($users as $user)
            <li>Nome: {{$user -> name }} - Email: {{$user -> email}}</li>
    @endforeach
</ul>


@endsection
