public class App {
    public static void main(String[] args) throws Exception {
        String message = "Hello, World!" + "!!" + "Hello \"Mosh\" "; // Create a string variable. its okay without new
                                                                     // keyword, because
        // string is a
        // special case
        System.out.println(message.length());
    }
}
