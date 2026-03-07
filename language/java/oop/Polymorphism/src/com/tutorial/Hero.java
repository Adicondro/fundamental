package com.tutorial;

public class Hero {
    String nama;

    Hero(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("\nHero Name: " + this.nama);
    }
}
