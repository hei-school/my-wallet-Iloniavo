const Wallet = require('./Wallet');
const Menu = require('./Menu');
const prompt = require('prompt-sync')();


function isOwner(passwordToVerify, passwordVerifier){
    return passwordToVerify === passwordVerifier;
}

const wallet = new Wallet(500, 'password');
const app = new Menu(wallet);

while (true) {
    let passwordToVerify = prompt('Bienvenue, veuillez entrer votre mot de passe : ')
    if(isOwner(passwordToVerify, wallet.password)) {
        console.log("Vous êtes authentifiés");
        break
    } else {
        console.log("Réessayez !");
    } ;
}


app.launch()