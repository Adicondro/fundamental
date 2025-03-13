class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // Konstruktor yang benar
    public Data(int intPublic, int intPrivate, double doublePrivate) {
        this.intPublic = intPublic;
        this.intPrivate = intPrivate;
        this.doublePrivate = doublePrivate;

    }

    void display() {
        System.err.println("\n=====Display==== ");
        System.out.println("\nPublic : " + intPublic);
        System.out.println("Private : " + intPrivate);
        System.out.println("Double : " + doublePrivate);
    }

    // Getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // Setter
    public void setDoublePrivate(double doublePrivate) {
        this.doublePrivate = doublePrivate;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // Setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // Getter
    public double getJari2() {
        return this.diameter / 2;
    }

    // Getter
    public double getLuas() {
        return Math.PI * Math.pow(getJari2(), 2);
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek dengan konstruktor yang benar
        Data object = new Data(10, 20, 30.0);

        // Public
        // Read and Write dengan Public
        object.intPublic = 10; // Write (Menggantinya/Write di main, dan bisa diganti kapan saja) -> Beresiko
        System.out.println("Public Example : " + object.intPublic); // Read (Membaca/Read nya di main, dan bisa dibaca kapan saja oleh mesin) -> Beresiko

        // Private
        // Read Only (Menggunakan Getter)
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);

        // Write Only (Hanya bisa menggunakan setter)
        object.setDoublePrivate(50.0);
        // System.out.println("Setter : " + object.setDoublePrivate()); // you can't
        // read it, because it's write only
        object.display();

        // Notes -> Read artinya membaca si data, Write artinya menulis si data (Read
        // Getter, Write Setter)
        // Set -> Menulis data, Get -> Membaca data
        // Getter untuk read (print), Setter untuk write (input)

        // Gabungkan read and write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("\nDiameter : " + object2.getJari2()); // Sebelum di set
        object2.setJari2(14); // Set jari jari
        System.out.println("Jari-jari : " + object2.getJari2()); // Sesudah di get dan set
        System.out.println("Luas : " + object2.getLuas());

    }
}