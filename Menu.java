import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Wallet wallet;
    private static final List<Transaction> transactions = new ArrayList<>();

    public Menu(Wallet wallet, Scanner scanner) {
        this.wallet = wallet;
    }

    public void displayTransaction (){

    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Afficher le solde");
            System.out.println("2. Ajouter de l'argent");
            System.out.println("3. Retirer de l'argent");
            System.out.println("4. Transactions");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = Main.scanner.nextInt();
            double amount;
            String reason;
            switch (choice) {
                case 1:
                    wallet.displayBalance();
                    break;
                case 2:
                    Main.scanner.nextLine();
                    System.out.println("Description :");
                    reason = Main.scanner.nextLine();
                    System.out.print("Montant à ajouter : ");
                    amount = Main.scanner.nextDouble() ;
                    wallet.addMoney(amount);
                    transactions.add(new Transaction("ajout", amount, reason));
                    break;
                case 3:
                    Main.scanner.nextLine();
                    System.out.println("Description : ");
                    reason = Main.scanner.nextLine();
                    System.out.print("Montant à retirer : ");
                    amount = Main.scanner.nextDouble();
                    wallet.withdrawMoney(amount);
                    transactions.add(new Transaction("retrait", amount, reason));
                    break;
                case 4:
                    System.out.println("Liste des transactions");
                    if (transactions.size() == 0) {
                        System.out.println("Aucune transaction");
                    }
                    for (Transaction transaction : transactions){
                        System.out.print("Description : " + transaction.getReason() + " , Montant : " + transaction.getValue() + " , type : "+ transaction.getType());
                    }
                    break;
                case 5:
                    Main.scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
