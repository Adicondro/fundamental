package com.tutorial;

class HeroStrength extends Hero{

    // Problem: Jika membuat constructor hanya di SUPERCLASS -> ERROR di object dari subclass HeroStrength nya
    // 1. Ada solusi membuat constructor HANYA di subclass
    // 2. Tapi jika membuat hanya di SUBCLASS -> ERROR di object dari superclass Hero nya

    // Solusi: Membuat 2 constructor dengan menambahkan super() -> Mengakses constructor superclass
    // Karena constructor itu tidak di inherit (diturunkan) oleh subclass
    HeroStrength(String name, double defencePower){
        super(name, defencePower); // Memanggil constructor yang di super class
    }

    HeroStrength(String name){
        super(name);
    }
}
