"use strict";
// any
let printName = "Adicondro";
// enums
const tryObject = {
// ini object
};
// functions
function calculateTax(income, taxYear = 2022) {
    // let x; // x is undefined and will come out error because it is not used on local
    if (taxYear < 50000) {
        return income * 1.2;
    }
    else {
        return income * 1.4;
    }
}
// calculateTax(100_000, 2021, 1 : it will come out as an error
calculateTax(100000, 2021);
// object
let employee = {
    id: 1,
    // name: undefined, it can't be undefined
    name: 'John',
    age: 30,
    designation: 'Software Engineer',
    retire: (date) => {
        console.log('Retiring on', date);
    }
};
// tuples
let user = ["Adi", 1];
// arrays
let arr = [1, 2, 3, 4, "5"];
let arr2 = [];
arr2[0] = 1;
let arr3 = [];
arr3.forEach(n => n.toExponential(2));
