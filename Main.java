import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public Main(){
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main(); // Appeler le constructeur pour initialiser le scanner

        Wallet wallet = new Wallet(500, "password");
        App app = new App(wallet, scanner);

        while (true) {
            System.out.println("Bienvenue, veuillez entrer votre mot de passe : ");
            String password = scanner.nextLine();
            if(isOwner(password, wallet.getPassword())){
                System.out.println("Vous êtes authentifié");
                break;
            }
            System.out.println("Réessayez");
        }

        app.menu();
    }

    public static Boolean isOwner(String passwordToVerify, String passwordVerifier){
        return Objects.equals(passwordToVerify, passwordVerifier);
    }
}
