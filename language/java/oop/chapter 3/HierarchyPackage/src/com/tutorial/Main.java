package com.tutorial;

// Ini mengimport class console
import com.terminal.Console;

// Ini mengimport log nya aja
import static com.terminal.Console.log;

// Kalau pakai public berarti bisa dipakai diluar package -> Kalau diluar dengan import
// Kalau tanpa public tidak bisa diluar package, tapi bisa di dalam 1 package
// Kalau mau import spesifik fungsi nya yang static, berarti import static

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucup");
        Player player2 = new Player("Adicondro");

        player1.show();

        Console.log(player1.getName());
        log(player1.getName());
    }
}