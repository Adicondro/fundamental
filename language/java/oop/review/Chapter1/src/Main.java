//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Player{
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health, int level){
        this.name = name;
        this.health = health;
        this.level = level;
    }

    void attack (Player opponent){
        double damage = this.weapon.damage;
        System.out.println(this.name + " attacking " + opponent.name + " with the power of " + damage);
        opponent.defence(damage);
    }

    void defence(double damage){
        double damages;
        if(this.armor.defencePower < damage){
            damages = damage - this.armor.defencePower;
        }else{
            damages = 0;
        }

        this.health -= damages;
        System.out.println(this.name + " gets damage " + damages);
    }

    void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void setArmor(Armor armor){
        this.armor = armor;
    }

    void show(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    String weapon;
    double damage;

    Weapon(String weapon, double damage){
        this.weapon = weapon;
        this.damage = damage;
    }


    void display(){
        System.out.println("Weapon: " + this.weapon + " Damage: " + this.damage);
    }
}

class Armor{
    String armor;
    double defencePower;

    Armor(String armor, double defencePower){
        this.armor = armor;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor: " + this.armor + " Defence Power : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucup", 100.0, 1);
        Weapon ketapel = new Weapon("Ketapel", 10.0);
        Armor perisai = new Armor("Perisai", 90.0);

        player1.setWeapon(ketapel);
        player1.setArmor(perisai);

        player1.show();

        Player player2 = new Player("Morgan", 100.0, 2);
        Weapon pedang = new Weapon("Pedang", 100.0);
        Armor kutang = new Armor("Kutang", 10.0);


        player2.setWeapon(pedang);
        player2.setArmor(kutang);

        player2.show();

        System.out.println("\n===PERTEMPURAN 1===\n");

        player1.attack(player2);
        player2.attack(player1);

        player1.show();
        player2.show();

        System.out.println("\n===PERTEMPURAN 2===\n");

        player1.attack(player2);
        player2.attack(player1);

        player1.show();
        player2.show();
    }
}