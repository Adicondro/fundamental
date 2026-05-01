package com.hero;

public class HeroIntel extends Hero{
    String type = "Intelligence";

    HeroIntel(String nama){
        super(nama);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Hero Type: " + this.type);
    }


}
