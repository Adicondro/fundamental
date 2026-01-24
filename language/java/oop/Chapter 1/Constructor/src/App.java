
// 1. Problem : Imagine you want to add many object with the same description over and over again
// Example :
/*         
    Polos objectPolos1 = new Polos();    
    objectPolos.dataString = "Polos";
    objectPolos.dataInteger = 0;

    Polos objectPolos2 = new Polos();    
    objectPolos.dataString = "Polos";
    objectPolos.dataInteger = 0;
*/

// 2. Solution : You can set the variable on the class, on the template first
// Example :
/* 
    // 3. Define the component + description
    String dataString = "polos";
    int dataInteger = 0;
*/

// 4. Problem: Sometimes you don't want to put only one kind of description AND EVEN not only just a descriptions
// Sometimes you want to define some command like sysout

// 5. Solution: Make some constructor

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    String nam1;

    // 6. Make the constructor
    // Notes: Like you fill something in the object with anything (Command or new
    // parameter/component)

    // 7. Example : constructor with the command
    // Mahasiswa() {
    // System.out.println("This is constructor");
    // }

    // 8. Example : constructor with just the parameter
    // Notes: This is going to be used on any case to assign many object, because
    // its more clean: you can gather many variable in here, also command

    Mahasiswa(String nama, String NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;

        System.out.println("This is mahasiswa");
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // 9. Call it without defines it first
        // Mahasiswa mahasiswa1 = new Mahasiswa();

        // 10. Call the constructor, and define the variable
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "1301213152", "Informatika");

        // No need to do this
        /*
         * mahasiswa1.nama = "ucup";
         * mahasiswa1.NIM = "1301230123";
         * mahasiswa1.jurusan = "Teknik Perteknikan";
         * mahasiswa1.IPK = 4.0;
         * mahasiswa1.umur = 17;
         */


         System.out.println(mahasiswa1.nama);
         System.out.println(mahasiswa1.NIM);
         System.out.println(mahasiswa1.jurusan);
    }
}

// Conclusion:

// 1. To ensure you can make 1 variable with many objects, you can assign the
// variable on the class first
// 2. To ensyre you can make many variables (or even adding some command) with
// many objects EFFICIENTLY, you can make some CONSTRUCTOR