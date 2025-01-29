// Let, Const, Var

let name1 = "Adicondro"

var name2 = "Adi" // don't use var, cause it can be redeclared

const name3 = "John"

// // what is the difference between let, const, var is that let and const are block scoped and var is function scoped.


// Non Primitive Variable

let arr = [1,2,3,4,5,6,7]

let arr2 = ["John", "Doe", "Adi"]

let obj = {
    name: "John",
    address: "USA",
    favoriteFood: ["Pizza", "Burger"]
}


let mappractice = new Map();

mappractice.set("name", "Adi");

console.log(mappractice.get("name"))
console.log(mappractice.has("name")) // output: true
console.log(mappractice.has("Adi")) // output: false, because it is not a key, must call the key

// Function

const greet = (name) => {
    return `Hello, ${name}`
}


// without arrow function
const greet2 = function(name){
    return `Hello, ${name}`
}

console.log(greet2("John"))











// If else

// Loops

// Switch Case

// Arrow Function

// Callbacks

// Function

// Parameters, rest, spread





// Let, var, const scope

// Global Local Scope

// Block Scope, Function Scope

// Closures