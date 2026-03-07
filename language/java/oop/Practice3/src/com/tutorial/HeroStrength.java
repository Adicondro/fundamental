package com.tutorial;

class HeroStrength extends Hero{
    String type = "Strength";

    // Subclass Constructor
    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    void display(){
        super.display(); // Memanggil dulu display yang lama
        System.out.println("Type: " + this.type);
    }

    @Override
    void takeDamage(double attackPower){
        // Tidak pakai super lagi, karena di override semuanya
        System.out.println(this.name + " receive half damage " + attackPower + " -> " + 0.5 * attackPower);
        this.health = this.health - 0.5*attackPower;
    }

}
