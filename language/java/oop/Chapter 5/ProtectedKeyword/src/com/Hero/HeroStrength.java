package com.Hero;

public class HeroStrength extends Hero{

    public HeroStrength(String name){
        super(name);
    }

    public void display(){
        // This.name bisa diakses karena ini merupakan subclass
        System.out.println(this.getName()); // Ini jadi menggunakan this name yang tidak private
    }

    // Harus membuat ini agar setname tidak ter protected oleh Hero
    public void setName(String name){
        super.setName(name);
    }
}
