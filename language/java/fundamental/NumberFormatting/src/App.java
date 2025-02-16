import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.format(123456.78);
    }
}
