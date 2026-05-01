package com.hero;


// Visibility
// 1. Public: Jika method atau attribute dalam public secara explicit (ditulis langsung), maka subclass tidak boleh mengurangi visibility
// 2. Private: Jika method (Biasanya tidak) atau attribute dalam private secara explicit, maka subclass SEPENUHNYA tidak bisa mengakses
// 3. Method ata attribute dengan final keyword akan diwariskan

// Kamus cepat

// Tujuan: agar di subclass tidak terexpose

// public (terexpose/overwrited) -> bisa di overwrite hanya jika menggunakan visibility yang sama yaitu public
// private (terexpose/overwrited) -> method bisa di overwrite, tapi data member tidak bisa, dan hanya jika menggunakan visibility yang sama
// final (lebih aman) -> tidak bisa di overwrite, even menggunakan visibility yang sama di subclass, jadi sudah final
// notes: final bisa tetap terexpose jika kita overload/overwrite di superclass nya langsung, jadi belum sepenuhnya aman, kuncinya di superclass


public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Ucup", 100);
        IntelHero hero2 = new IntelHero("Otong", 50);

        hero1.display();
        hero2.display();

        // Bisa diakses gethealth nya superclass/mainclass, karena oop is inheriting the method
        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(120);
        hero2.setHealth(80);

        hero1.display();
        hero2.display();
    }
}