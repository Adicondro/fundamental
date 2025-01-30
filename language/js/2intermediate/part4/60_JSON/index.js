// JSON.stringify() = JS to JSON String

// const names = ["Spongebob", "Patrick", "Squidward", "Sandy"];

// const jsonString = JSON.stringify(names);

// console.log(names);

// console.log(jsonString);


// JSON.parse() = JSON to JS String

// const jsonNames = ["Spongebob", "Patrick", "Squidward", "Sandy"];
// const jsonPerson = {
//     "name": "Spongebob",
//     "age": 30,
//     "isEmployed": true
// }
// const jsonPeople = [
//     {
//         "name" : "Patrick",
//         "age" : 14,
//         "isEmployed" : false
//     },
//     {
//         "name" : "Yusuf",
//         "age" : 72,
//         "isEmployed" : false
//     },
//     {
//         "name" : "Hendratmo",
//         "age" : 13,
//         "isEmployed" : false
//     },
//     {
//         "name" : "Raden",
//         "age" : 32,
//         "isEmployed" : true
//     },
//     {
//         "name" : "Asep",
//         "age" : 44,
//         "isEmployed" : true
//     }
// ];

// const parsedData = JSON.stringify(jsonPeople);

// console.log(jsonPeople);

// console.log(parsedData);

fetch("people.json")
    .then(response => response.json())
    .then(values => values.forEach(value => console.log(value.name)));