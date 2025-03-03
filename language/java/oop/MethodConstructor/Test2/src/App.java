// Player

class Player {
    // Data Member
    String name;
    double health;

    // Object Member
    Weapon weapon;
    Armor armor;

    // Constructor

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // Method (Action 1: Equip Weapon)
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    // Method (Action 2: Pertempuran)
    void attack(Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " is attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower) {
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    // Method (Action 3: Display)
    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("\nHealth : " + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// Weapon
class Weapon {
    // Data Member
    double attackPower;
    String name;

    // Constructor
    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    // Method (Display)

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

    // Method (Display)
    void display() {
        System.out.println("Armor : " + this.name + " , Defence Power : " + this.defencePower);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // CREATE SCENE

        // Create Player

        Player player1 = new Player("Ucup", 95);
        Player player2 = new Player("Farah", 100);

        // Create Weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 1);

        // Create Armor
        Armor bajuBesi = new Armor("baju besi", 10);
        Armor kaos = new Armor("kaos", 0);

        // EQUIP SCENE
        // Player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // Player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        // WAR SCENE
        System.out.println("\nBattle");

        // Episode 1
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();

        // Episode 2
        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
