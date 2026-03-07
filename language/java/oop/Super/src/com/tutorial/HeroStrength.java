package com.tutorial;

// Jika menggunakan this.name maka akan mengakses atribut yang ada di class tersebut (Subclass)
// Jika menggunakan this.name namun tidak memiliki atribut nya di subclass, maka akan mengakses atribut yang ada di superclass
// Jika menggunakan super.name "sudah pasti" mengakses atribut yang ada di superclass

class HeroStrength extends Hero {
    String name = "Class Strength";

    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyDisplay();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + super.name + " (Pakai super)");
        super.dummyDisplay();
    }

    void dummyDisplay(){
        System.out.println("Method ini ada di subclass, childclass, deriveclass");
    }
}
