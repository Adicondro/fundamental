const logger = require('./logger'); // better with const, because logger is not going to be reassigned, even var is also fine, but const is better.

// logger.log('Message from logger.js');


// logger = 1;

// console.log(logger); // TypeError: Assignment to constant variable.

logger('Message from logger.js'); // Message from logger.js