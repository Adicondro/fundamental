package com.tutorial;


public class Main {
    public static void main(String[] args) {
        HeroIntel hero1 = new HeroIntel("Ucup",100);

        hero1.display();
        hero1.castMagic();

        // Upcasting -> Merubah hero1 yang intel jadi Hero
        Hero heroUp = (Hero) hero1;

        // Walaupun sudah di casting tapi masih menunjukkan intel hero
        heroUp.display();

        // Jadi tidak ada constructor type
        // System.out.println(heroUp.type);
        // heroUp.castMagic();



        // Down casting (Tidak bisa)

        Hero heroReg = new Hero("Marni", 100);
        heroReg.display();

//        HeroAgility heroDown = (HeroAgility) heroReg;
//
//        heroDown.display();



        // Balikin Upcating ke normal

        HeroIntel hero2 = (HeroIntel) heroUp;

        hero2.display();
        System.out.println(hero2.type);
        hero2.castMagic();

    }
}