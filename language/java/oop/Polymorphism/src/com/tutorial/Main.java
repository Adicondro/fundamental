package com.tutorial;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    // THEORY

    Hero hero1 = new Hero("Ucup");
    HeroStrength hero2 = new HeroStrength("Otong");
    Hero hero3 = new HeroAgility("Maria");
    Hero hero4 = new HeroIntel("Mahmud");
    // Ini bisa, karena polymorph, herostrength, heroagility, dan herointel itu termasuk hero
    
    // HeroIntel hero4 = new Hero("Heru"); 
    // Ini gaakan bisa karena herointel gapunya bagian dari hero

    // HeroIntel hero3 = new HeroStrength("Adi");
    // Ini juga gaakan bisa

    hero1.display();
    hero2.display();
    hero3.display();
    hero4.display();

    // USE CASE

    // Array List
    Hero[] kumpulanHero = new Hero[3];
    // Ini akan mereplace/casting semua herostrength dan lain lain, jadi hero

    // Bisa bikin macem macem berdasarkan polymorph nya

    kumpulanHero[0] = hero1;
    kumpulanHero[1] = hero2;
    kumpulanHero[2] = hero3;

    kumpulanHero[0].display();
    kumpulanHero[1].display();
    kumpulanHero[2].display();
    // Akan berguna jika membuat list hero, tinggal buat array -> tampilkan ->
    // bisa menghitung hero

    // method calls
    // kumpulanHero[2].showoff();
    // Gabisa dipanggil karena METHOD SHOW OFF tidak ada di class Hero, dan sudah di casting ke Hero
    // hero3.showoff();
    // Bahkan ini juga tidak bisa, karena sudah di casting ke Hero

    // Kecuali kalau di declare Hero = new Heroblab, atau Heroblabla = new
    // Heroblabla("") DAN TANPA DI CASTING KE HERO

    hero2.attack(hero1);
  }
}
