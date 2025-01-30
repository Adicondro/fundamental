// Map : create a new array by applying a function to each element
// Bedanya sama forEach ini buat array baru
// Cocok dipakai array banyak

const dates = ["2024-03-17", "2023-06-18", "2025-05-04"];

// const formattedDates = dates.map(formatDates);


// function formatDates(element){
//     const parts = element.split("-");
//     return `${parts[2]}/${parts[1]}/${parts[0]}`;
// }


const formattedDates1 = dates.map((element) => {
    const parts = element.split("-");
    return `${parts[2]}/${parts[1]}/${parts[0]}`;
})

console.log(formattedDates1);