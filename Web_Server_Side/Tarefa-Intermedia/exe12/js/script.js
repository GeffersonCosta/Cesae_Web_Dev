var text;
var flag = true;
function aprendido() {
  text = document.querySelectorAll("li");
  console.log(text);
  text.forEach((text) => {
    if (flag) {
      text.innerText += " aprendido";
    }
  });
  flag = false;
}
