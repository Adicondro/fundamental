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

// // Loops with Object (Loop In)

// While loop
let i = 0;
while (i < 10) {
  console.log(`Iteration : ${i}`);
  i++;
}

// Do while

// Switch Case

// Arrow Function

// Callbacks

// Function

// Parameters, rest, spread

// Let, var, const scope

// Global Local Scope

// Block Scope, Function Scope

// Closures

// Arrays
