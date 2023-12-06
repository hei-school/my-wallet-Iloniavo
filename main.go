package main

import (
	"fmt"
)

func main() {
	// These are default values
	username := "username"
	password := "your_password"
	initialBalance := 500.0

	wallet := NewWallet(username, password, initialBalance)
	app := NewApp(wallet)

	var enteredUsername string
	var enteredPassword string

	for {
		fmt.Print("Entrez votre nom d'utilisateur :")
		fmt.Scan(&enteredUsername)
		fmt.Print("Bienvenue, veuillez entrer votre mot de passe : ")
		fmt.Scan(&enteredPassword)
		if wallet.authenticate(enteredUsername, enteredPassword) {
			fmt.Println("Authentifié avec succès.")
			break
		} else {
			fmt.Println("Mot de passe ou nom d'utilisateur incorrect. Réessayez.")
		}
	}

	app.Menu()
}
