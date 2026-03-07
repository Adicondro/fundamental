package com.tutorial;

class Hero {
    String name = "Class Hero";

    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyDisplay();
    }

    void dummyDisplay(){
        System.out.println("Method ini ada di superclass, parentclass, baseclass");
    }
}
