// var nome = [];
// var item = null;
// item = prompt("adicionar: ");
// while (item != "fim") {
//   nome.push(item);
//   item = prompt("adicionar: ");
// }
// for (item in nome) {
//   console.log(nome[item]);
// }
let listBuy = [];
var itens;
function addList() {
  itens = document.getElementById("itensUser").value;
  listBuy.push(itens);
  itens = document.getElementById("itensUser").value = "";
}
function showList() {
  document.getElementById("resultadoTela").innerHTML = " ";
  for (element in listBuy) {
    document.getElementById("resultadoTela").innerHTML +=
      "</br>" + listBuy[element];
    document.getElementById("resultadoTela").style.fontWeight = "700";
  }
}
