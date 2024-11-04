
@extends('layouts.femaster')
@section('content')
@php
        $myvar = " ";
        $name = "Henrique";
    @endphp
    <h5>Olá sou a nossa casa!</h5>
    <p>{{$myFirstVar}}</p>
    <ul>
        @foreach($weekDays as $day)
        <li>{{ $day }}</li>
        @endforeach
    </ul>

    @if($myvar)
    <p>{{$myvar}}</p>
    @else
    <p>Não existe nome</p>
    @endif

    <h3>Dados do Curso</h3>
    <p>Nome: {{$info['name']}}</p>
    <p>Horas: {{$info['hours']}}</p>

    <img src="{{asset('imagens/carro.jpg')}}" alt="">
    <ul>
        <li><a href="{{route('welcome')}}">Welcome</a></li>
        <li><a href="{{route('users.all')}}">all users</a></li>
        <li><a href="{{route('Inserir_User')}}">add users</a></li>
        <li><a href="{{route('allTask')}}">Todas as Tarefas</a></li>
    </ul>
    @endsection
