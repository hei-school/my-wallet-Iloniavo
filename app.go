package main

import "fmt"

type App struct {
	Wallet *Wallet
}

func NewApp(wallet *Wallet) *App {
	return &App{Wallet: wallet}
}

func (a *App) Menu() {
	for {
		fmt.Println("\nMenu:")
		fmt.Println("1 - Afficher la solde")
		fmt.Println("2 - Ajouter de l'argent")
		fmt.Println("3 - Retirer de l'argent")
		fmt.Println("4 - Quitter")

		var choice int
		fmt.Print("Veuillez choisir une option : ")
		fmt.Scan(&choice)

		switch choice {
		case 1:
			a.Wallet.DisplayBalance()
		case 2:
			var amount float64
			fmt.Print("Veuillez entrer le montant à ajouter : ")
			fmt.Scan(&amount)
			a.Wallet.AddMoney(amount)
		case 3:
			var amount float64
			fmt.Print("Veuillez entrer le montant à retirer : ")
			fmt.Scan(&amount)
			a.Wallet.WithdrawMoney(amount)
		case 4:
			fmt.Println("Au revoir !")
			return
		default:
			fmt.Println("Option non valide. Veuillez réessayer.")
		}
	}
}
