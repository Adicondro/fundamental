const dividerAuto = (subjectName) => {
  console.log(`==============${subjectName}===============`);
};

let fruits = ["apple", "banana", "orange", "banana"];

// Length

dividerAuto("Length");
console.log(fruits.length);

// Push
dividerAuto("Push");
console.log(fruits);
fruits.push("pushhhhhh");
console.log(fruits);

// Pop
dividerAuto("Pop");
console.log(fruits);
fruits.pop();
console.log(fruits);

// Shift
dividerAuto("Shift");
console.log(fruits);
fruits.shift();
console.log(fruits);

// Unshift
dividerAuto("Unshift");
console.log(fruits);
fruits.unshift("kiwi");
console.log(fruits);

// IndexOf
dividerAuto("IndexOf");
console.log(fruits.indexOf("banana"));

// Includes
dividerAuto("Includes");
console.log(fruits.includes("orange"));

// Slice
dividerAuto("Slice");
console.log(fruits);
let sliced = fruits.slice(1, 3);
console.log(sliced);

// Splice
dividerAuto("Splice");
console.log(fruits);
fruits.splice(2, 1, "mango");
console.log(fruits);

// Join
dividerAuto("Join");
console.log(fruits.join(" - "));

// Reverse
dividerAuto("Reverse");
fruits.reverse();
console.log(fruits);

// Sort
dividerAuto("Sort");
fruits.sort();
console.log(fruits);

dividerAuto("Test");

const createHelloWorld = () => {
  return function () {
    return "Hello World";
  };
};

const f = createHelloWorld();
console.log(f());
