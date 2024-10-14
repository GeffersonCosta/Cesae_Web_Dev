<!DOCTYPE html>
<html lang="pt-PT">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Primeiro contato PHP</title>
</head>
<?php
$nome = "Gefferson";

$listaDeAtividades = ["ler","escrever","ouvir musica","ver tv","Hello"];

foreach($listaDeAtividades as $atividade)
{
    echo $atividade . "<br />";
}
?>
<body>
  <h1>Hello <?=$nome?></h1>

</body>
</html>