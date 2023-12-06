class Wallet {
    constructor(balance, password) {
        this.__balance = balance
        this.__password = password;
    }
 
    get password() {
        return this.__password;
    }
 
    set password(password) {
        this.__password = password;
    }

    get balance(){
        return this.__balance;
    }

    set balance(amount){
        this.__balance = amount
    }

    displayBalance() {
        console.log("Votre solde actuel est de " + this.balance);
    }

    addMoney(amount) {
        this.balance += amount;
        console.log("Vous avez ajouté " + amount + " à votre portefeuille");
    }

    withdrawMoney(amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            console.log("Vous avez retiré " + amount + " de votre portefeuille");
        } else {
            console.log("Solde insuffisant");
        }
    }

    isOwner(password){
        return password == this.password;
    }
};

module.exports = Wallet