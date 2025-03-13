class Player {

    // Data Member
    // name, basehealth, baseattack, armor, weapon, level, incrementhealth,
    // incrementattack

    private String name;
    private int baseHealth;
    private int baseAttack;

    private Armor armor;
    private Weapon weapon;

    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementAttack = 20;
        this.incrementHealth = 20;
    }

    public void display() {
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Max Health\t: " + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void levelUp() {
        this.level++;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }

    public int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

}

class Armor {

    private String name;
    private int strength;
    private int health;

    Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }

}

class Weapon {

    private String name;
    private int attack;

    Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Adicondro");
        Weapon weapon1 = new Weapon("Pedang", 15);
        Armor armor1 = new Armor("Tameng", 5, 100);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        player1.display();
        player1.levelUp();
        player1.display();
    }
}
