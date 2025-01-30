// reduce = reduce the elements of an array to a single value
// Tidak mengeluarkan array baru tapi mengurangi array menjadi 1 value

const grades = [75, 80, 40, 30, 50];

const maximum = grades.reduce(getMax);
const minimum = grades.reduce(getMin);

console.log(maximum);
console.log(minimum);


function getMax(accumulator, element){
    return Math.max(accumulator, element);
}

function getMin(accumulator, element){
    return Math.min(accumulator, element);
}
