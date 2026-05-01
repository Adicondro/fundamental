package com.Hero;

public abstract class Hero {

    protected String name; // Hanya bisa diakses hero
    // kelemahannya jika protected di data member, maka akan kekunci,ketika anda mau overwrite name
    // Solusinya protected nya di method
    private int level;

    public Hero(String name){
        this.name = name;
    }

    public abstract void display();

    // Mending protected di method
    public String getName(){
        String str = "Name : " + this.name + "-" + this.level;
        return str;
    }

    protected void setName(String name){
        this.name = name;
    }
}
