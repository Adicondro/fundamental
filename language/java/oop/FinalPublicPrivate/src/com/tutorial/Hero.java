package com.tutorial;

public class Hero {
    public String name;
    // PERHATIKAN INI PRIVATE (Lanjut di intelHero)
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public double getHealth(){
        return this.health;
    }

    final void setHealth(double newHealth){
        this.health = newHealth;
    }

    // Ternyata final masih bisa teroverload denagn visibility apapun jadi bisa terexpose
    void setHealth(String mode){
        if(mode.equals("reset")){
            this.health = 100;
        }
    }

    public void display(){
        System.out.println(this.name + " mempunyai " + this.health);
    }
}
