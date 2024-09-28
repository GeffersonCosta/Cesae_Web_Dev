var total = 0;
var resultadoNaTela;
function sumArray(arry) {
  for (var i = 0; i < arry.length; i++) {
    total += arry[i];
  }
  console.log(`total: ${total}`);
  resultadoNaTela = document.getElementById("resultadoNaTela");
  resultadoNaTela.innerText = `Total: ${total}`;
  resultadoNaTela.style.fontSize = "1.5rem"
}
sumArray([1,2,3,4,5,6,7,8,9]);