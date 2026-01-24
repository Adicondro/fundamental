
class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("\nPenulis\t: " + this.penulis);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata");
        buku1.display();

        // 1. Menampilkan Address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // 2. Assignment Object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku1);

        // 3. Problem: Karena buku1 dan buku2 berada pada address atau referensi yang sama,
        // jadi saat bikin object buku2 ia tetap mengikuti buku1
        // 4.Tidak membuat object baru buku2, masih sama seperti buku1, kecuali kalau
        // bikin object baru sesuai metode
        buku1.judul = "Hacked";
        buku1.display();
        buku2.display();

        // 5. Problem 2:
        // 6. Kita akan memasukkan object buku2 kedalam methods fungsi

        fungsi(buku2);
        buku1.display();
        buku2.display();

    }

    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressDataBuku);
        // 7. Kodenya masih sama
        // Problem: Bisa passing ke method dan diganti variabel buku2 nya, karena object masih sama bukan di duplikat
        dataBuku.penulis = "Hacked Penulis";

        // Conclusion: Jadi bisa seenak hati mengganti data buku dengan membuat method baru atau bahkan assign langsung
        // Dengan hanya Buku buku2 = buku1, atau mengoper passing ke fungsi baru diubah dataBuku.penulis = "Hacked Penulis"
    }
}