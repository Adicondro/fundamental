package com.tutorial;

// Public ini akan terbuka untuk semuanya
public class IntelHero extends Hero {

    IntelHero(String name, double health){
        super(name, health);
    }


//    public double getHealth(){
//        System.out.println(this.health);
//    }

    public void display(){
        System.out.println(this.name + " mempunyai " + this.getHealth());
    }

    // Mau final mau tanpa final, tidak bisa di overwrite
//    final void setHealth (double newHealth){
//        System.out.println("Mencoba memasukkan health = " + newHealth);
//    }


    // Lihat, masih bisa terexpose
//    void setHealth (String newHealth){
//        System.out.println("Mencoba memasukkan health = " + newHealth);
//    }


}
