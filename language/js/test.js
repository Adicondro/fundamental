// let baseSalary = 30_000;
// let overTime = 10;
// let rate = 20;

function getWage(baseSalary, overTime, rate){
    return baseSalary + (overTime * rate);
}

 getWage(30_000, 10, 20);

let employee = {
    baseSalary: 30_000,
    overTime: 10,
    rate: 20,
    getWage: function(){
        return this.baseSalary + (this.overTime * this.rate);
    }
};
employee.getWage();