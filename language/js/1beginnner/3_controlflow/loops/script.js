// For loop
for (let i = 0; i < 5; i++) {
    console.log('For loop iteration:', i);
}

// While loop
let j = 0;
while (j < 5) {
    console.log('While loop iteration:', j);
    j++;
}

// Do-while loop
let k = 0;
do {
    console.log('Do-while loop iteration:', k);
    k++;
} while (k < 5);

// For-of loop (used for iterating over iterable objects like arrays)
const array = [1, 2, 3, 4, 5];
for (const value of array) {
    console.log('For-of loop value:', value);
}

// For-in loop (used for iterating over the properties of an object)
const object = {a: 1, b: 2, c: 3};
for (const key in object) {
    if (object.hasOwnProperty(key)) {
        console.log('For-in loop key:', key, 'value:', object[key]);
    }
}