package com.tutorial;


// Visibility
// 1. Jika method atau attribute dalam public secara explicit (ditulis langsung), maka subclass tidak boleh mengurangi visibility
// 2. Jika method (Biasanya tidak) atau attribute dalam private secara explicit, maka subclass SEPENUHNYA tidak bisa mengakses

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        Hero hero1 = new Hero("Ucup", 100);
        IntelHero hero2 = new IntelHero("Otong", 50);

        hero1.display();
        hero2.display();

        // Bisa diakses gethealth nya superclass/mainclass, karena oop is inheriting the method
        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
    }
}