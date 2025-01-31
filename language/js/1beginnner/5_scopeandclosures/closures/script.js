function outerFunction(outerVariable) {

    return function innerFunction(innerVariable) {
        console.log('Outer Variable: ' + outerVariable);
        console.log('Inner Variable: ' + innerVariable);
    };
}

const newFunction = outerFunction('outside');
newFunction('inside');


function createCounter() {
    let count = 0;

    return {
        increment: function() {
            count++;
            console.log('Count: ' + count);
        },
        decrement: function() {
            count--;
            console.log('Count: ' + count);
        },
        getCount: function() {
            return count;
        }
    };
}

const counter = createCounter();
counter.increment(); // Count: 1
counter.increment(); // Count: 2
let count = 100; // This will not affect the count inside the closure
counter.decrement(); // Count: 1
console.log('Current Count: ' + counter.getCount()); // Current Count: 1