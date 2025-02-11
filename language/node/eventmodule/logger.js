const EventEmitter = require('events'); // EventEmitter is a class, so we use Pascal case.

var url = 'http://mylogger.io/log';


class Logger extends EventEmitter{
    log(message) {
        // Send an HTTP request
        console.log(message);
    
        // Raise an event
        this.emit('messageLogged', {
            id:1, url: 'http://' // This will raise an event named messageLogged.
        }); // This will raise an event named messageLogged.
    }
}

module.exports = Logger; // This will export the log function.