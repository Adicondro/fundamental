// Destructuring Arrays
const numbers = [1, 2, 3, 4, 5];
const [first, second, ...rest] = numbers;

console.log(first); // 1
console.log(second); // 2
console.log(rest); // [3, 4, 5]

// Destructuring Objects
const person = {
    name: 'John Doe',
    age: 30,
    address: {
        city: 'New York',
        country: 'USA'
    }
};

const { name, age, address: { city, country } } = person;

console.log(name); // John Doe
console.log(age); // 30
console.log(city); // New York
console.log(country); // USA

// Destructuring Function Parameters
function displayPerson({ name, age }) {
    console.log(`Name: ${name}, Age: ${age}`);
}

displayPerson(person); // Name: John Doe, Age: 30