//object = A collecton of related properties

const person1 = {
    firstName: "Adicondro",
    lastName: "Yusuf",
    age: 30,
    isEmployed: true,
    sayHello: function(){console.log("Hi! Im Spongebob!")},
    eat: function(){console.log("I Am eating Krabby Patty")},
};

const person2 = {
    firstName: "Ario",
    lastName: "Anjay",
    age: 40,
    isEmployed: true,
    sayHello: () => console.log("Hello"),
    eat: () => {console.log("I Am eating Krabby Patty")},
};

person1.eat();

person2.sayHello();
