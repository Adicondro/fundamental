// function = A Section of reusable code. Declare code once, use it whenever u want. call the function to execute code

// function happyBirthday(username, age){
//     console.log("Happy Birthday To You");
//     console.log("Happy Birthday To You");
//     console.log(`Happy Birthday To You ${username}`);
//     console.log("Happy Birthday To You");
//     console.log(`You are ${age} Years Old`);
// }

// happyBirthday("Adicondro", 21);
// happyBirthday("Niki", 20);
// happyBirthday("Patrick", 16);


function add(x, y){
    return x + y;

    // Result itu buat ngembaliin data ke function nya setelah dioperasikan (+, -, *, /)

}


function substract(x, y){
    return x - y;

    // Result itu buat ngembaliin data ke function nya setelah dioperasikan (+, -, *, /)

}

function multipy(x, y){
    return x * y;

    // Result itu buat ngembaliin data ke function nya setelah dioperasikan (+, -, *, /)

}

function divide(x, y){
    return x / y;
}

function isEven(number){
    if(number % 2 == 0){
        return true;
    } else {
        return false;
    }
}

function isValidEmail(email){
    if (email.includes("@")){
        return true;
    } else{
        return false;
    }
}

console.log(divide(2,3));
console.log(isEven(12));
console.log(isValidEmail("adicondro@gmail.com"))

