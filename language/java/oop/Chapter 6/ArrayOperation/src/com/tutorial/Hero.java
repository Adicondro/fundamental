package com.tutorial;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    void setName(String newName){
        this.name = newName;
    }

    void display(){
        System.out.println("This is: " + this.name + " with health " + this.health);
    }

    public String toString(){
        return "Hero: " + this.name;
    }
}
