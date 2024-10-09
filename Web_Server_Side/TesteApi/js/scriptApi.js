const characterId = document.getElementById("characterId");
const btnGo = document.getElementById("btn-go");
const content = document.getElementById("content");
const image = document.getElementById("img");
var data;

const fetchApi = (value) => {
  const result = fetch(`https://rickandmortyapi.com/api/character/${value}`)
    .then((res) => res.json())
    .then((data) => {
      // console.log(data);
      return data;
    });
  return result;
};
btnGo.addEventListener("click", async (event) => {
  //nameTitulo = document.getElementById("name")
  event.preventDefault();
  const result = await fetchApi(characterId.value);
  `${JSON.stringify((data = result), undefined, 2)}`;
   document.getElementById("name").innerHTML = `<h1>${data.name}</h1>`;
   image.src = data.image
});
