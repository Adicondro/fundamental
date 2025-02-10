var url = 'http://mylogger.io/log';

function log(message) {
    console.log(message);
}

module.exports = log;



// module.exports.log = log; // public variable
// module.exports.endPoint = url; // private variable
