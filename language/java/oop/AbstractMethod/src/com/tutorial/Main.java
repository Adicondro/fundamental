package com.tutorial;

import com.hero.Hero;
import com.hero.HeroAgility;
import com.hero.HeroIntel;

public class Main {
    public static void main(String[] args) {
        // Tidak Bisa
        // Hero hero1 = new Hero("Otong");
        // hero1.display();

        HeroIntel hero1 = new HeroIntel("Otong");
        hero1.display();


        HeroAgility hero2 = new HeroAgility("Mario");
        hero2.display();

        // Biasanya seperti ini

        // hero1.setLevel(2);
        // hero2.setLevel(1);

        // Tidak bisa seperti diatas, karena Hero punya abstract method
        // Abstract Method level up, berarti level up hanya bisa dari subclass
        hero1.levelUp();
        hero2.levelUp();


        hero1.display();
        hero2.display();

        hero1.levelUp();
        hero2.levelUp();

        hero1.display();
        hero2.display();


        // Kelemahannya disini, setLevel masih bisa diotak atik
        // Solusinya ada di selanjutnya yaitu -> Protected
        // hero1.setLevel(30);
        // hero2.setLevel(100);

        // hero1.display();
        // hero2.display();


    }
}