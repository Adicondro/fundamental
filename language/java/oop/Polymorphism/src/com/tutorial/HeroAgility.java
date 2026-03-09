package com.tutorial;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Hero Type: " + this.type);
    }

    void showoff(){
        System.out.println("Saya hero Agility");
    }
}
