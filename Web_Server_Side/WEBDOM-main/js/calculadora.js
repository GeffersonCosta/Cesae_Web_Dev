let firstNumber = document.getElementById("firstNumber");
let secundNumber = document.getElementById("secundNumber");
let selectOption = document.getElementById("selectOption");
let resultOperation = document.getElementById("resultOperation");
let resultTela = document.getElementById("resultTela");

function operacao(){
  var resultadoPrint =0;
switch(selectOption.value){
    case "+":
      resultadoPrint = Number(firstNumber.value) + Number(secundNumber.value);
    break;
    case "-":
      resultadoPrint = Number(firstNumber.value) - Number(secundNumber.value);
    break;
    case "/":
      resultadoPrint = Number(firstNumber.value) / Number(secundNumber.value);
    break;
    case "x":
      resultadoPrint = Number(firstNumber.value) * Number(secundNumber.value);
    break;     
}
  resultTela.innerHTML += ` ${resultadoPrint}`
}


resultOperation.addEventListener('click', operacao)



