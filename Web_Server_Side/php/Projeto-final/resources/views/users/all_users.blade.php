@extends('layouts.femaster')
@section('content')

        <h3>Sou uma blade para todos os users</h3><br><br>
        @if(session('message'))
        <div class="alert alert-success">{{session('message')}}</div>
        @endif


        <form method="GET">
            <input value="{{request()->query('search')}}" type="text" name="search" id="" placeholder="Pesquisar">
            <button class="btn btn-secondary">Produrar</button>
        </form>
        <table class="table">
            <thead>
              <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col"></th>
                <th scope="col"></th>
                <th scope="col"></th>
              </tr>
            </thead>
            <tbody>
                @foreach ($users as $user)
              <tr>
                <th scope="row">{{$user -> id}}</th>
                <td>{{$user -> name}}</td>
                <td>{{$user -> email}}</td>
                <td>{{$user -> password}}</td>
                <td><a href="{{route('users.show', $user->id)}}" class="btn btn-info">Ver</a></td>
                <td><a href="{{route('users.delete', $user->id)}}" class="btn btn-danger">Apagar</a></td>
              </tr>
              @endforeach
            </tbody>
          </table>




@endsection



