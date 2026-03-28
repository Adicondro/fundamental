package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Mountain Lady";
        // Hanya bisa di Hero Strength aja
        hero2.defencePower = 100;

        // Yang keluar adalah display yang sudah dibuat oleh HeroStrength bukan hero
        hero2.display();
    }
}