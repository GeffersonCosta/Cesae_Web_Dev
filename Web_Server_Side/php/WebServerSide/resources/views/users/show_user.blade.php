@extends('layouts.femaster')

@section('content')
    <h4>Dados do usuário {{ $users->name }}</h4>
    <h6>{{ $users->email }}</h6>
    <h6>{{ $users->password }}</h6>
@endsection
