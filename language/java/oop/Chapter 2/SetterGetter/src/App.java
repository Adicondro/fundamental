class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    // Getter only
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // Setter only
    public void setDoublePrivate(double value) {
        this.doublePrivate = value;
    }

}

class Lingkaran {
    private double diameter;

    // Input diameter
    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // Input diameter lewat jari jari, me replace diameter sebelumnya
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // Membaca jari jari dengan menampilkan diameter dibagi 2 lagi
    public double getJari2() {
        return this.diameter / 2;
    }

    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Data object = new Data();

        object.intPublic = 10; // Write
        System.out.println("public : " + object.intPublic); // Read

        // Read only (kita bisa menggunakan GETTER walaupun private)
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);
        // Bagusnya nilai default memang tetap 0 dari data member, getter hanya fitur
        // yang kita buat untuk read sesuatu (kalo memang pengen) tanpa harus berurusan
        // dengan data member default kita

        // Write only
        object.setDoublePrivate(10);

        // Read dan Write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari-jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());

    }
}
