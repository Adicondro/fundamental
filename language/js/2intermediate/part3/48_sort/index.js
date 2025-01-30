const people = [{name: "Spongebob", age: 30, gpa: 3.0},
                {name: "Adicondro", age: 23, gpa: 2.1},
                {name: "Yusuf", age: 37, gpa: 1.5},
                {name: "Hendratmo", age: 51, gpa: 2.3}]

people.sort((a,b) => a.name.localeCompare(b.name));

console.log(people);