// Global scope
var globalVar = "I am a global var";
let globalLet = "I am a global let";
const globalConst = "I am a global const";

function scopeExample() {
    // Function scope
    var functionVar = "I am a function var";
    let functionLet = "I am a function let";
    const functionConst = "I am a function const";

    if (true) {
        // Block scope
        var blockVar = "I am a block var";
        let blockLet = "I am a block let";
        const blockConst = "I am a block const";

        console.log(blockVar); // I am a block var
        console.log(blockLet); // I am a block let
        console.log(blockConst); // I am a block const
    }

    console.log(blockVar); // I am a block var
    // console.log(blockLet); // ReferenceError: blockLet is not defined
    // console.log(blockConst); // ReferenceError: blockConst is not defined

    console.log(functionVar); // I am a function var
    console.log(functionLet); // I am a function let
    console.log(functionConst); // I am a function const
}

scopeExample();

console.log(globalVar); // I am a global var
console.log(globalLet); // I am a global let
console.log(globalConst); // I am a global const

// console.log(functionVar); // ReferenceError: functionVar is not defined
// console.log(functionLet); // ReferenceError: functionLet is not defined
// console.log(functionConst); // ReferenceError: functionConst is not defined