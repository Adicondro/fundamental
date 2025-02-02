function calculateTax(income: number, taxYear = 2022): number {
    // let x; // x is undefined and will come out error because it is not used on local
    if(taxYear < 50_000){
        return income * 1.2;
    }else{
        return income * 1.4;
    }
}

// calculateTax(100_000, 2021, 1 : it will come out as an error
calculateTax(100_000, 2021)
