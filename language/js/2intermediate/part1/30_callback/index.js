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

