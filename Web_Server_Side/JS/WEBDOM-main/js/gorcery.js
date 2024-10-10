const form = document.querySelector("form");
var produto;
var quantidade;
var lista = document.getElementById("lista");

form.addEventListener("submit", function (event) {
  produto = document.getElementById("itens");
  quantidade = document.getElementById("quantidade");
  event.preventDefault();
  console.log("submetido");
  lista.innerHTML += `<li>${quantidade.value} ${produto.value}</li>`;
  produto.value = " ";
  quantidade.value = " ";
});
