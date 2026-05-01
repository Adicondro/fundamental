package com.tutorial;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 100);

        Hero hero2 = new Hero("Otong", 20);

        AgilityHero agilityHero = new AgilityHero("Johnny", 500);
        IntelHero intelHero = new IntelHero("Smith", 5);

        // Array sederhana
        Hero[] kumpulanHero = new Hero[3];

        // Masukkan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = agilityHero;
        // Index out of bound, karena index yang kita punya hanya 3
        // kumpulanHero[3] = intelHero;

        for(Hero hero:kumpulanHero){
            hero.display();
        }

        // Disini bergunanya array list

        // Versi Array List
        ArrayList<Hero> listHero = new ArrayList<>();

        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        // Sekarang bisa add ini, karena array nya sudah tidak terpaku jumlahnya
        listHero.add(intelHero);

        System.out.println("\nIni Versi ArrayList\n");
        for(Hero hero:listHero){
            hero.display();
        }


        // Reference
        agilityHero.setName("Dudung");
    }
}