package com.tutorial;

// Public ini akan terbuka untuk semuanya
public class IntelHero extends Hero {

    IntelHero(String name, double health){
        super(name, health);
    }

    // Walaupun method nya bisa diakses
    public double getHealth(){
        // Jika public nya tidak ditulis maka tidak bisa diakses
        // Karena tidak boleh mengurangi visibility nya
        return this.health; // ini tidak mau (karena kondisi data member health nya private)
    }
}
