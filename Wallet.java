import java.util.Objects;

public class Wallet {
    private String username;
    private String password;
    private Double balance;

    public Wallet(String username, String password, Double balance){
        this.balance = balance;
        this.password = password;
        this.username = username;
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

    public Boolean authenticate(String username, String password){
        return (Objects.equals(username, this.username) && Objects.equals(password, this.password));
    }

}
