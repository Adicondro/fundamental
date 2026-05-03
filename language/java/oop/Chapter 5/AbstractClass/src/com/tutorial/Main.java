package com.tutorial;

import com.hero.Hero;
import com.hero.HeroIntel;
import com.hero.HeroAgility;


public class Main {
    public static void main(String[] args) {

        // Membuat Hero Intel
        HeroIntel hero1 = new HeroIntel("Ucup");
        hero1.display();
        // Berhasil

        // Membuat object dari class abstract
//      // Hero hero2 = new Hero("Mario");
//      //hero2.display();
        // Tidak bisa karena dia abstract

        HeroAgility hero2 = new HeroAgility("Mario");
        hero2.display();


    }
}