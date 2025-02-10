const eventEmitter = require('events'); // EventEmitter is a class, so we use Pascal case.
const emitter = new eventEmitter(); // emitter is an object of EventEmitter class.

// Register a listener

emitter.on('messageLogged', (arg) => {

    console.log('Listener called', arg); // This is a callback function, which will be called when the event is raised.

});
    // on is a method of EventEmitter class.


// Raise an event
emitter.emit('messageLogged', {
    id:1, url: 'http://' // This will raise an event named messageLogged.
}); // This will raise an event named messageLogged.

