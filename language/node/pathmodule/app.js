const path = require('path');

var pathObj = path.parse(__filename);   

console.log(pathObj); // { root: 'C:\\', dir: 'C:\\Users\\User\\Desktop\\Node.js\\pathmodule', base: 'app.js', ext: '.js', name: 'app' }