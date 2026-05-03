package com.hero;

public class Hero implements IAttack {
    private String name;
    private double health;

    public Hero(String name, double health){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }

    // Harus punya method ini, bahkan harus sama parameternya (Mirip abstract)
    public void attack(Hero enemy){
        System.out.println(this.name + " is attacking " + enemy.name);
    }
}
