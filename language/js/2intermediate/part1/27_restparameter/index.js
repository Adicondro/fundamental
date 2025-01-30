// rest parameters (...rest) allow a function work with a variable number
// of arguments by bundling them into an array

// spread = expand an array to separate elements
// rest = bundles separate elements into array

// function openFridge(...items){ // Membuat fungsi terlebih dahulu untuk mengambil item dan langsung separate iitemnya
//     console.log(...items); // Spread item jadi array satuan
//     return items; // Mengembalikan nilai items
// };



// let food1 = "Sayur Lodeh";
// let food2 = "Tempe Bacem";
// let food3 = "Ayam Kecap";
// let food4 = "Sirloin Steak";
// let food5 = "Kentang Mustofa";


// const foods = openFridge(food1, food2, food3, food4, food5);


// console.log(foods);


// function sum(...numbers){
//     let result = 0;
//     for(let number of numbers){
//         result += number;
//     }
//     return result;
// }

// const total = sum(1, 2, 3, 4, 6);

// console.log(`Your Total is ${total}`);

// function getAverage(...numbers){
//     let result = 0;
//     for(let number of numbers){
//         result += number;
//     }
//     return result / numbers.length;
// }


// const total = getAverage(1, 2, 3);

// console.log(`The average is ${total}`);

function joinString(...strings){
    return strings.join(" ");
}

const name = joinString("Adicondro", "Yusuf");

console.log(name);