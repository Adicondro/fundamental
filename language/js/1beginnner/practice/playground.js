// Divider

const dividerAuto = (subjectName) => {
  console.log(`==============${subjectName}===============`);
};

// Let, Const, Var

dividerAuto("Variable");

let username = "Adicondro";
const pi = Math.random();

const combinedString = username + pi;

console.log(combinedString);

// Non Primitive Variable (Object, Function, Map, Set, Date, Regex)

dividerAuto("Non Primitive");

// // Object

const userData = {
  name: "Adicondro",
  age: 15,
  wordUsed: (name) => {
    return `Fuck you ${name}`;
  },
};

const User2 = userData.wordUsed("Adicondro");

console.log(User2);

// // Arrays

const aotCharacter = ["Eren", "Mikasa", "Levi", "Armin", "Erwin"];
console.log(aotCharacter);

// //

const sayHello = function (name) {
  return `My name is ${name}`;
};

const User1 = sayHello("Adicondro");

console.log(User1);

// Primitive Variable

dividerAuto("Primitive");

let num = 10;
result = num + 10;

console.log(result);

// Operators
dividerAuto("Operators");
let var1 = 10;
let var2 = 2;

var1 *= var2;
console.log(var1);

// Function (Expression, Declaration)

dividerAuto("Functions");
console.log(sumDeclaration(10, 2));

function sumDeclaration(a, b) {
  return a + b;
}

const sum = function (a, b) {
  return a + b;
};

const resultFunctions = sum(1, 2);
console.log(resultFunctions);

// If else

dividerAuto("If else");

const checkEven = (num) => {
  if (num % 0) {
    console.log("Yes your number is even");
  } else {
    console.log("Netnot");
  }
};

checkEven(2);

// Loops

dividerAuto("Loops");

// // Loops with i

for (let i = 0; i <= 10; i++) {
  if (i % 2 == 0) {
    console.log(i);
  } else {
    console.log("Ganjil");
  }
}

const water = ["Aqua", "Ades", "Le Minerale"];

for (let i = 0; i <= water.length; i++) {
  console.log(`${i} contains ${water[i]}`);
}

// // loops with array of

const seriesNetflix = ["King of Bla", "Dark", "Shawshank Redemption"];

for (const value of seriesNetflix) {
  console.log(`nilai ${seriesNetflix[value]}, Ada film ${value}`);
}

// // loops with array in

const kataKasar = ["Kontol", "Jembut", "Anjing"];

for (const kata in kataKasar) {
  console.log(`index ${kata}, nilai ${kataKasar[kata]}`);
}

// // nested loopså

const matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

for (let row = 0; row < matrix.length; row++) {
  for (let col = 0; col < matrix[row].length; col++) {
    console.log(`Value at matrix[${row}][${col}] is ${matrix[row][col]}`);
  }
}
// // Loops with Object (Loop In)

const person = {
  name: "Adicondro",
  age: 15,
  hobby: "Coding",
};

for (const key in person) {
  console.log(`${key} contains ${person[key]}`);
}

// // Loops with Object (Loop Of) -> This is not iterable

// const transjakarta = {
//   busName: "Boeing",
//   series: "1301231313",
//   speed: 12,
// };

// for (const key of transjakarta){
//   console.log(`${key} and how about ${transjakarta[key]}`)
// }

// While loop

dividerAuto("While Loop");

let i = 0;
while (i < 10) {
  console.log(`Iteration : ${i}`);
  i++;
}

// Do while

let numWhile = 5;

do {
  console.log(`This will run once`);
} while (numWhile < 5);

// Switch Case

dividerAuto("Switch Case");

let day = 2;

switch (day) {
  case 1:
    console.log("Monday");
    break;
  case 2:
    console.log("Tuesday");
    break;
}

// Arrow Function

dividerAuto("Arrow Function");

const sumNumber = (a, b) => {
  console.log(a + b);
};

sumNumber(1, 2);

// Callbacks

dividerAuto("Callbacks");

function greet(name, sayByeCallback) {
  console.log(`Hi,  ` + name);
  sayByeCallback();
}

function sayBye() {
  console.log("Goodbye");
}

greet("Alice", sayBye);

// Function

dividerAuto("Function");

function killGenerator(name) {
  return `Your friend ${name} has been killed`;
}

console.log(killGenerator("Anderson"));

// Parameters, rest, spread

// Parameters Declaration

dividerAuto("Parameter, Rest, Spread");

console.log(apaLagiYa(1, 2));

function apaLagiYa(a, b) {
  return a * b;
}

// Parameters Expression

const iniBukan = function bukanDeclarative(a, b) {
  return a / b;
};
console.log(iniBukan(2, 1));

// Rest
function sumAll(...numbers) {
  let total = 0;
  for (let num of numbers) {
    total += num;
  }
  return total;
}

console.log(sumAll(1, 2, 3, 4)); // Ini diubah jadi array kalo sudah di rest [1,2,3,4]

// Spread

const nums = [1, 2, 3];
console.log(Math.max(...nums)); // 1,2,3

// Let, var, const scope
dividerAuto("Scope");

// Global Local Scope

let panggilGlobal = "Hello World";

console.log(panggilGlobal);

// Block Scope, Function Scope

function iniBlock(a) {
  let valueBlock = 0; // Block Scope
  const pi = 3.14;
  var valueFunction = 733; // Function Scope
  return valueBlock * pi + a;
}

// console.log(valueBlock); -> You can't

// Closures

// Version 1

dividerAuto("Closures");

function outer() {
  let name = "Javascript";

  function inner() {
    console.log("Hello, " + name);
  }

  return inner;
}

const greetClosure = outer();
// console.log(greetClosure());
greetClosure();

// OR

outer()();

// outer(inner);

// Version 2

function xxx() {
  function yyy() {
    console.log("Crazy");
  }

  const anjay = yyy();
  return anjay;
}

const cobaxxx = xxx();
xxx();

// Version 3

function outer2() {
  let name2 = "Python";

  function inner2() {
    console.log("Hello, " + name2);
  }

  return {
    innerFunc: inner2,
    nameValue: name2,
  };
}

// const greetClosure2 = outer2();
// greetClosure2.innerFunc();

outer2().innerFunc();
// console.log(greetClosure2.nameValue);

// Arrays

dividerAuto("Arrays");

const NIM = [1301213152, 1301213144, 1301213155];

console.log(`NIM : ${NIM[1]}`);
