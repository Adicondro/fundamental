
// Membuat class sebagai template

// 1. You have to made the class (The template)
class Mahasiswa {
    // 3. You can set the class component, like a body
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {

        // 2. You have to make the instance, the product, the object
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // 4. Set the component specific name, like the specific description
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "1301230123";
        mahasiswa1.jurusan = "Teknik Perteknikan";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        // 5. Example of other objects

        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa2.nama = "ani";
        mahasiswa2.NIM = "130320123";
        mahasiswa2.jurusan = "Teknik Perteknikan";
        mahasiswa2.IPK = 3.0;
        mahasiswa2.umur = 21;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

        // Conclusion: We can make many object like mahasiswa1, mahasiswa2, mahasiswa3,
        // and so on...
        // With different description
    }
}
