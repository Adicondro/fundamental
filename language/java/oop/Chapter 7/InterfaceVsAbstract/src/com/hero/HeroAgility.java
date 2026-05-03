package com.hero;

// import com.hero.ABSAttackSkill;

// Tidak bisa melakukan melakukan inheritance, sehingga ABSTRACT TIDAK BISA
// public class HeroAgility extends Hero, ABSAttackSkill{


// Sehingga solusinya adalah interface, maka bisa imolements
// Dan interface bisa multiple inheritance
public class HeroAgility extends Hero implements IAttackSkill {

    public HeroAgility(String name, double health){
        super(name, health);
    }

    public void attack(Hero enemy){
        System.out.println(this.getName() + " menyerang " + enemy.getName());
    }
}
