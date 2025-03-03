class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // Constructor (Namanya harus sama)
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
    }

    // Method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return dan tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // Method dengan return dan dengan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }

}

class Dosen {
    String nama;

    Dosen(String nama) {
        this.nama = nama;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "12345");
        mahasiswa1.show();
        mahasiswa1.setNama("Ani");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        String data = mahasiswa1.sayHi("Halo");
        System.out.println(data);

        Dosen dosen1 = new Dosen("Otong"); // can't give some output because there is no method to show the data
    }
}
