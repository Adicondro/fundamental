
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double IPK;
    int semester;

    // Mahasiswa() {
    // System.out.println("Ini adalah constructor");
    // }

    Mahasiswa(String inputNama, String inputNim, String inputJurusan, double inputIPK, int inputSemester) {
        nama = inputNama;
        nim = inputNim;
        jurusan = inputJurusan;
        IPK = inputIPK;
        semester = inputSemester;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "123", "TI", 3.5, 3);

        System.out.println(mahasiswa1.nama);

    }
}
