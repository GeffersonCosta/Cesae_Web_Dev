@extends('layouts.femaster')

@section('content')
    <h4>Cucu sou os dados de um user {{ $user->name }}</h4>
    <h6>{{ $user->email }}</h6>
@endsection
