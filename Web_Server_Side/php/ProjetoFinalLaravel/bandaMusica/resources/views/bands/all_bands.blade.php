
@extends('layouts.fmaster')
@section('content')


<h1>Todas as Bandas</h1>

<table class="table table-striped table-bordered">
    <thead>
        <tr>
        <th scope="col">Nome da banda</th>
        <th scope="col">Foto</th>
        <th scope="col">número de álbuns</th>
        </tr>
    </thead>
    <tbody>
         @foreach($allBands as $band)

        <tr>
            <td>{{$band -> name}}</td>
            <td>
                <img width="40%" style="border-radius: 10%"
                src="{{ $band->photo ? asset('storage/' . $band->photo) : asset('images/profile.png') }}">
            </td>
            <td>{{$band->amount_albums}}</td>
            <td>
                <a href="{{route('all.albums', $band -> id)}}" class="btn btn-info">Ver álbuns</a><br>
                @auth
                <a href="{{route('update.band', $band -> id)}}" class="btn btn-success">Editar</a>
                <a href="{{route('delete.band', $band -> id)}}" class="btn btn-danger">Apagar</a>
                {{-- <a href="{{route('users.delete', $user ->id)}}" class="btn btn-danger">Apagar</a> --}}
                @endauth
            </td>
            </tr>
        @endforeach
    </tbody>
</table>





@endsection


{{-- <td>
    <img width="40px" height="40px" style="border-radius: 50%"
    src="{{ $user->photo ? asset('storage/' . $user->photo) : asset('images/profile.png') }}">
</td> --}}
