package com.hero;

public abstract class Hero {
    private String name;
    private int level;

    public Hero(String name){
        this.name = name;
        this.level = 1;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
    }

    // Membuat abstract method
    // Semua yang di inherit oleh Hero harus punya fungsi level Up
    public abstract void levelUp();


    // setter
    protected void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }
}
