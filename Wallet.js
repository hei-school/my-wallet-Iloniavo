class Wallet {
    constructor(balance) {
        this.__balance = balance
        this.cards = [];
        this.photos = [];
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
        this.balance += parseInt(amount);
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

    addCard(card) {
        this.cards.push(card);
        console.log("Carte ajoutée : " + card.getName());
    }

    removeCard(cardName) {
        const cardToRemove = this.findCard(cardName);
        if (cardToRemove !== null) {
            this.cards.splice(this.cards.indexOf(cardToRemove), 1);
            console.log("Carte retirée : " + cardToRemove.getName());
        } else {
            console.log("Carte non trouvée : " + cardName);
        }
    }

    findCard(cardName) {
        return this.cards.find(card => card.getName() === cardName) || null;
    }

    displayAllCards() {
        console.log("Cartes dans le portefeuille :");
        if(this.cards.length() === 0) console.log("Pas de cartes");
        this.cards.forEach(card => {
            console.log("Nom : " + card.getName() + ", Type : " + card.getType());
        });
    }

};

module.exports = Wallet