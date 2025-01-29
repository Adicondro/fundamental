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