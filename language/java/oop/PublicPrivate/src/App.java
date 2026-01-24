class Player {
    String name; // Default, dia akan bisa dibaca dan ditulis diluar class
    public int exp; // Public, dia akan bisa dibaca dan ditulis diluar class
    private int health; // Private, dia akan bisa dibaca dan ditulis "didalam class saja"

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // Default modifier access
    void display() {
        levelUp(); // Contoh mengakses private methods
        System.out.println("\nName\t: " + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("health\t: " + this.health); // membaca, tapi di dalam class
    }

    public void setName(String newName) {
        this.name = newName;
    }

    private void levelUp() {
        this.exp += 100;
    }
}

public class App {
    public static void main(String[] args) {
        Player player1 = new Player("Marni", 0, 100);

        // 1. Default
        // 2. Jika default bisa dibaca dan ditulis di object
        System.out.println(player1.name); // 3. Bisa membaca data
        player1.name = "Surti"; // 4. Bisa menulis data
        System.out.println(player1.name);

        // 5. Public
        // 6. Jika public bisa dibaca dan ditulis di object
        System.out.println(player1.exp); // 7. Bisa membaca data
        player1.exp = 100; // 8. Bisa menulis data
        System.out.println(player1.exp);

        // 9. Conclusion: Bisa diakses diluar class

        // 10. Private
        // 11. Jika private TIDAK bisa dibaca dan dituis di object
        // System.out.println(player1.health); // 12. Tidak bisa membaca data
        // player1.health = 200; // 13. Tidak bisa menulis data
        // System.out.println(player1.health);

        // 12. Public Method
        player1.display();
        player1.setName("Hacked");
        player1.display();

        // Private method
        // player1.levelUp();
    }
}
