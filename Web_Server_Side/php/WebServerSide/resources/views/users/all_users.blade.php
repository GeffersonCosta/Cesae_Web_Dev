@extends('layouts.femaster')
@section('content')

        <h3>Sou uma blade para todos os users</h3>
        <h3>Informações do Cesae</h3>
        <ul>
            @foreach ($cesaeInfo as $info)
            <li>{{$info}}</li>
            @endforeach
        </ul>


        <h3>Informações da base de dados</h3>

        <ul>
            @foreach ($users as $elemento)
            <li>ID: {{$elemento['id']}}</li>
            <li>Nome: {{$elemento['name']}}</li>
            <li>Email: {{$elemento['email']}}</li>
            <hr/>
            @endforeach
        </ul>


@endsection



