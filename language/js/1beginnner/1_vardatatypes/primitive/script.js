// 1. String
let str = "Hello";
str[0] = "h"; // Doesn't change the string
console.log(str); // Output: Hello

// 2. Number
let num = 5;
num = num + 10; // Creates a new value, num is now 15
console.log(num); // Output: 15

// 3. Boolean
let isActive = true;
isActive = false; // Re-assigns a new value
console.log(isActive); // Output: false

// 4. Undefined
let a;
console.log(a); // Output: undefined

a = 10;
console.log(a); // Output: 10

// 5. Null
let person = null;
console.log(person); // Output: null

// 6. Symbol
const symbol1 = Symbol("id");
const symbol2 = Symbol("id");
console.log(symbol1 === symbol2); // Output: false (each symbol is unique)

// 7. BigInt (ES11)
let bigIntValue = 1234567890123456789012345678901234567890n;
console.log(bigIntValue); // Output: 1234567890123456789012345678901234567890n

// Copy by value example
let x = 10;
let y = x; // y gets a copy of the value in x
y = 20; // Changing y does not affect x
console.log(x); // Output: 10
console.log(y); // Output: 20