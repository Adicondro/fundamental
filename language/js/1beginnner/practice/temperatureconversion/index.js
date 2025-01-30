// Temperature Conversion

const textBox = document.getElementById("textBox");
const toFahrenheit = document.getElementById("toFahrenheit");
const toCelcius = document.getElementById("toCelcius");
const result = document.getElementById("result");
let temp;

// bisa juga pake submit.onclick = function(){
//
//}


// F to C = (F-32) * 5/9
// C to F = C * 9/5 + 32


const Convert = function() {
    if(toFahrenheit.checked){
        temp = Number(textBox.value)
        temp = temp * 9 / 5 + 32
        result.textContent = temp + "°F"
    }else if(toCelcius.checked){
        temp = Number(textBox.value)
        temp = (temp - 32) * 5 / 9;
        result.textContent = temp.toFixed(1) + "°C";
    }else{
        result.textContent = "Select a Unit";
    }
}
