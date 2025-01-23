// object

const person = {
    name: 'John',
    age: 30,
    isStudent: false,
    emptyValue: null,
    greet: function() {
        console.log('Hello!');
    }
}

console.log(person.name)

// array

const fruits = ['Apple', 'Banana', 'Cherry', 'Durian', 'Elderberry'];
console.log(fruits[0]);
fruits.push('Fig');
console.log(fruits);

// function

const greet = function(name){
    return `Hello, ${name}!`;
}

console.log(greet('John'));

// New non-primitive data types

// map

const map = new Map();
map.set('name', 'John');
map.set(1, 'One');

console.log(map.get('name'));
console.log(map.has(1));

// set

const set = new Set();
set.add('John');
set.add('Jane');
set.add('John');

console.log(set);

// date

const today = new Date();
console.log(today);
console.log(today.getFullYear());

// regex
const regex = /hello/i;
const str = 'Hello, World!';
console.log(regex.test(str));