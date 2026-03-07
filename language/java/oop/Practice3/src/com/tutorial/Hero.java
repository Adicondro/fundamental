package com.tutorial;

class Hero{
    // Attribute
    String name;
    double attackPower, health;

    // Constructor
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    void attack(Hero enemy){ // Kenapa hero? kan harusnya parameter yang masuk itu zenitsu = herostrength?
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double attackPower){
        // Kenapa this.name itu mengarahnya ke zenitsu bukan tanjiro? -> karena tadi kita declare enemy itu adalah Hero (Masih belum tau kenapa hero)
        System.out.println(this.name + " receive damage " + attackPower);
        this.health = this.health - attackPower;
    }

    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.attackPower);
    }
}
