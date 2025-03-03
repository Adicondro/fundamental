
// Player

class Player {
    // Data Member
    String name;
    double health;
    int level;

    // Object Member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// Senjata

class Weapon {
    // Data Member
    double attackPower;
    String name;

    // Constructor
    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + " , Attack Power : " + this.attackPower);
    }

}

// Armor

class Armor {
    // Data Member
    double defencePower;
    String name;

    // Constructor
    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + " , Defence Power : " + this.defencePower);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // Membuat object player
        Player player1 = new Player("Ucup", 74 );
        Player player2 = new Player("Farah", 100);

        // Membuat object weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 1);

        // Membuat object armor
        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor kaos = new Armor("Kaos", 0);

        // Equip senjata dan armor

        // Player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // Player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    }
}
