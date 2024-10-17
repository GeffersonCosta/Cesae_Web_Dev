 @extends('layout.femaster')
 @section('content')

 <h5>Olá eu sou a nossa casa!</h5>
    <ul>
        <li><a href="{{route("welcome")}}">Welcome</a></li>
        <li><a href="{{route("users.all")}}">All users</a></li>
        <li><a href="{{route("users.all")}}">Add users</a></li>
    </ul>

 @endsection


