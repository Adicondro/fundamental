import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int income = 120_000;

        // if (income > 100_000) {
        // System.out.println("First condition is true");

        // } else if (income > 50_000) {

        // System.out.println("Second condition is true");
        // } else
        // System.out.println("All conditions are false");

        // String className = income > 100_000 ? "First" : "Second";

        // String role = "admin";

        // switch (role) {
        // case "admin":
        // System.out.println("You're an admin");
        // break;
        // case "moderator":
        // System.out.println("You're a moderator");
        // break;
        // default:
        // System.out.println("You're a guest");
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fizzBuzz = scanner.nextInt();

        if (fizzBuzz % 5 == 0 && fizzBuzz % 3 == 0)
            System.out.println("FizzBuzz");
        else if (fizzBuzz % 5 == 0)
            System.out.println("Fizz");
        else if (fizzBuzz % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println("Not a fizz or buzz");

        scanner.close();

    }

}
