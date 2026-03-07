package com.tutorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2 = new HeroStrength("Otong");

        hero1.display();
        hero2.display();

    }
}