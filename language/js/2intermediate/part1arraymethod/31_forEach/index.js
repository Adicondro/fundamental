let fruits = ["apple", "orange", "banana", "coconut"];



function upperCase(element, index, array){
    array[index] = element.toUpperCase();
}

function lowerCase(element, index, array){
    array[index] = element.toLowerCase();
}

function capitalize(element, index, array){
    array[index] = element.charAt(0).toUpperCase() + element.slice(1);
}

function display(element){
    console.log(element);
}

fruits.forEach(capitalize);
fruits.forEach(display);