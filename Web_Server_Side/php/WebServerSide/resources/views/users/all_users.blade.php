<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>



        <h3>Sou uma blade para todos os users</h3>
        <h3>Informações do Cesae</h3>
        <ul>
            @foreach ($cesaeInfo as $info)
            <li>{{$info}}</li>
            @endforeach
        </ul>






</body>
</html>
