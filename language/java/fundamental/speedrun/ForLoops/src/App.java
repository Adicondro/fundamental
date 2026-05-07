import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!");
        }

        int num = 0;
        while (num < 10) {
            System.out.println("Hello, World!");
            num++;
        }

        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println("Output: " + input);
        }
    }
}
