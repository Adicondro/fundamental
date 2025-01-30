// Spread ...
// Allow an iterable such as an array or string to be expanded into seeparated element

// Intinya misahin array jadi beberapa bagian

let numbers = [1, 2, 3, 4];

let maximum = Math.max(...numbers);
let minimum = Math.min(...numbers);

console.log(maximum);
console.log(minimum);

let username = "adicondro";
let letters = [...username];

console.log(letters);

let fruits = ["Apple", "Orange", "Peach"];
let vegetables = ["Carrot", "Spinach", "Tomato"];

let healthyFoods = [...fruits, ...vegetables, "Eggs", "Milk"];

console.log(healthyFoods);