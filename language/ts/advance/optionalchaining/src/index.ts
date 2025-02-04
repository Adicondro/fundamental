type Customer = {
    birthday: Date
};

function getCustomer(id: number): Customer | null {
    return id === 0 ? null : { birthday: new Date() };
}

let customer = getCustomer(0);


// Optional properties access operator
console.log(customer?.birthday?.getFullYear()); // undefined

// Optional element access operator
// customer?.[0]

// Optional call
let log: any = null;
log?.('a');