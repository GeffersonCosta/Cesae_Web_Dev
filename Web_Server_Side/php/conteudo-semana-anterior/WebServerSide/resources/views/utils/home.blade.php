@extends('layouts.main_layout')
@section('content')

<img src="{{asset('images/apoioAoCliente.png')}}" alt="">
<h3>Olá sou a nossa casa!</h3>

<p>{{ $myvar }}</p>

<p>Meu nome é: {{ $allName['name'] }} {{ $allName['apelido'] }}</p>

<h3>Cesae Info</h3>
<p>Aqui estão os dados do Cesae, no UserController</p>

<p>Nome: {{ $cesaeInfo['name'] }}</p>
<p>Address: {{ $cesaeInfo['address'] }}</p>
<p>Email: {{ $cesaeInfo['email'] }}</p>

<h3>LInks Úteis</h3>
<ul>
    <li><a href="{{ route('user.add') }}">Adicionar Utilizador</a></li>
</ul>


@endsection
