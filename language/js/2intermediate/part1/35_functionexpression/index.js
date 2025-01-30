// singkat function yang 1 kali pakai doang

// 1. callback in asynchronous operations
// 2. higher-order function
// 3. closures
// 4. event-listeners

const number = [1,2,3,4,5,6];

// const squares = number.map(function (element){
//     return Math.pow(element, 4);
// });

const squares = number.map(function (element){
    return Math.pow(element,4);
});

console.log(squares);

