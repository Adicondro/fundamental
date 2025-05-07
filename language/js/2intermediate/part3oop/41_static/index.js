class User{
    static userCount = 0;

    constructor(username){
        this.username = username;
        User.userCount++;
    }

    static getUserCount(){
        console.log(`There are ${User.userCount} users online`);
    }

    sayHello(){
        console.log(`Hello, my username is ${this.username}`);
    }
}

const user1 = new User("Spongebob");
const user2 = new User("Adicondro");
const user3 = new User("Patrick");

user1.sayHello();
user2.sayHello();
user3.sayHello();
console.log(User.userCount);