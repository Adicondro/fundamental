//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Player {
    //    Inisialisasi Data Player
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // Object Member
    private Armor armor;
    private Weapon weapon; // Mengambil tipe data object

    // ==== 1. BASIC PART ====

    //    Constructor -> Menggunakan parameter nama karena semua harus di inisialisasi, namun yang di set hanya nama
    public Player(String name) {
        this.name = name; // KENAPA GAK PAKAI SET NAME AJA, NANTI DIBAWAH SET NAME JADI, PLAYER1.SETNAME("XXX")?
        // APAKAH MEMANG SETTER ITU DIPAKAI UNTUK MENGEDIT SAJA, BUKAN MENGINISIALISASI NILAI AWAL?
        // ATAU APAKAH SETTER ITU HANYA DIPAKAI UNTUK OBJEK YANG DI SET DILUAR DARI CONSTRUCTOR SEPERTI SETARMOR SETWEAPON?
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    //    Set Armor Method

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    //    Set Weapon Method
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //    Display method -> Print di system semua info ini
    public void display() {
        System.out.println("Player: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Max Health: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack: " + this.getAttackPower());
        System.out.println("Status: " + this.isAlive + "\n");
    }

    // ===== 2. INFO HEALTH PART =====

    // Get Max Health Method -> Base health sekarang ditambah level yang sudah dikalikan increment health, ditambah lagi health dari armor
    // Return: Base Health + (Increment Health * Level) + "Armor" Health
    // Mendapatkan info pakai this, jika info nya ada di dalam class berarti pakai this
    // Tidak langsung this.armor.getAddhHealth() karena harus dikalkulasikan terlebih dahulu
    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }

    // Get Health Method -> Return/kasihtau kita info max health yang dikurangi dengan total damage yang diterima dari musuh
    // Return: Max Health - Total Damage
    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    // ===== 3. BATTLE PART =====

    //    Get Attack Power Method -> Memberikan info base attack ditambah level yang dikalikan dengan increment attack, ditambah lagi attack damage dari weapon
    // Return: Base Health + (Increment Health * Level) + "Weapon" Attack Damage
    // Tidak langsung this.weapon.getattack() karena harus dikalkulasikan terlebih dahulu
    // KENAPA PRIVATE???
    private int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    // Get Name Method -> Return/Kasihtau kita info nama
    // KENAPA HARUS GET NAME, KENAPA GAK, OPPONENT.THIS.NAME??
    public String getName() {
        return this.name;
    }

    //    Set Level Up Method
    public void levelUp() {
        this.level++;
    }

    // Attacking Method -> Menyerang lawan
    // 1. Menyetting fungsi/method menerima parameter bernama opponent yang ber tipe Player (Opponent punya semua attribute yang ada di Player)
    public void attack(Player opponent) {
        // Hitung damage
        // 2. Membuat variable damage, dan mendapatkan info dari fungsi Attack Power
        int damage = this.getAttackPower();

        // 3. Print Semuanya (Name + Opponent Name + Damage from get attack power)
        System.out.println("Player " + this.name + " is attacking " + opponent.getName() + " with " + damage);

        // Attacking Opponent
        // 4. Menjalankan fungsi defence dengan memberikan info hasil "damage" untuk parameter defence
        opponent.defence(damage);

        // 5. Setelah serangan maka terjadi level up
        this.levelUp();
    }

    // 1. Fungsi menerima parameter berupa integer yang dinamakan damage
    public void defence(int damage) {

        // Receive damage
        // 2. Mengambil info defence power dari armor
        int defencePower = this.armor.getDefencePower();
        // 3. Membuat variable delta damage, seperti final damage setelah dikurangi defence powernya
        int deltaDamage;

        System.out.println(this.name + " defence power = " + defencePower);

        if (damage > defencePower) {
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }

        System.out.println("Damage earned: " + deltaDamage + "\n");

        // Adding total damage
        this.totalDamage += deltaDamage;
        // Health = max_health - totalDamage

        // check is alive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
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

    public int getDefencePower() {
        return this.strength * 2;
    }
}


public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Marni");
        Armor armor1 = new Armor("Baju besi", 5, 100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);


        Player player2 = new Player("Isabella");
        Armor armor2 = new Armor("Gaun Pesta", 1, 40);
        Weapon weapon2 = new Weapon("Pecut", 40);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        // Pertempuran

        player1.attack(player2);
        player1.display();
        player2.display();
    }
}