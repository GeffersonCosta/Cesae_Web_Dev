var user;
var resultado;
function aprendido() {
  resultado = document.getElementById("resultado");
  user = prompt("O que mais aprendeu?");
  resultado.innerHTML += `<li>${user}</li>`;
}
