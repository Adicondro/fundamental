
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
}

// Senjata

class Weapon {
    // Data Member
    double attackPower;

    // Constructor
    Weapon(double attackPower) {
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon Power : " + attackPower);
    }
}

// Armor

class Armor {
    // Data Member
    double defencePower;

    // Constructor
    Armor(double defencePower) {
        this.defencePower = defencePower;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
