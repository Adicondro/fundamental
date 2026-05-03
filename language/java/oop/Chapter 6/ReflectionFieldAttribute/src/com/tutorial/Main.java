package com.tutorial;


import com.hero.HeroAgility;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException {
        HeroAgility hero1 = new HeroAgility("Otong", 100);

        hero1.displayAll();

        // Access modifier
        // Bisa merubah nickname karena publik
        hero1.nickname = "tongtong";
        hero1.displayAll();

        // hero1.heroType = "intel"; tidak bisa dilakukan, karena tidak visible
        // hero1.name = "ucup" tidak bisa krean private

        // Solusi dengan reflection -> Mengambil class

        // 1. Dapat melihat hero1 ini berada di class apa?
        // Mengambil class nya
        Class<?> classHero1 = hero1.getClass();
        // 2. Dapat melihat hero1 ini punya superclass siapa
        // Mengambil class dan superclass, bahkan bisa sampai ujung
        Class<?> parentClassHero1 = hero1.getClass().getSuperclass();

        System.out.println("\nClass : " + classHero1.getName());
        System.out.println("Parent : " + parentClassHero1.getName());

        // 3. Cek Attribute dari object hero1 dengan Field
        System.out.println("\nAttribute dari object hero1");
        Field[] hero1Fields = classHero1.getFields();
        // Menampilkan attribute class urut 1
        // Jika menambah get nama maka akan diambil spesifik namanya saja
        System.out.println("Atribute: " + hero1Fields[0].getName());
        // Menampilkan jumlah attribute pada class
        System.out.println("Jumlah attribute: " + hero1Fields.length);

        // 4. Cek attribute semua object hero1
        System.out.println("\nattribute semua dari object hero1");
        Field[] hero1AllFields = classHero1.getDeclaredFields();
        System.out.println("jumlah attribute adalah: "+hero1AllFields.length);
        System.out.println("attribute: ");
        for (Field field : hero1AllFields) {
            System.out.println(field.getName());
        }

        System.out.println("\nattribute semua dari super class Hero");
        Field[] heroAllFields = parentClassHero1.getDeclaredFields();
        System.out.println("jumlah attribute adalah: "+heroAllFields.length);
        System.out.println("attribute: ");
        for (Field field : heroAllFields) {
            System.out.println(field.getName());
        }

        // kita ubah nilainya dengan reflection
        // Harus tambahkan throws IllegalArgumentException, IllegalAccessException

        System.out.println("\nKita ubah");
        hero1.displayAll();
        System.out.println("\nMenjadi");
        // merubah public bisa
        hero1AllFields[0].set(hero1,"cupcup");
        // merubah private
        hero1AllFields[1].setAccessible(true);
        hero1AllFields[1].set(hero1,"intel");

        // ubah bagian supreclass
        heroAllFields[0].setAccessible(true);
        heroAllFields[0].set(hero1,"Ucup");
        heroAllFields[1].setAccessible(true);
        heroAllFields[1].set(hero1,0);
        hero1.displayAll();

    }
}