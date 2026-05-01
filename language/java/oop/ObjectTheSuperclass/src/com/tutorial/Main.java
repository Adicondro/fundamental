package com.tutorial;


public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");

        hero1.display();

        Object hero2 = hero1;


        // Membuat superclass dari object
        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString();

        System.out.println(hero2_str);
        // Tetap bisa karena Hero (Subclass) is an Object (Superclass)
        System.out.println(hero1_str);


        // Salah satu method dari class Object adalah equals
        System.out.println(hero1.equals(hero2));

        // contoh dari equals
        Hero hero3 = new Hero("Otong");
        Hero hero4 = new Hero("Otong");
        Hero hero5 = new Hero("Otong");

        Jagoan hero6 = new Jagoan("Otong");

        // Akan false karena reference number nya beda
        System.out.println(hero3.equals(hero4));
        System.out.println(hero5.equals(hero6));

        // Next: Membandingkan tapi bukan dari reference number nya, namun dari nama nya, otong nya

        // dengan Meng Override method "equals" dari class Object di class Hero
        System.out.println(hero3.equals(hero4));
        System.out.println(hero3.equals(hero1));


    }
}