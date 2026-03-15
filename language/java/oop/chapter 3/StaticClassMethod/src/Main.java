import java.util.ArrayList;

class Player{
    private String name;

    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        // Setiap menambah object, maka namelist akan menambahkan this name kedalam namelist
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Name: " + this.name);
    }

    static void showNumberOfPlayer(){
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }

}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Adicondro");
        Player player2 = new Player("CondroAdi");
        Player player3 = new Player("Adiondroc");
        Player player4 = new Player("Condiadicon");

        Player.showNumberOfPlayer();
        player1.show();

        System.out.println("Names: " + Player.getNames());
    }
}