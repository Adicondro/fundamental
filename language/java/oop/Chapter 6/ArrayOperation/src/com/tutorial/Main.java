package com.tutorial;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 100);

        AgilityHero heroAgility = new AgilityHero("Dudung",50);
        IntelHero heroIntel = new IntelHero("Johnny",20);

        ArrayList<Hero> listHero = new ArrayList<Hero>();

        // Operasi satu: Menambah dengan add
        System.out.println("Operasi 1: Add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);

        System.out.println(listHero);
        System.out.println();

        // Operasi dua: Merubah member dengan set
        System.out.println("Operasi 2: set");
        listHero.set(2, heroIntel);
        System.out.println(listHero);
        System.out.println();
        // Result: Index nomor 2 akan berganti jadi heroIntel

        // Operasi tiga: Menghapus member dengan remove
        System.out.println("Operasi 3: remove");
        listHero.remove(1);
        System.out.println(listHero);
        System.out.println();

        // Operasi keempat: Mengakses member
        System.out.println("Operasi 4: get");
        System.out.println(listHero);
        // Walaupun sudah di get tetap sama outputnya
        // listHero.get(0);
        // Kalau ini bisa -> Membuat object dengan mengambil isi object dari array
        Hero heroAmbil = listHero.get(1);
        System.out.println(listHero);
        heroAmbil.display();
        System.out.println();

        // Method 2 pada arrayList
        System.out.println("Method 2");
        System.out.println("1. size()\t\t\t\t\t: " + listHero.size());
        System.out.println("2. isEmpty()\t\t\t\t: " + listHero.isEmpty());
        System.out.println("3. contains(hero2)\t\t\t\t: " + listHero.contains(hero2));
        System.out.println("   contains(heroAgility)\t: " + listHero.contains(heroAgility));
        System.out.println("4. indexOf(hero1)\t\t\t: " + listHero.indexOf(hero1));
        System.out.println("   indexOf(heroAgility)\t\t: " + listHero.indexOf(heroAgility));
    }
}