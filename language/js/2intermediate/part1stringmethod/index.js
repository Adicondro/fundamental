let text = "  hello world  ";

console.log(text.length);             // 15 (termasuk spasi di awal dan akhir)
console.log(text.toUpperCase());      // "  HELLO WORLD  "
console.log(text.toLowerCase());      // "  hello world  "
console.log(text.charAt(2));          // "h" (ingat: index ke-2 = karakter ke-3)
console.log(text.indexOf("o"));       // 4 (huruf "o" pertama di index 4)
console.log(text.lastIndexOf("o"));   // 7 (huruf "o" terakhir di index 7)
console.log(text.slice(2, 7));        // "hello" (potong dari index 2 ke 6)
console.log(text.substring(2, 7));    // "hello" (mirip slice, tapi tanpa index negatif)
console.log(text.includes("world"));  // true
console.log(text.replace("world", "everyone")); // "  hello everyone  "
console.log(text.trim());             // "hello world" (hapus spasi)
console.log(text.split(" "));         // ["", "", "hello", "world", "", ""]
console.log(text.startsWith("  h"));  // true
console.log(text.endsWith("d  "));    // true
console.log("ha".repeat(3));          // "hahaha"