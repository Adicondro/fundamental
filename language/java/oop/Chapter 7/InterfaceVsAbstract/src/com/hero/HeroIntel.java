package com.hero;


// Misal hero intel puya attack dan spell, jadi bisa 2 implementasi ini
public class HeroIntel extends Hero implements IAttackSkill,ISpellSkill {

    public HeroIntel(String name, double health){
        super(name, health);
    }

    public void attack(Hero enemy){
        System.out.println(this.getName() + " menyerang " + enemy.getName());
    }

    public void spell(Hero enemy){
        System.out.println(this.getName() + " memagic " + enemy.getName());
    }


}
