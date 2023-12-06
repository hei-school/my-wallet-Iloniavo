const Wallet = require('./Wallet');
const Menu = require('./Menu');
const prompt = require('prompt-sync')();

const wallet = new Wallet('username', 'your_password', 500);
const app = new Menu(wallet);

while (true) {
    let usernameToVerify = prompt("Bienvenue, entrer votre nom d'utilisateur : ")
    let passwordToVerify = prompt('Bienvenue, veuillez entrer votre mot de passe : ')
    if(wallet.authenticate(usernameToVerify, passwordToVerify)) {
        console.log("Vous êtes authentifiés");
        break
    } else {
        console.log("Réessayez !");
    } ;
}


app.launch()