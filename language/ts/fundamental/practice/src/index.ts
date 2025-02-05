// any

let printName = "Adicondro"

// enums

const tryObject = {
    // ini object
}

const enum Size {
    Small = 1,
    Medium = 2,
    Large = 3
}

// functions

function calculateTax(income: number, taxYear = 2022): number {
    // let x; // x is undefined and will come out error because it is not used on local
    if(taxYear < 50_000){
        return income * 1.2;
    }else{
        return income * 1.4;
    }
}

// calculateTax(100_000, 2021, 1 : it will come out as an error
calculateTax(100_000, 2021)


// object

let employee: {
    readonly id: number,
    name: string,
    age: number,
    designation: string,
    retire: (date:Date) => void
} = {
    id: 1,
    // name: undefined, it can't be undefined
    name: 'John',
    age: 30,
    designation: 'Software Engineer',
    retire: (date: Date) => {
        console.log('Retiring on', date);
    }
}

// tuples

let user: [
    string, 
    number
] = ["Adi", 1]

// arrays


let arr = [1,2,3,4,"5"];



let arr2:number[] = [];

arr2[0] = 1;



let arr3: number[] = [];
arr3.forEach(n => n.toExponential(2));

