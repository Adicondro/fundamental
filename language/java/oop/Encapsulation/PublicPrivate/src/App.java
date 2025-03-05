class Player {
    String name; // default, dia akan bisa dibaca dan ditulis
    public int exp; // public, dia akan bisa dibaca dan ditulis
    private int health; // private, hanya bisa dibaca dan ditulis di dalam class itu sendiri
    protected int level; // protected, hanya bisa dibaca dan ditulis di dalam class itu sendiri dan
                         // turunannya

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display() {
        tambahExp(); // Menulis, tapi didalam class
        System.out.println("\nName\t: " + this.name);
        System.out.println("Exp\t: " + this.exp);
        System.out.println("Health\t: " + this.health); // Membaca, tapi didalam class
    }

    void ubahNama(String name) {
        this.name = name;
    }

    private void tambahExp() {
        this.exp += 100;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("John", 50, 100);

        // Default
        System.out.println(player1.name); // Membaca data
        player1.name = "Surti"; // Menulis data
        System.out.println(player1.name); // Membaca data

        // Public
        System.out.println(player1.exp); // Membaca data
        player1.exp = 100; // Menulis data
        System.out.println(player1.exp); // Membaca data

        // Private

        // System.out.println(player1.health); // Membaca data, tidak bisa karena tidak
        // visible
        // player1.health = 200; // Menulis data, tidak bisa karena tidak visible
        // System.out.println(player1.health); // Membaca data, tidak bisa karena tidak
        // visible

        // Private (With Display)
        player1.display();
        player1.ubahNama("Andre");
        player1.display();

        // Private function
        // player1.tambahExp(); // Tidak bisa karena private
    }
}
