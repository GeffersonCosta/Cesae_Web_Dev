function calcular() {
  let valorA = parseInt(document.getElementById("inputValorA").value)
  let valorB = parseInt(document.getElementById("inputValorB").value)
  let total = valorA + valorB
  //alert("")
   document.getElementById("resultado").innerHTML = "O resultado é: " + total
}
