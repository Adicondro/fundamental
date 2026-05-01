package com.tutorial;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.Hero.Hero;
import com.Hero.HeroStrength;

public class Main {
    public static void main(String[] args) {
        HeroStrength hero1 = new HeroStrength("Ucup");

        hero1.display();
        hero1.setName("Otong");
        hero1.display();
    }
}