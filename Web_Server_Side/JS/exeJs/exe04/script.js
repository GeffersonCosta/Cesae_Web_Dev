const pessoa = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];

for (var i = 0; i < pessoa.length; i++) {
  console.log(pessoa[i].toUpperCase());
}
console.log()
for(element in pessoa){
  console.log(pessoa[element].toUpperCase())
}
