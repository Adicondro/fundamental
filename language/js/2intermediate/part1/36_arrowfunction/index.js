// arrow functions = a concise way to write function expressions
// good for simple expression kaya console.log that you use only once (parameters) => some code

// const hello = (function(){
//     console.log("Hello");
// });

// hello();

const numbers = [1,2,3,4,5]

const squares = numbers.map((element) => Math.pow(element, 2));
const cubes = numbers.map((element) => Math.pow(element, 3));
const evenNums = numbers.filter((element) => element % 2 === 0);
const oddNums = numbers.filter((element) => element % 2 !== 0);
const total = numbers.reduce((accumulator, element) => accumulator + element);

// kalo misal parameternya gada, jadi harus dipanggil pas di bawah cuma hello() misalkan, itu mending pake arrow

// JADI GAUSAH NULIS FUNCTION

