// this : reference object that This is used
// the object depends on the immediate context
// person.name = this.name

const person1 = {
    name: "Spongebob",
    favFood: "Hamburger",
    sayHello: function(){
        console.log(`Hi, i Am ${this.name}`)}
}

person1.sayHello();

// this keyword doesnt work with arrow function