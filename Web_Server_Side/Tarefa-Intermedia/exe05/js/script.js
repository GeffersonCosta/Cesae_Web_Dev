isShortWeather(10);
function isShortWeather(temperatura) {
  if (temperatura > 25) {
    console.log(true);
  } else {
    console.log(false);
  }
}

/******************************************************/
var img = document.getElementById("resultadoTela");
function verificar() {
  resultado = document.getElementById("user");
  console.log(resultado.value);
  if (resultado.value > 25) {
    img.src = "./img/calor.jpg";
    img.style.width = "400px";
  } else {
    img.src = "./img/frio.jpg";
    img.style.width = "400px";
  }
}
