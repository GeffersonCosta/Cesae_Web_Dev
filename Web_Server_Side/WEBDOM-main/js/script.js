
// let bannerSelection = document.getElementById('banner');

// if(bannerSelection){
//     console.log(bannerSelection);
// }


// let image = document.getElementById('unicorn');
// let heading = document.getElementById('mainheading');


// console.log(image)
// console.log(heading)

// let doneTodos = document.querySelectorAll('.done');

// let checkbox = document.querySelector("input[type='checkbox']");


// console.log(doneTodos)
// console.log(checkbox)

// let myTextVar = document.querySelector('a');
//myTextVar.innerText = 'cucu vamos manipular coisas';
//myTextVar.innerHTML = 'cucu vamos manipular coisas e trocar elementos';

// myTextVar.href = 'www.cesaedigital.pt';

// let myVar = document.querySelector('span');
// myVar.innerText = 'yackk';


function changeImage(){
    let myImage = document.querySelector('img');

    if(myImage.src == 'https://devsprouthosting.com/images/chicken.jpg'){
        myImage.setAttribute('src', 'https://devsprouthosting.com/images/egg.jpg');
    }else{
        myImage.setAttribute('src', 'https://devsprouthosting.com/images/chicken.jpg');
    }
}

//pp25DOM - aula 26.09 - exercicio rainbow
const colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

let spans = document.querySelectorAll('span');
//console.log(spans);

for(let i = 0; i < spans.length; i++) {
    spans[i].style.color = colors[i];
}



//  pp27DOM - aula 26.09 - exercicio classList 
// Tentar refazer com ForIn e ForOff
const listItems = document.querySelectorAll('li');

//OPÇÃO 01
for (let i = 0; i < listItems.length; i++) {
    if (listItems[i].classList.contains('highlight')) {
        listItems[i].classList.remove('highlight');
    } else {
        listItems[i].classList.add('highlight');
    }
}

//OPÇÃO 02
/* for (element of listItems) {
    if (element.classList.contains('highlight')) {
        element.classList.remove('highlight');
    } else {
        element.classList.add('highlight');
    }
} */

/* //  pp28DOM - aula 26.09 - exercicio manipular pais e filhos
let myLiTest = document.querySelector('.tocsection-1');
console.log(myLiTest);
console.log(myLiTest.parentElement);
console.log(myLiTest.children); */


//  pp30DOM - aula 26.09 - exercicio adicionar e remover elementos
for (let i = 1; i <= 100; i++) {
    const buttons = document.createElement('button');
    buttons.innerText = 'Clique aqui!';

    //opção 02
    //const myContainer = document.querySelector('#container');
    const myContainer = document.getElementById('container');
    myContainer.appendChild(buttons);

    buttons.setAttribute('class', 'button');
}