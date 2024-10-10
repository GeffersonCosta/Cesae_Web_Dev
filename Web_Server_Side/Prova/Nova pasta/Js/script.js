/*1- O JavaScript tem a função de criar interatividade com as paginas Web*/




/*2 - O elemento input pode ser criado tanto no JS quanto no HTML, podemos tanto usar o JS para criar o elemento input quando o estudante fizer o login, como podemos deixar o input no html com display 'none' e aplicar uma classe com display block com o js*/



/*3-
1.1 F console.log(num1+num2) = 53
1.2 F retorna somente age
1.3 F retorna somente age
1.4 V retorna age

1.5 se somente acrescenta recebe 15, se fizer um "incremento" recebe 315
num2 = 15 acrescenta
num2 += 15 incrementa

1.6 F valor 515, será irá concatenar 5 com 15 no caso do valor ser somente acrescentado 

1.7 num2+(Number(num1)-4)
1.8 boolean
*/




/*
4 - 

4.1 passwords.push('henrique123')



4.2 - let passwords = [1234, 'sara1986', 2023]
passwords.push('henrique123')
let userPassword = prompt('Qual é a password')
for(var i=0; i< passwords.length; i++){
 if(passwords[i] == userPassword){
  alert('acertou');
 }
 else{
  alert('errou');
 }
 
}

4.3 let safePasses = ['1234589', '123456789870', '123', '1234']
console.log(safePasses)
 for(var i=0; i<safePasses.length; i++){
    if(safePasses[i].length > 6){
      console.log(safePasses[i])
    }
 } 

*/
/* 5- 
5.2 undefined
5.3  V
*/

/*
6 - 
6.1 - document.querySelector('.achievements').innerHTML = "Os meus ensinamentos para a vida"
6.2 - text = document.querySelectorAll("li");
text.forEach((text) => {
    text.innerText += "com sucesso!";
});

6.3 - addEventListener('submit', (event) =>{
  event.preventDefault();
  var item = document.getElementById('items')
  var lista = document.getElementById('mylist')
  lista.innerHTML += `<li>${item.value}</li>`
})
})

*/

/*
7 - "name" TIE bomber
-----------  OBJETO ------------

"name": "TIE bomber",
	"model": "TIE/sa bomber",
	"manufacturer": "Sienar Fleet Systems",
	"cost_in_credits": "unknown",
	"length": "7.8",
	"max_atmosphering_speed": "850",
	"crew": "1",
	"passengers": "0",
	"cargo_capacity": "none",
	"consumables": "2 days",
	"vehicle_class": "space/planetary bomber",
	"pilots": [],
	"films": [
		"https://swapi.dev/api/films/2/",
		"https://swapi.dev/api/films/3/"
	],
	"created": "2014-12-15T12:33:15.838000Z",
	"edited": "2014-12-20T21:30:21.675000Z",
	"url": "https://swapi.dev/api/vehicles/16/"
}
What is this?

*/ 
























