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

        // 1. Versi untuk type hero

        ArrayList<Hero> listHero = new ArrayList<Hero>();

        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(agilityHero);
        // Sekarang bisa add ini, karena array nya sudah tidak terpaku jumlahnya
        listHero.add(intelHero);

        System.out.println("\nIni Versi ArrayList\n");
        for(Hero hero:listHero){
            hero.display();
        }

        // 2. Versi agility tapi belum dibuat
        // ArrayList<AgilityHero> listHerp = new ArrayList<AgilityHero>();

        // 3. Versi Object, nanti ini bakal semua tipe, object -> induk segalanya
        // ArrayList<Object> listHero2 = new ArrayList<Object>();

        //listHero2.add(hero1);
        //listHero2.add(hero2);
        //listHero2.add(agilityHero);
        // Sekarang bisa add ini, karena array nya sudah tidak terpaku jumlahnya
        //listHero2.add(intelHero);

        //System.out.println("\nIni Versi ArrayList\n");
        //for(Object hero:listHero){
        //    hero.display(); // Dan method display gaada di class object
        //}

        // 4. Membuktikan Reference
        agilityHero.setName("Dudung");

        // Mengganti 1 akan mengganti semua
        System.out.println("\nIni Bukan Array list (Untuk membuktikan reference)\n");
        for(Hero hero:listHero){
            hero.display();
        }

        System.out.println("\nIni Array list (Untuk membuktikan reference)\n");
        for(Hero hero:kumpulanHero){
            hero.display();
        }
    }


}