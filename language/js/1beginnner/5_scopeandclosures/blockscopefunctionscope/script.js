
function exampleFunction() {
    if (true) {
        let blockScopedVariable = 'I am block scoped';
        var functionScopedVariable = 'I am function scoped';
    }
    console.log(functionScopedVariable); // 'I am function scoped'
    try {
        console.log(blockScopedVariable); // ReferenceError: blockScopedVariable is not defined
    } catch (e) {
        console.error(e.message); // Output the error message
    }
}

exampleFunction();