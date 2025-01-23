

// global scope

let globalLet = "I am global";
const globalConst = "I am also global";
var globalVar = "I am globally scoped";

console.log(globalLet); // Output: I am global
console.log(globalConst); // Output: I am also global
console.log(globalVar); // Output: I am globally scoped

function showGlobal() {
    console.log(globalLet); // Output: I am global
    console.log(globalConst); // Output: I am also global
    console.log(globalVar); // Output: I am globally scoped
}

showGlobal();

// block scope


if (true) {
    var blockVar = "I am not block scoped"; // Dideklarasikan di dalam blok
    let blockLet = "I am block scoped"; // Dideklarasikan di dalam blok
    const blockConst = "I am block scoped"; // Dideklarasikan di dalam blok
    console.log(blockVar); // Output: I am not block scoped (bisa diakses di dalam blok)
}

console.log(blockVar); // Output: I am not block scoped (masih bisa diakses di luar blok)
console.log(blockLet); // Error: blockLet is not defined
console.log(blockConst); // Error: blockConst is not defined





// local scope

function localScopeExample() {
    let localLet = "I am local to this function";
    const localConst = "I am also local to this function";
    var localVar = "I am function scoped";
    console.log(localLet); // Output: I am local to this function
    console.log(localConst); // Output: I am also local to this function
    console.log(localVar); // Output: I am function scoped
}

localScopeExample();
console.log(localLet); // Error: localLet is not defined
console.log(localConst); // Error: localConst is not defined
console.log(localVar); // Error: localVar is not defined


// function scope

function functionScopeExample() {
    if (true) {
        var functionVar = "I am function scoped";
        const functionConst = "I am block scoped";
        console.log(functionVar); // Output: I am function scoped
    }
    console.log(functionVar); // Output: I am function scoped (masih bisa diakses)
    console.log(functionConst); // Error: functionConst is not defined
}

functionScopeExample();
console.log(functionVar); // Error: functionVar is not defined

// internal scope
// global scope -> bisa semua karena kamu scope secara global
// local scope -> yang bisa di scope secara lokal itu semua tapi posisi kamu harus di lokal

// external scope
// block scope -> let, const, kalo var masih bisa diakses
// function scope -> yang bisa diakses hanya var