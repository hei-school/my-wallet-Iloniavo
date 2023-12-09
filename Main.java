import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Wallet wallet = new Wallet(500.00);
        Menu app = new Menu(wallet, scanner);
        app.menu();
    }
}
