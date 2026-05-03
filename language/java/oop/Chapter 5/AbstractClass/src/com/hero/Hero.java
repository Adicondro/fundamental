package com.hero;

public abstract class Hero {
    private String name;


    public Hero(String name){
        this.name = name;
    }


    public void display(){
        System.out.println("Name: " + this.name);
    }

}
