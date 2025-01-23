// 1. Arithmetic Operators
let a = 10, b = 5;
console.log(a + b);  // Addition: 15
console.log(a - b);  // Subtraction: 5
console.log(a * b);  // Multiplication: 50
console.log(a / b);  // Division: 2
console.log(a % b);  // Modulus: 0
console.log(a ** b); // Exponentiation: 100000

// 2. Assignment Operators
let x = 10;
x += 5;  // x = x + 5 → 15
console.log(x);
x -= 3;  // x = x - 3 → 12
console.log(x);
x *= 2;  // x = x * 2 → 24
console.log(x);
x /= 4;  // x = x / 4 → 6
console.log(x);
x %= 3;  // x = x % 3 → 0
console.log(x);
x **= 2; // x = x ** 2 → 0
console.log(x);

// 3. Comparison Operators
console.log(5 == "5");  // Loose equality: true
console.log(5 === "5"); // Strict equality: false
console.log(5 != "5");  // Loose inequality: false
console.log(5 !== "5"); // Strict inequality: true
console.log(10 > 5);    // Greater than: true
console.log(10 < 5);    // Less than: false
console.log(10 >= 5);   // Greater than or equal to: true
console.log(10 <= 5);   // Less than or equal to: false

// 4. Logical Operators
let condition1 = true, condition2 = false;
console.log(condition1 && condition2); // AND: false
console.log(condition1 || condition2); // OR: true
console.log(!condition1);               // NOT: false

// 5. Bitwise Operators
console.log(5 & 3);   // Bitwise AND: 1
console.log(5 | 3);   // Bitwise OR: 7
console.log(5 ^ 3);   // Bitwise XOR: 6
console.log(~5);      // Bitwise NOT: -6
console.log(5 << 1);  // Left Shift: 10
console.log(5 >> 1);  // Right Shift: 2
console.log(-5 >>> 1); // Unsigned Right Shift: 2147483643

// 6. Unary Operators
let num = 5;
console.log(+num);    // Unary plus: 5
console.log(-num);    // Unary negation: -5
num++;
console.log(num);     // Increment: 6
num--;
console.log(num);     // Decrement: 5
console.log(typeof num); // Typeof: "number"
console.log(void 0);   // Void: undefined
delete num;           // Delete: Deletes the property (but not used here as num is a primitive)

// 7. Conditional (Ternary) Operator
let result = (a > b) ? "a is greater" : "b is greater";
console.log(result); // Output: a is greater

// 8. Spread and Rest Operators
let arr1 = [1, 2, 3];
let arr2 = [...arr1, 4, 5]; // Spread operator
console.log(arr2); // Output: [1, 2, 3, 4, 5]

function sum(...args) {   // Rest operator
    return args.reduce((a, b) => a + b, 0);
}
console.log(sum(1, 2, 3, 4)); // Output: 10

// 9. Instanceof Operator
console.log([1, 2, 3] instanceof Array); // true
console.log(5 instanceof Number); // false

// 10. Comma Operator
let x1 = 1, y1 = 2;
let z1 = (x1++, y1++, x1 + y1); // Comma operator
console.log(z1); // Output: 5