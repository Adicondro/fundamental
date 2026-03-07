package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjiro", 10, 100);
        HeroStrength hero2 = new HeroStrength("Zenitsu", 20, 100);
        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        // Kalau tadi takedamage parameternya jadi herostrength, maka hero2 attack hero1 akan error
        // Karena hero1 bukan bagian dari heroStrength
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}