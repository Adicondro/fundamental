package com.tutorial;

class Player {
    private String name;
    private static int showNumberPlayer;

    Player(String name){
        this.name = name;
        showNumberPlayer++;
    }

    Player(){
        showNumberPlayer++;
        this.name = "player" + Player.showNumberPlayer;
    }

    void show(){
        System.out.println(this.name);
    }
}
