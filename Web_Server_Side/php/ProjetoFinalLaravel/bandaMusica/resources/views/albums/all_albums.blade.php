
@extends('layouts.fmaster')
@section('content')


<h1>Todos os albuns da Banda {{$band->name}}</h1> {{--  colocar para aparecer o nome da banda exe: Todos os albuns do Pearl Jam --}}

<table class="table table-striped table-bordered">
    <thead>
        <tr>
        <th scope="col">Nome do album</th>
        <th scope="col">imagem</th>
        <th scope="col">Data de lançamento</th>
        </tr>
    </thead>
    <tbody>
        @foreach($allAlbums as $album)
        <tr>
            <td scope="row">{{ $album -> name }}</td>
            <td>
            <img
            src="{{ $album->photo ? asset('storage/' . $album->photo) : '' }}">
            </td>
            <td>{{ $album -> due_at }}</td>
            @auth
            <td>
                <a href="{{route('update.album', $album -> id)}}" class="btn btn-success">Editar</a>
                @if(Auth::User()->user_type == 0)
                <a href="{{route('delete.Album', $album -> id)}}" class="btn btn-danger">Apagar</a>
                {{-- <a href="{{route('users.delete', $user ->id)}}" class="btn btn-danger">Apagar</a> --}}
                @endif
            </td>
            @endauth
            </tr>
         @endforeach
    </tbody>
</table>





@endsection


{{-- <td>
    <img width="40px" height="40px" style="border-radius: 50%"
    src="{{ $user->photo ? asset('storage/' . $user->photo) : asset('images/profile.png') }}">
</td> --}}
