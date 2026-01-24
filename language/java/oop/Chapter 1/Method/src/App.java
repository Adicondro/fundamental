// 1. Recap
/*
    a. Object is a rubbish, you can't create many object for the template, so that's why there is some OOP
    b. You already have class and object, class as template and object as the product
    c. You already could simplify a variable name with contructor, so you don't have to write the variable on the object/product side (Template for variable)
    d. Now you want to simplify on how your command would be saved (Template for command)
 */

class Mahasiswa {
    // Data Member
    String nama;
    String nim;
    Integer ipk;

    Mahasiswa(String nama, String nim, Integer ipk) {
        // Constructor
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // 3. There are 3 kind of method that usually we use

    // a. Method without return and no parameter
    void show() {
        System.out.println("Nama Anda: " + this.nama);
        System.out.println("NIM Anda: " + this.nim);
        System.out.println("IPK Anda: " + this.ipk);
    }

    // b. Set method -> To replace the data member more safer -> For encapsulation
    // part (Private Public)
    void setNama(String nama) {
        this.nama = nama;
    }

    // c. Get method -> To access the data member more safer -> For encapsulation
    // part (Private Public)
    String getNama() {
        return this.nama;
    }

    // d. Method with return and parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Adicondro", "1301213152", 4);

        // 2. You don't wanna write the method here (Command) like sysout or whatsoever,
        // so they introduce you method, to make some command template

        // Example
        // System.out.println(mahasiswa1.nama);
        // System.out.println(mahasiswa1.nim);
        // System.out.println(mahasiswa1.ipk);

        // 4. Call it
        mahasiswa1.show();
        mahasiswa1.setNama("адичондро");
        mahasiswa1.show();

        // With get method you can get more safer thing than just accessing it
        System.out.println(mahasiswa1.getNama());

        String data = mahasiswa1.sayHi("Halo");
        System.out.println(data);
    }
}
