class Player{
    // Data Member
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;

    private Weapon weapon;
    private Armor armor;


    // 1. BASIC PART

    // Constructor
    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Attack: " + this.baseAttack);
        System.out.println("Health: " + this.baseHealth + "\n");
    }
}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int armor){
        this.name = name;
        this.armor = armor;
    }


}


public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Zepynn");
        Weapon weapon1 = new Weapon("Tali Pecut", )

        Player player2 = new Player("XGaMeZoNeX");
        Weapon weapon2 = new Weapon("Pedang");

        player1.display();
        player2.display();
    }
}