package main

import (
	"bufio"
	"fmt"
	"os"
)

type App struct {
	Wallet       *Wallet
	Transactions []Transaction
}

func NewApp(wallet *Wallet) *App {
	return &App{Wallet: wallet}
}

func (a *App) Menu() {

	scanner := bufio.NewScanner(os.Stdin)

	for {
		fmt.Println("\nMenu:")
		fmt.Println("1 - Afficher la solde")
		fmt.Println("2 - Ajouter de l'argent")
		fmt.Println("3 - Retirer de l'argent")
		fmt.Println("4 - Transactions")
		fmt.Println("5 - Quitter")

		var choice int
		fmt.Print("Veuillez choisir une option : ")
		fmt.Scanln(&choice)

		switch choice {
		case 1:
			a.Wallet.DisplayBalance()
		case 2:
			fmt.Println("Description : ")
			scanner.Scan()
			description := scanner.Text()

			var amount float64
			fmt.Println("Veuillez entrer le montant à ajouter : ")
			fmt.Scanln(&amount)
			a.Wallet.AddMoney(amount)
			a.Transactions = append(a.Transactions, Transaction{Description: description, Amount: amount, Category: "ajout"})

		case 3:
			fmt.Print("Description : ")
			scanner.Scan()
			description := scanner.Text()

			var amount float64
			fmt.Println("Veuillez entrer le montant à retirer : ")
			fmt.Scanln(&amount)
			a.Wallet.WithdrawMoney(amount)

			a.Transactions = append(a.Transactions, Transaction{Description: description, Amount: amount, Category: "ajout"})

		case 4:
			fmt.Println("Liste des transactions")
			for _, transaction := range a.Transactions {
				fmt.Printf("Description: %s, Montant: %.2f, Type: %s\n", transaction.Description, transaction.Amount, transaction.Category)
			}
		case 5:
			fmt.Println("Au revoir !")
			return
		default:
			fmt.Println("Option non valide. Veuillez réessayer.")
		}
	}
}
