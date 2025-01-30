// Let, Const, Var

// Non Primitive Variable

// Primitive Variable

// Operators

// Function












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