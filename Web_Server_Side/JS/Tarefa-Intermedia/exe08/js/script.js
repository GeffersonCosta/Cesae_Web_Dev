function changeColor(verificar) {
  var hexAleatorio = Math.floor(Math.random() * 1000000)
  if (verificar == "1") {
    document.getElementById("botao1").style.backgroundColor = `#${hexAleatorio}`;
  }
  if (verificar == "2") {
    document.getElementById("botao2").style.backgroundColor = `#${hexAleatorio}`;
  }
  if (verificar == "3") {
    document.getElementById("botao3").style.backgroundColor = `#${hexAleatorio}`;
  }
}


