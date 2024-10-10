var hexAleatorio;
var resultadoTela;
mensagens = [
  ["É só mais um esforço e a seguir será um programador de renome"],
  ["Acredite em você!"],
  ["Vai com tudo"],
  ["Você é capaz"],
  ["Faça acontecer!"],
  ["Nunca desista"],
  ["O poder é seu"],
  ["Confie no processo!"],
  ["Siga em frente!"],
  ["Mantenha o foco!"],
];
function texto() {
  hexAleatorio = Math.floor(Math.random() * 10);
  resultadoTela = document.getElementById("resultadoTela");
  resultadoTela.innerHTML = `<h2>${mensagens[hexAleatorio]}</h2>`;
  resultadoTela.style.fontSize = "2rem";
}
