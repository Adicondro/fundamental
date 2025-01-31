// ForEach

// Map

// Filter


// Reduce

// Function Expression (Declaration vs Expression)


// Function Expression
let num = [1,2,3,4,5,6]

const squares = num.map(function(element){
    return Math.pow(element, 4);
});


function fungsiPangkat(angka) {
    return Math.pow(angka, 4);
}

let arr = [1,2,3,4,5,6];

const pangkat = arr.map(fungsiPangkat);

console.log(pangkat); // Output: [1, 16, 81, 256, 625, 1296]


const cobaLagi = num.map((element) => {
    return Math.pow(element, 4);
})

console.log(cobaLagi); // Output: [1, 16, 81, 256, 625, 1296]








// 