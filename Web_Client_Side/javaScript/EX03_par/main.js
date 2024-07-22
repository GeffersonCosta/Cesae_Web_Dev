function numeroPar() {
  let inicio = document.getElementById("rangeInicio").value;
  console.log(inicio)
  let fim = document.getElementById("rangeFim").value;
  console.log(fim)

  let numerosPares = " ";

  for (var i = inicio; i <= fim; i++) {
    if (i % 2 === 0) {
      numerosPares += i + " ";
    }
  }

  document.getElementById("resultado").innerText += "Numeros pares são: " + numerosPares
  console.log(numerosPares)
}
