@extends('layouts.femaster')
@section('content')

        <h3>Sou uma blade para todos os users</h3><br><br>

        <table class="table">
            <thead>
              <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col"></th>
              </tr>
            </thead>
            <tbody>
                @foreach ($users as $user)
              <tr>
                <th scope="row">{{$user -> id}}</th>
                <td>{{$user -> name}}</td>
                <td>{{$user -> email}}</td>
                <td><a href="{{route('users.show', $user->id)}}" class="btn btn-info">Ver</a></td>
                <td><a href="{{route('users.delete', $user->id)}}" class="btn btn-danger">Apagar</a></td>
              </tr>
              @endforeach
            </tbody>
          </table>




@endsection



