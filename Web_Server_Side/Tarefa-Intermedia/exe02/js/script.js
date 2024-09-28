myWishList = ["casa", "xadrez", "carro", "aviao"];

for (var i = 0; i < myWishList.length; i++) {
  console.log(myWishList[i]);
}
console.log(myWishList.length);

var resultadoTela = document.getElementById("resultadoTela");

addEventListener("click", () => {
  resultadoTela.innerText = " ";
  for (var i = 0; i < myWishList.length; i++) {
    document.getElementById(
      "resultadoTela"
    ).innerHTML += `<li>${myWishList[i]}</li>`;
    resultadoTela.style.fontSize = "1.5rem";
  }

}
);
