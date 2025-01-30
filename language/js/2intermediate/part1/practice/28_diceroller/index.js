function rollDice(){
    const diceRoller = document.getElementById("diceRoller").value;
    const diceResult = document.getElementById("diceResult");
    const diceImages = document.getElementById("diceImages");
    const values = [];
    const images = [];

    for(let i = 0; i < diceRoller; i++){
        const value = Math.floor(Math.random() * 6) + 1;
        values.push(value);
        images.push(`<img width="120px" src="dice-img/${value}.png">`);
    }
    
    diceResult.textContent = `dice: ${values.join(' , ')}`;
    diceImages.innerHTML = images.join(``);
}