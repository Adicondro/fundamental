let timeoutId;

function startTimer(){
    timeoutId = setTimeout(() => window.alert("Hello"), 3000);
    console.log("Started")
}

function clear(){
    clearTimeout(timeoutId)
    console.log("Cleared");
}



