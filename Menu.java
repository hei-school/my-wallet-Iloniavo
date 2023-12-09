import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Wallet wallet;
    public Menu(Wallet wallet, Scanner scanner) {
        this.wallet = wallet;
    }
    public void menu() {
        while (true) {
            System.out.println("1. Afficher le solde");
            System.out.println("2. Ajouter de l'argent");
            System.out.println("3. Retirer de l'argent");
            System.out.println("4. Ajouter une carte");
            System.out.println("5. Retirer une carte");
            System.out.println("6. Afficher toutes les cartes");
            System.out.println("7. Ajouter des photos");
            System.out.println("8. Sortir des photos");
            System.out.println("9. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = Main.scanner.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    wallet.displayBalance();
                    break;
                case 2:
                    Main.scanner.nextLine();
                    System.out.print("Montant à ajouter : ");
                    amount = Main.scanner.nextDouble() ;
                    wallet.addMoney(amount);
                    break;
                case 3:
                    Main.scanner.nextLine();
                    System.out.print("Montant à retirer : ");
                    amount = Main.scanner.nextDouble();
                    wallet.withdrawMoney(amount);
                    break;
                case 4:
                    Main.   scanner.nextLine(); // Consume the newline character
                    System.out.print("Nom de la carte : ");
                    String cardName = Main.scanner.nextLine();
                    System.out.print("Type de la carte : ");
                    String cardType = Main.scanner.nextLine();
                    Card newCard = new Card(cardName, cardType);
                    wallet.addCard(newCard);
                    break;
                case 5:
                    Main.scanner.nextLine(); // Consume the newline character
                    System.out.print("Nom de la carte à retirer : ");
                    String cardToRemove = Main.scanner.nextLine();
                    wallet.removeCard(cardToRemove);
                    break;
                case 6:
                    wallet.displayAllCards();
                    break;
                case 7:
                    System.out.println("Pas encore fonctionnel");
                 //   scanner.nextLine();
                 //   System.out.print("Nom de la photo : ");
                 //   String photoName = Main.scanner.nextLine();
                 //   System.out.print("Valeur de la photo : ");
                 //   int photoValue = Main.scanner.nextInt();
                 //   Photos newPhoto = new Photos();
                 //   newPhoto.setName(photoName);
                 //   newPhoto.setValues(photoValue);
                 //   wallet.addPhotos(newPhoto);
                    break;
                case 8:
                    System.out.println("Pas encore fonctionnel");
               //     scanner.nextLine();
                 //   System.out.print("Nom de la photo à retirer : ");
                    // String photoToRemove = Main.scanner.nextLine();
              //      wallet.removePhotos(photoToRemove);
                    break;
                case 9:
                    Main.scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
