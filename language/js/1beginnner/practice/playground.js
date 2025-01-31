// Let, Const, Var

// Non Primitive Variable

// Primitive Variable

// Operators

// Function


const greet = function(name) {
    console.log("Hello " + name);
}

greet("Alice");


function greet2 (name) {
    console.log("Hello " + name);
}

greet2("Bob");

let u





// If else

// Loops

// While loop

// Do while

// Switch Case

// Arrow Function

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