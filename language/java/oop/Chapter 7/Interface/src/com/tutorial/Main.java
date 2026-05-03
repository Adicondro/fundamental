package com.tutorial;

import com.hero.Hero;

// Interface bukan class, tapi sebuah interface yang memaksa method untuk diimplementasikan
// Semua hero harus mengimplementasikan method ini
// Question: Bukannya sama seperti abstract? memaksa pakai method ini

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 100);
        hero1.display();
        hero2.display();
        hero1.attack(hero2);
    }
}