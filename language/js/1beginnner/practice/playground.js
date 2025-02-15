// Let, Const, Var

let name = "Alice";

// Non Primitive Variable



// Primitive Variable

// Operators

let a = 14;
let b = 5;

console.log(a + b);

// Function (Expression, Declaration)


const greet = function(name) {
    console.log("Hello " + name);
}

greet("Alice");

const trying = () => {
    console.log("Adicondro")
}

trying();


function greet2 (name) {
    console.log("Hello " + name);
}

greet2("Bob");





// If else

let age = 10;

if(age > 18) {
    console.log("Adult");
}else{
    console.log("You're not adult");;
}

// Loops

for (let i = 0; i < 10; i++) {
    console.log(i);
}

// While loop

while(i < 10) {
    console.log(i);
    i++;
}

// Do while

// Switch Case

// Arrow Function

const arrowFunction = () =>{
    for (let i = 0; i <10; i++) {
        console.log(i);
    };
}


const fruit1 = [apple, banana, tomato];

const mappingFruit = fruit1.map( () => {
    return Math.pow(element, 4);
});



console.log(mappingFruit);

// Callbacks

function fetchData(callback) {

    setTimeout(() => {        
        console.log("Data loaded!"); // Muncul setelah proses selesai
        callback();
    }, 2000);
}

console.log("Start");
fetchData(() => {
    console.log("End");
});



// Function


let number = [1, 2, 3, 4, 5, 6];

const pangkat = number.map((element) => {
    return Math.pow(element, 4);
})

console.log(pangkat);

// Parameters, rest, spread








// Let, var, const scope



// Global Local Scope

// Block Scope, Function Scope





// Closures

let count = 0; // Variabel global

function increment() {
    count++; // Bisa diubah di mana saja
    console.log(count);
}

increment(); // 1
increment(); // 2

count = 100; // ❌ Masalah! Variabel bisa diubah dari luar
increment(); // 101 (tidak sesuai harapan)


// Solusi: Closure


function solution() {
    let count = 0; // Variabel lokal

    return () => {
        count++; // Bisa diubah hanya di dalam fungsi
        console.log(count);
    };
}   

solution(); // Closure, result: 1
solution(); // Closure, result: 2
solution(); // Closure, result: 3

count = 100; // ❌ Masalah! Variabel tidak bisa diubah dari luar

// Arrays

const fruit = ["Apple", "Banana", "Cherry", "Durian", "Elderberry"];

fruit.push("Fig");

fruit[0] = "Avocado";

fruit.map((element) => {
    console.log(element);
});
