const prompt = require('prompt-sync')();

class Menu {
    constructor(wallet){
        this.wallet = wallet;
    }

     launch() {
            while (true) {
                console.log("\n1. Afficher le solde");
                console.log("2. Ajouter de l'argent");
                console.log("3. Retirer de l'argent");
                console.log("4. Quitter");
                let choice = prompt("Choisissez une option : ");
                let amount;
                switch (choice) {
                    case '1':
                       this.wallet.displayBalance();
                       break;
                    case '2':
                       amount = prompt("Montant à ajouter : ");
                       this.wallet.addMoney(amount);
                       break;
                    case '3':
                       amount = prompt("Montant à retirer : ");
                       this.wallet.withdrawMoney(amount);
                       break;
                    case '4':
                       return;
                    default:
                       console.log("Choix invalide, veuillez réessayer.");
                }
            }
        }
}

module.exports = Menu