const person = {
    firstName: "Alice",
    lastName: "Smith",
    age: 30,
  };
  
  // Without destructuring: 
//   const firstName = person.firstName;
//   const lastName = person.lastName;
  
  // With destructuring:
  const { firstName, lastName } = person;
  
  console.log(`Full name: ${firstName} ${lastName}`);