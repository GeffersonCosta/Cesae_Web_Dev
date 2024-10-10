//________ARROW FUNCTION___________
// const greet = (nome) => {
//   console.log("Olá "+nome);
// };
// function ola(valor){
//   console.log("Ola " +valor);
// }
// ola("Hello");

// greet("gefferson");

//__________FILTER___________
// function validUserName(valor) {
//   const nomes = valor.filter(t => {
//     return t.length < 10;
//   });
//   console.log(nomes)
// }

// validUserName(["gefferson", "123456", "1234567981000"]);

//___________Metodos de Array Every___________

// function allEvens(valor) {
//   return valor.every(valor => valor % 2 === 0)
// }

// console.log(allEvens([2, 4, 6, 5])); // false
// console.log(allEvens([2, 4, 6, 6])); // true

//___________Metodos de Array REDUCE___________

function calcularMedia(nota) {
    console.log((nota.reduce((accumulator, currentvalor) => { return accumulator + currentvalor }))/nota.length)
}

// const calcMedia = (notes) =>{
//   // media = soma/ tamanho
//    return (notes.reduce((accumulator, currentVal) => {return accumulator + currentVal})) /  notes.length;
   
//   }

