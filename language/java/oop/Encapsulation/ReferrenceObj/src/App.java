class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Buku dataBuku1 = new Buku("Killing Commandantore", "Haruki Murakami");
        dataBuku1.display();

        // Menampilkan Address

        String addressBuku1 = Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println(addressBuku1);

        // Assignment Object
        Buku dataBuku2 = new Buku("Killing Commandantore", "Haruki Murakami");
        dataBuku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(dataBuku2));
        System.out.println(addressBuku2);

        // Mengubah nilai buku1
        dataBuku1.judul = "Norwegian Wood";
        dataBuku1.display();
        dataBuku2.display();
    }
}
