var inicio;
var fim;
var valor = 0;
var valor2 = 1;
var valor3;
var primeiraPassagem = true

function Fibonacci() {
  inicio = parseInt(document.getElementById("rangeInicio").value);
  fim = parseInt(document.getElementById("rangeFim").value);
  cont = fim;
  while (cont >= inicio) {
    valor3 = valor + valor2;
    if(inicio == 0){
      if (valor == inicio) {
        document.getElementById("resultado").innerText += " "+ 0;
      }
      if(valor == inicio){
        document.getElementById("resultado").innerText += " "+ 1;
      }
    }else{
      if(primeiraPassagem){
        document.getElementById("resultado").innerText += " "+ 1;
        primeiraPassagem = false
      }
    }
    for (var i = inicio; i <= fim; i++) {
      if(i == valor3){
        document.getElementById("resultado").innerText += " "+ valor3;
      }
    }
    valor = valor2;
    valor2 = valor3;
    cont -= 1;
  }
}
