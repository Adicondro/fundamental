// Task: You have to make 2 player, fighting with each other, each of the player have their own name, health -> Those 2 players gonna damage each other with weapon, and defend with armor

class Player {
    // 1. Making data member
    String name;
    double health;

    // 2. Linking object data member
    Weapon weapon;
    Armor armor;

    // 3. Making constructor
    Player(String name, double health) {
        // 4. Assign the data member to our constructor
        this.name = name;
        this.health = health;
    }

    // 13. Setter to set the weapon feature
    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 14. Setter to set the armor feature
    void setArmor(Armor armor) {
        this.armor = armor;
    }

    // 16. Make the display command
    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health Status : " + this.health + "%");
        weapon.displayWeapon();
        armor.displayArmor();
    }

    // 20. Making the attacking scenario
    // 21. Making the attacking command
    void attacking(Player opponent) {
        // 22. Print the status by adding some opponent parameter for the input
        System.out
                .println(this.name + " is attacking " + opponent + " with attacking power " + this.weapon.attackPower);

        // 29. Call the defending side function and assigning weapon attack power ->
        // attack damaged

        opponent.defending(this.weapon.attackPower);
    }

    // 24. Making the defending command
    void defending(double attackDamaged) {
        // 25. Making result variable and adding some attack power damage that they
        // received
        double damage;
        // 26. Making conditional
        if (this.armor.defencePower < attackDamaged) {
            damage = attackDamaged - this.armor.defencePower;
        } else {
            damage = 0;
        }

        // 27. Reducing the health
        this.health -= damage;

        // 28. Print the status
        System.out.println(this.name + " gets damaged by " + damage);
    }
}

class Weapon {
    // 6. Making weapon data member
    String name;
    double attackPower;

    // 7. Making weapon constructor
    Weapon(String name, double attackPower) {
        // 8. Assign the weapon data member to weapon contructor
        this.name = name;
        this.attackPower = attackPower;
    }

    // 17. Make the display command for weapon
    void displayWeapon() {
        System.out.println("Weapon: " + this.name + ", Attack Power: " + this.attackPower);
    }

}

class Armor {
    // 9. Making armor data member
    String name;
    double defencePower;

    // 10. Making armor constructor
    Armor(String name, double defencePower) {
        // 11. Assign the armor data member to armor contructor
        this.name = name;
        this.defencePower = defencePower;
    }

    // 18. Make the display command for armor
    void displayArmor() {
        System.out.println("Weapon: " + this.name + ", Attack Power: " + this.defencePower);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        // 5. Making new object (Player 1, and Player 2)
        Player player1 = new Player("Player 1", 100);
        Player player2 = new Player("Player 2", 100);

        // 12. Making new weapon and armor
        Weapon japanRocket = new Weapon("Japan Rocket", 40);
        Weapon americaMissile = new Weapon("American Missile", 60);
        Weapon indonesiaCatapult = new Weapon("Indonesian Catapult", 5);

        Armor droneDetector = new Armor("Drone Detector", 50);
        Armor metalShield = new Armor("Metal Shield", 10);

        // 15. Equip the weapon and the armor
        player1.setWeapon(americaMissile);
        player1.setArmor(droneDetector);
        player2.setWeapon(indonesiaCatapult);
        player2.setArmor(metalShield);

        // 19. Display the result
        player1.display();
        player2.display();

        // 23. Running the attacking scenario
        System.out.println("\nWar begins!!");
        player1.attacking(player2);

        // 30. Print the final result
        player1.display();
        player2.display();

    }
}

// Problem: Class Player bisa mengakses Class Weapon -> Bayangkan ada orang bisa
// mengubah set attackpower itu ke 2000 karena class weapon bisa di akses
