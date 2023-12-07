const prompt = require('prompt-sync')();


class Menu {
    constructor(wallet){
        this.wallet = wallet;
        this.transactions = []
    }
    
     launch() {
            while (true) {
                console.log("\n1. Afficher le solde");
                console.log("2. Ajouter de l'argent");
                console.log("3. Retirer de l'argent");
                console.log("4. Transactions");
                console.log("5. Quitter");
                let choice = prompt("Choisissez une option : ");
                let amount;
                let description;
                switch (choice) {
                    case '1':
                       this.wallet.displayBalance();
                       break;
                    case '2':
                       description = prompt("Description : ")
                       amount = prompt("Montant à ajouter : ");
                       this.wallet.addMoney(amount);
                       this.transactions.push({ description: description, amount : amount, type : "ajout" })
                       break;
                    case '3':
                       description = prompt("Description :")
                       amount = prompt("Montant à retirer : ");
                       this.wallet.withdrawMoney(amount);
                       this.transactions.push({ description: description, amount : amount, type : "retrait" })
                       break;
                    case '4':
                       console.log("Liste des transactions");
                       this.transactions.forEach(t => {
                        console.log(`Description : ${t.description}, montant : ${t.amount}, type : ${t.type}`);
                       });
         
                       break   
                    case '5':
                       console.log("Au revoir !");
                       return;
                    default:
                       console.log("Choix invalide, veuillez réessayer.");
                }
            }
        }
}

module.exports = Menu