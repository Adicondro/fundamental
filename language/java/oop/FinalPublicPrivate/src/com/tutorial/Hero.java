package com.tutorial;

public class Hero {
    public String name;
    // PERHATIKAN INI PRIVATE (Lanjut di intelHero)
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    // Aman kalau public, kalau private wajar gabisa diakses
    public double getHealth(){
        return this.health;
    }

    void display(){
        System.out.println(this.name + " mempunyai " + this.health);
    }
}
