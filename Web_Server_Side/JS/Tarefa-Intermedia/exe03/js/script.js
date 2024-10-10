myWishList = [
  { nome: "casa", preco: 200 },
  { nome: "xadrez", preco: 15 },
  { nome: "carro", preco: 12 },
  { nome: "aviao", preco: 30 },
];
console.log(myWishList);
const newList = myWishList.filter((element) => {
  return element.preco < 20;
});

console.log(newList);

console.log(myWishList.length);

var resultadoTela = document.getElementById("resultadoTela");
addEventListener("click", () => {
  for (element in newList) {
    document.getElementById("resultadoTela").style.fontSize = "1.5rem";
    resultadoTela.innerHTML += `<li> ${newList[element].nome} ${newList[element].preco} </li>`;
  }
  resultadoTela = "";
});
