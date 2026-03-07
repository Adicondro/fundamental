package com.tutorial;

public class HeroStrength extends Hero {
    double defencePower;

    // Mengecek subclass nya dulu sebelum parent class, jika ada method display atau tidak
    void display(){
        System.out.println("Hero Strength");
        System.out.println("Hero Name: " +  this.name);
        System.out.println("Defence Power: " + this.defencePower);
    }

}
