const prompt = require('prompt-sync')();
const Card = require('./Card');
class Menu {
    constructor(wallet){
        this.wallet = wallet;
    }
    
     launch() {
            while (true) {
                console.log("1. Afficher le solde");
                console.log("2. Ajouter de l'argent");
                console.log("3. Retirer de l'argent");
                console.log("4. Afficher les cartes");
                console.log("5. Ajouter une carte");
                console.log("6. Retirer une carte");
                console.log("7. Ajouter des photos");
                console.log("8. Retirer des photos");
                console.log("9. Quitter");
                let choice = prompt("Choisissez une option : ");
                let amount, cardName, cardType, photoName, photoValue, description;
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
                        this.wallet.displayAllCards();
                        break;
                    case '5':
                        cardName = prompt("Nom de la carte : ");
                        cardType = prompt("Type de la carte : ");
                        const newCard = new Card(cardName, cardType);
                        this.wallet.addCard(newCard);
                        console.log("Carte ajoutée : " + newCard.getName());
                        break;
                    case '6':
                        cardName = prompt("Nom de la carte à retirer : ");
                        this.wallet.removeCard(cardName);
                        break;
                     case '7':
                        console.log("Pas eencore fonctonnel");
                     //       photoName = prompt("Nom de la photo : ");
                     //       photoValue = parseInt(prompt("Valeur de la photo : "));
                     //       const newPhoto = new Photos();
                     //       newPhoto.setName(photoName);
                     //       newPhoto.setValues(photoValue);
                     //       this.wallet.addPhotos(newPhoto);
                     //       console.log("Photo ajoutée : " + newPhoto.getName());
                     //       break;
                      case '8':
                        console.log("Pas encore fonctionnel");
                           // photoName = prompt("Nom de la photo à retirer : ");
                           // this.wallet.removePhotos(photoName);
                           // break;
                       case '9':
                        console.log("Au revoir !");   
                        return
                    default:
                       console.log("Choix invalide, veuillez réessayer.");
                }
            }
        }
}

module.exports = Menu