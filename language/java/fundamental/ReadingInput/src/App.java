import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : ");
        String name = scanner.nextLine();
        byte age = scanner.nextByte();
        System.out.println("You are " + name);
        System.out.println("You are " + age + " years old.");
    }
}
