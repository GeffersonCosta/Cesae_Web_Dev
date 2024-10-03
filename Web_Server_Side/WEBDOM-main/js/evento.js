let buttonHello = document.getElementById("hello");
let buttonBye = document.getElementById("goodbye");
let buttonChangeColor = document.getElementById("change-color");
let backgroundTela = document.getElementById("container");

function hello(){
  alert("Olá");
}
function bye(){
  alert("Adeus")
}
function changeColor(){
  hexAleatorio = Math.floor(Math.random() * 1000000)
  backgroundTela.style.backgroundColor = `#${hexAleatorio}`;
}

buttonHello.addEventListener('mouseover', hello);
buttonBye.addEventListener('mouseover', bye);
backgroundTela.addEventListener('click', changeColor)









