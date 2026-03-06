package com.tutorial;

import com.terminal.Console;

class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("Player name : " + this.name);
    }
}
