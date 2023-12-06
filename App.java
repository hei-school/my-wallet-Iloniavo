import java.util.Scanner;

public class App {
    private Wallet wallet;
    private Scanner scanner;

    public App(Wallet wallet, Scanner scanner) {
        this.wallet = wallet;
        this.scanner = scanner;
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Afficher le solde");
            System.out.println("2. Ajouter de l'argent");
            System.out.println("3. Retirer de l'argent");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    wallet.displayBalance();
                    break;
                case 2:
                    System.out.print("Montant à ajouter : ");
                    int amount = scanner.nextInt();
                    wallet.addMoney(amount);
                    break;
                case 3:
                    System.out.print("Montant à retirer : ");
                    amount = scanner.nextInt();
                    wallet.withdrawMoney(amount);
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
