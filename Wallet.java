public class Wallet {
    private String password;
    private Integer balance;

    public Wallet(Integer balance, String password){
        this.balance = balance;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Integer getBalance(){
        return balance;
    }

    public void displayBalance() {
        System.out.println("Votre solde actuel est de " + this.balance);
    }

    public void addMoney(int amount) {
        this.balance += amount;
        System.out.println("Vous avez ajouté " + amount + " à votre portefeuille");
    }

    public void withdrawMoney(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Vous avez retiré " + amount + " de votre portefeuille");
        } else {
            System.out.println("Solde insuffisant");
        }
    }
}
