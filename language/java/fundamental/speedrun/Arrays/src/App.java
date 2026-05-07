import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // int[] numbers = new int[5];
        // numbers[0] = 1;

        // System.out.println(numbers[0]);

        // Old way of creating an array

        int[] listOfNumbers = { 1, 6, 4, 16, 9 };

        Arrays.sort(listOfNumbers);

        System.out.println(listOfNumbers.length);

        System.out.println(Arrays.toString(listOfNumbers));

    }
}
