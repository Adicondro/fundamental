// For Each

let bookName = [
  "atomic habits",
  "psychology of money",
  "apa itu seni",
  "harry potter",
];

function uppercase(item, i, arr) {
  arr[i] = item.toUpperCase();
}

// Map

// Filter

// Reduce

// Function Express

const countSum = () => {
  value = 0;
  value++;
  console.log(value);

  return function () {
    value++;
    console.log("Count:", value);
  };
};

result = countSum();
result();
result();
result();
result();
