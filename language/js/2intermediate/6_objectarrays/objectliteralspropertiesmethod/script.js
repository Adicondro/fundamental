// Define an object using object literals
const person = {
    firstName: "John",
    lastName: "Doe",
    age: 30,
    hobbies: ["reading", "traveling", "sports"],
    
    // Method to get full name
    getFullName: function() {
        return `${this.firstName} ${this.lastName}`;
    },
    
    // Method to add a hobby
    addHobby: function(hobby) {
        this.hobbies.push(hobby);
    },
    
    // Method to get all hobbies
    getHobbies: function() {
        return this.hobbies.join(", ");
    }
};

// Accessing properties
console.log(person.firstName); // Output: John
console.log(person.age); // Output: 30

// Using methods
console.log(person.getFullName()); // Output: John Doe
person.addHobby("coding");
console.log(person.getHobbies()); // Output: reading, traveling, sports, coding