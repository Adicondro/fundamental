// A function that takes another function as an argument
function greet(name, callback) {
    console.log('Hello ' + name);
    callback();
}

// A callback function
function sayGoodbye() {
    console.log('Goodbye!');
}

// Using the greet function with the sayGoodbye callback
greet('Alice', sayGoodbye);


// Callback = passing a function as an argument to another function


sum(displayPage, 200, 34);

function sum(callback, x, y){
    let result = x + y;
    callback (result);
}

function displayConsole(result){
    console.log(result);
}

function displayPage(result){
    document.getElementById("myH1").textContent = result;
}