class Product{
    constructor(name, price){
        this.name = name;
        this.price = price;
    }

    displayProduct(){
        console.log(`Product: ${this.name}`);
        console.log(`Product: ${this.price.toFixed(2)}`);
    }

    calculateTotal(salesTax){
        return this.price + (this.price * salesTax);
    }
}

const salesTax = 0.05;

const product1 = new Product("Shirt", 19.99);
const product2 = new Product("T-Shirt", 9.99);

product1.displayProduct();

// product1.calculateTotal(salesTax)

const total = product1.calculateTotal(salesTax);
console.log(`Total price with tax is ${total.toFixed(2)}`);

// buat produk baru,

// display product dengan cara nama produk -> fungsi yang ada di produk
// buat 