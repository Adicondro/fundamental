package com.tutorial;

import com.hero.AttackMelee;
import com.hero.AttackRange;
import com.hero.HeroAgility;
import com.hero.IAttackSkill;

public class Main {
    public static void main(String[] args) {

        HeroAgility hero1 = new HeroAgility("Ucup", 100);
        HeroAgility hero2 = new HeroAgility("Otong", 20);

        // You can't make an IAttackSkill in here
        // IAttackSkill try = new IAttackSkill();

        hero1.setAttackSkill (new AttackMelee(100));
        hero2.setAttackSkill(new AttackRange(100, 10));

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
    }
}