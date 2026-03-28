package com.tutorial;

// Jika menggunakan this.name maka akan mengakses atribut yang ada di class tersebut (Subclass)
// Jika menggunakan this.name namun tidak memiliki atribut nya di subclass, maka akan mengakses atribut yang ada di superclass (Namun tetao harus di define di subclass data member nya, kalau tidak berarti harus menggunakan super
// Jika menggunakan super.name "sudah pasti" mengakses atribut yang ada di superclass

class HeroStrength extends Hero {
    String name = "Class Strength";

    void display(){
        // Ini this.name nya mengakses SUBCLASS
        System.out.println("Ini adalah " + this.name);
        // Ini mengakses SUBCLASS
        this.dummyDisplay();
    }

    void displaySuper(){
        // Berarti mengakses yang di SUPERCLASS (dummydisplay dan name nya)
        System.out.println("Ini adalah " + super.name + " (Pakai super)");
        super.dummyDisplay();
    }

    void dummyDisplay(){
        System.out.println("Method ini ada di subclass, childclass, deriveclass");
    }
}
