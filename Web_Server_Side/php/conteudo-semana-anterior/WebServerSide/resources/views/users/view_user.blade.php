@extends('layouts.main_layout')
@section('content')

<div class="container p-3">
    <div class="table-responsive">
        <h3>Usuário por ID</h3>
        <table class="table table-striped table-bordered">
            <thead>
                <tr>
                <th scope="col">Id</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
                <th scope="col">NIF</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">{{ $userById -> id }}</th>
                    <td>{{ $userById -> name }}</td>
                    <td>{{ $userById -> email }}</td>
                    <td>{{ $userById -> nif }}</td>
                    </tr>
            </tbody>
        </table>
    </div>
</div>

@endsection
