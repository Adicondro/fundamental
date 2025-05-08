let fruits = ["apple", "banana", "orange", "banana"];

console.log(fruits.length);           // 4

fruits.push("grape");                // Tambah di akhir
console.log(fruits);                 // ["apple", "banana", "orange", "banana", "grape"]

fruits.pop();                        // Hapus terakhir
console.log(fruits);                 // ["apple", "banana", "orange", "banana"]

fruits.shift();                      // Hapus pertama
console.log(fruits);                 // ["banana", "orange", "banana"]

fruits.unshift("kiwi");             // Tambah di awal
console.log(fruits);                 // ["kiwi", "banana", "orange", "banana"]

console.log(fruits.indexOf("banana")); // 1 (index pertama)
console.log(fruits.includes("orange")); // true

let sliced = fruits.slice(1, 3);      // Ambil sebagian
console.log(sliced);                  // ["banana", "orange"]

fruits.splice(2, 1, "mango");         // Hapus 1 item di index 2 dan ganti dengan "mango"
console.log(fruits);                  // ["kiwi", "banana", "mango", "banana"]

console.log(fruits.join(" - "));      // "kiwi - banana - mango - banana"

fruits.reverse();                     // Balik urutan
console.log(fruits);                  // ["banana", "mango", "banana", "kiwi"]

fruits.sort();                        // Urutkan (secara alfabet default)
console.log(fruits);                  // ["banana", "banana", "kiwi", "mango"]