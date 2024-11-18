@extends('layouts.main_layout')
@section('content')

<h1>Olá {{ Auth::user()->name }}</h1>

@auth
@if(Auth::user()->user_type == $roleAdmin)
{{--     <div class="alert alert-primary" role="alert">
        <h4>Conta Administrador</h4>
    </div> --}}
    <script>
        alert("Conta Administrador");
    </script>
@endif
@endauth

{{-- @auth
@if(Auth::user()->user_type == \App\Models\User::TYPE_ADMIN)
    <script>
        alert("Conta Administrador");
    </script>
@endif
@endauth --}}

@endsection
