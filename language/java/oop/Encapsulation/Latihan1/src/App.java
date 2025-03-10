class Player {

    private int baseHealth;
    private String name;

    private Armor armor;

    public Player(String name, int baseHealth) {
        this.name = name;
        this.baseHealth = baseHealth;
    }

    public void display() {
        System.out.println("Player : " + this.name);
        System.out.println("Health : " + this.baseHealth);
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int maxHealth() {
        return this.baseHealth + this.armor.getAddHealth();
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Marni", 100);

        Armor armor1 = new Armor("Baju Besi", 5, 100);

        player1.setArmor(armor1);

        player1.display();
    }
}
