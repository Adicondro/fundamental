const EventEmitter = require('events'); // EventEmitter is a class, so we use Pascal case.


const Logger = require('./logger'); // This will import the Logger function from logger.js.
const logger = new Logger(); // logger is an object of Logger class.

// Register a listener

logger.on('messageLogged', (arg) => {
    console.log('Listener called', arg); // This is a callback function, which will be called when the event is raised.
}); // on is a method of EventEmitter class.

// The above code will output:  Listener called { id: 1, url: 'http://' }.


logger.log('Notification Sent'); // This will call the Logger function from logger.js.