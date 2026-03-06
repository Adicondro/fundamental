package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Anton");
        Player player2 = new Player();
        Player player3 = new Player();

        player1.show();
        player2.show();
        player3.show();

        int result1 = Matematika.add(8, 7);
        double result2 = Matematika.add(8, 1.4);

        System.out.println(result1);
        System.out.println(result2);


    }
}