class Car {
    constructor(brand, model, year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

let myCar = new Car("Toyota", "Corolla", 2023);
console.log(myCar.brand);