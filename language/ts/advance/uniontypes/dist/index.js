"use strict";
function kgToLbs(weight) {
    // Narrowing
    if (typeof weight === 'number') {
        return weight * 2.2;
    }
    else {
        return parseInt(weight) * 2.20462;
    }
}
kgToLbs(100); // 220
kgToLbs('100'); // 220.462
