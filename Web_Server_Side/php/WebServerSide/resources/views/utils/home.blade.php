
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
        <li><a href="{{route('newUser')}}">add users</a></li>
    </ul>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    @endsection
