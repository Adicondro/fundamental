package com.tutorial;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "ucup";
        hero1.display();


        HeroStrength hero2 = new HeroStrength();
        hero2.name = "otong";
        hero2.display();


        HeroIntel hero3 = new HeroIntel();
        hero3.name = "samuel";
        hero3.display();

    }
}