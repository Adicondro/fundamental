// Global scope
var globalVariable = "I am a global variable";

function checkScope() {
    // Local scope
    var localVariable = "I am a local variable";
    
    console.log(globalVariable); // Accessible
    console.log(localVariable);  // Accessible
}

checkScope();

console.log(globalVariable); // Accessible
console.log(localVariable);  // Uncaught ReferenceError: localVariable is not defined


// Block scope

if (true) {
    // Block scope
    var blockVariable = "I am a block variable";
    let blockLet = "I am a block let";
    const blockConst = "I am a block const";

}

console.log(blockVariable); // Accessible
console.log(blockLet); // Uncaught ReferenceError: blockLet is not defined
console.log(blockConst); // Uncaught ReferenceError: blockConst is not defined