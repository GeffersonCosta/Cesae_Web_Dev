<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Error</title>
    <script src={{ asset('JS/novo.js') }}></script>
    @php

    $route = route('home');

    @endphp
</head>
<body>
    <h1>Error</h1>
    <br />
    <h1>Ups, essa página não existe! Volta para a pagina <a href={{$route}}>Clique aqui</a></h1>

</body>
</html>
