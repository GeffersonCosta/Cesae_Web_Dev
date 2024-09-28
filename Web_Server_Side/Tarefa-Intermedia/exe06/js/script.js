var mostrarInput;
function dizerOla() {
  mostrarInput = document.getElementById("verificarUtilizadorNome");
  console.log(mostrarInput.value);
  if (mostrarInput.value != "") {
    alert(`Olá, ${mostrarInput.value}`);
  }
}
function ativarInput() {
  mostrarInput.style.display = "block";
}
