// Sample array of objects
const users = [
    { id: 1, name: 'Alice', age: 25 },
    { id: 2, name: 'Bob', age: 30 },
    { id: 3, name: 'Charlie', age: 35 },
    { id: 4, name: 'David', age: 40 }
];

// map: Create a new array with the names of the users
const names = users.map(user => user.name);
console.log('Names:', names); // Output: ['Alice', 'Bob', 'Charlie', 'David']

// filter: Get users who are 30 years old or older
const adults = users.filter(user => user.age >= 30);
console.log('Adults:', adults); // Output: [{ id: 2, name: 'Bob', age: 30 }, { id: 3, name: 'Charlie', age: 35 }, { id: 4, name: 'David', age: 40 }]

// reduce: Calculate the total age of all users
const totalAge = users.reduce((sum, user) => sum + user.age, 0);
console.log('Total Age:', totalAge); // Output: 130

// forEach: Print each user's name and age
users.forEach(user => {
    console.log(`${user.name} is ${user.age} years old`);
});
// Output:
// Alice is 25 years old
// Bob is 30 years old
// Charlie is 35 years old
// David is 40 years old

// find: Find the user with the name 'Charlie'
const charlie = users.find(user => user.name === 'Charlie');
console.log('Charlie:', charlie); // Output: { id: 3, name: 'Charlie', age: 35 }

// includes: Check if the array of names includes 'Alice'
const hasAlice = names.includes('Alice');
console.log('Has Alice:', hasAlice); // Output: true