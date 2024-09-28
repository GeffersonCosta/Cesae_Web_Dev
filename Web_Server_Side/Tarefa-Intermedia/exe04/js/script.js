
/*ARRAY ORIGINAL*/
myWishList = [
  { nome: "casa", preco: 200 },
  { nome: "xadrez", preco: 15 },
  { nome: "carro", preco: 12 },
  { nome: "carro", preco: 30 },
];

/*ARRAY COPIA COM VALOR MENOR QUE 20*/
const newList = myWishList.filter((element) => {
  return element.preco < 20;
});

//Pegando os valore do a newList e usando na funcao multiply
var valorTotal;
multiply(newList[0].preco,newList[1].preco)
function multiply(valor1, valor2){
  valorTotal = valor1*valor2;
  console.log("multiplicação do valor da lista: "+valorTotal);
}
/********************************************************************/











/**Mostrar lista na tela*/
var resultadoTela = document.getElementById("resultadoTela");
addEventListener("click", () => {
  for (element in newList) {
    document.getElementById("resultadoTela").style.fontSize = "1.5rem";
    resultadoTela.innerHTML += `<li> ${newList[element].nome} ${newList[element].preco} </li>`;
  }
  
  resultadoTela = "";
});
resultadoTela.innerHTML = `<p>Multiplicação do valor da lista ${valorTotal}</p>`
