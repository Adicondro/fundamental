var sayHello = function(){

}

window.sayHello();

// Avoid defining variable and function in global scope, because it can be accessed from anywhere in the program. This can lead to conflicts and bugs. Instead, use modules to encapsulate code and only expose the parts that need to be accessed from outside. This will make the code more maintainable and easier to understand.

// so when you make sayHello as a global object, then you make a different file that also has sayHello function, then it will conflict with each other. So it is better to use module to encapsulate the code.