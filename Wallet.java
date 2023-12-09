import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Wallet {
    private Double balance;
    private List<Card> cards;
    private List<Photos> photos;



    public Wallet(Double balance){
        this.balance = balance;
        this.cards = new ArrayList<>();
        this.cards = new ArrayList<>();

    }

    public String getPassword() {
        return password;
    }

    public void displayBalance() {
        System.out.println("Votre solde actuel est de " + this.balance);
    }

    public void addMoney(Double amount) {
        this.balance += amount;
        System.out.println("Vous avez ajouté " + amount + " à votre portefeuille");
    }

    public void withdrawMoney(Double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Vous avez retiré " + amount + " de votre portefeuille");
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    public void addCard(Card card) {
        cards.add(card);
        System.out.println("Carte ajoutée : " + card.getName());
    }

    public void removeCard(String card) {
        cards.remove(card);
        System.out.println("Carte retirée : " + card);
    }

    public void displayAllCards() {
        System.out.println("Cartes dans le portefeuille :");
        for (Card card : cards) {
            System.out.println("Nom : " + card.getName() + ", Type : " + card.getType());
        }
    }

}
