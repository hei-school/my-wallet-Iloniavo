import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Wallet wallet = new Wallet("username", "your_password", 500.00);
        Menu app = new Menu(wallet, scanner);

       /* while (true) {
            System.out.println("Bienvenue, entrez votre nom d'utilisateur : ");
            String username = scanner.nextLine();
            System.out.println("veuillez entrer votre mot de passe : ");
            String password = scanner.nextLine();
            if(wallet.authenticate(username, password)){
                System.out.println("Vous êtes authentifié");
                break;
            }
            System.out.println("Réessayez");
        }
        */


        app.menu();
    }
}
