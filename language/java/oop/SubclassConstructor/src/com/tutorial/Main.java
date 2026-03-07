package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 10);
        hero1.display();

        // Gabisa memasukkan input ke constructor Superclass melalui Subclass
        HeroStrength hero2 =  new HeroStrength("Aliando", 10);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Otong");
        hero3.display();
    }
}