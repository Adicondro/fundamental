//.filter() = creates a new array by filtering out elements
// Bedanya sama map itu kalo map lebih fokus ke ngubah element semua rata menjadi array baru
// Kalo filter itu lebih ke mengambil array, dan membuang yang tidak

const words = ['apple', 'banana', 'orange', 'kiwi', 'pomegrenate', 'coconut'];

const shortWords = words.filter(checkShort);
const longWords = words.filter((element) => {
    return element.length >= 6;
});

console.log(shortWords);
console.log(longWords);

function checkShort(element){
    return element.length <= 6;
}



