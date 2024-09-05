let listBuy = [];
var itens = "";
function addList() {
  itens = document.getElementById("itensUser").value;
  console.log(itens)
  if (itens != "") {
    listBuy.push(itens);
    itens = document.getElementById("itensUser").value = "";
  }
}
function showList() {
  document.getElementById("resultadoTela").innerHTML = " ";
  for (element in listBuy) {
    document.getElementById("resultadoTela").innerHTML +=
      "</br>" + listBuy[element];
    document.getElementById("resultadoTela").style.fontWeight = "700";
  }
}
function remove(value) {
  if (value == "inicio") {
    listBuy.shift();
    showList()
  }
  if (value == "fim") {
    listBuy.pop();
    showList()
  }
}
