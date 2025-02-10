

console.log(module);

console.log(global);

console.log(window); // window is not defined in node.js, but in browser environment it is defined. It is a global object in browser environment.

setInterval(); // global object in node.js,

clearInterval(); // global object in node.js

setTimeout(); // global object in node.js

clearTimeout(); // global object in node.js

// How to call window object in node.js?
// You can use global object to call window object in node.js. Example:
// global.window = { message: 'Hello' };

global.console.log('Hello'); // Hello