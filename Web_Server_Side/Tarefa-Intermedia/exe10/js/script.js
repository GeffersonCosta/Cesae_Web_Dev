var hexAleatorio;
var resultadoTela;
var visible;
mensagens = [
  ["É só mais um esforço e a seguir serie um programador de renome"],
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
  resultadoTela.innerHTML = `<p>${mensagens[hexAleatorio]}</p>`;
  resultadoTela.style.fontSize = "2rem";
  visible = document.querySelectorAll("button");
  visible.forEach((visible) => {
    visible.style.display = "block";
  });
}

function aumentar() {
  resultadoTela = document.getElementById("resultadoTela");
  resultadoTela.style.fontSize = "4rem";
  resultadoTela.style.textAlign = "center";
}
function reduzir() {
  resultadoTela = document.getElementById("resultadoTela");
  resultadoTela.style.fontSize = "1rem";
}
