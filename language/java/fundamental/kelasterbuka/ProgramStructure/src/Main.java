
class Mahasiswa{
    private String name;

    Mahasiswa(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + this.name);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup");

        mahasiswa1.display();

        mahasiswa1.setName("Anderson");

        mahasiswa1.display();
    }
}