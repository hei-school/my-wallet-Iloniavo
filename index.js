const Wallet = require('./Wallet');
const Menu = require('./Menu');

const wallet = new Wallet(500);
const app = new Menu(wallet);
app.launch()