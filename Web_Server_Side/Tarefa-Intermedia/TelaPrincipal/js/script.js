var mostrarConteudo;
var mostraModoLink;
function modoIframe() {
  mostrarConteudo = document.getElementById("main-conteudo");
  mostraModoLink = document.getElementById("modoLink");
  var verificar = window.getComputedStyle(mostraModoLink);
  if (verificar.display == "block") {
    mostraModoLink.style.display = "none";
    mostrarConteudo.style.display = "block";
  } else {
    mostrarConteudo.style.display = "block";
  }
}
function modoLink() {
  mostraModoLink = document.getElementById("modoLink");
  mostrarConteudo = document.getElementById("main-conteudo");
  var verificar = window.getComputedStyle(mostrarConteudo);
  if (verificar.display == "block") {
    mostrarConteudo.style.display = "none";
    mostraModoLink.style.display = "block";
  } else {
    mostraModoLink.style.display = "block";
  }
}
