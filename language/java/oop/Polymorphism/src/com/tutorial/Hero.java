package com.tutorial;

public class Hero {
    String nama;

    Hero(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("\nHero Name: " + this.nama);
    }

    void attack(Hero enemy){
        System.out.println(this.nama + " Attacking " + enemy.nama);
    }
}
