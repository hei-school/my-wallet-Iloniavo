package main

import (
	"fmt"
)

type App struct {
	Wallet       *Wallet
}

func NewApp(wallet *Wallet) *App {
	return &App{Wallet: wallet}
}

func (a *App) Menu() {
	for {
		fmt.Println("\n1. Afficher le solde")
		fmt.Println("2. Ajouter de l'argent")
		fmt.Println("3. Retirer de l'argent")
		fmt.Println("4. Afficher les cartes")
		fmt.Println("5. Ajouter une carte")
		fmt.Println("6. Retirer une carte")
		fmt.Println("7. Ajouter des photos")
		fmt.Println("8. Retirer des photos")
		fmt.Println("9. Quitter")

		var choice int
		var cardName, cardType string
		fmt.Print("Veuillez choisir une option : ")
		fmt.Scanln(&choice)

		switch choice {
		case 1:
			a.Wallet.DisplayBalance()
		case 2:
			var amount float64
			fmt.Println("Veuillez entrer le montant à ajouter : ")
			fmt.Scanln(&amount)
			a.Wallet.AddMoney(amount)

		case 3:
			var amount float64
			fmt.Println("Veuillez entrer le montant à retirer : ")
			fmt.Scanln(&amount)
			a.Wallet.WithdrawMoney(amount)
		case 4:
			fmt.Println("Liste des cartes")
			for _, card := range a.Wallet.Cards {
				fmt.Printf("Nom : %s, Type : %s\n", card.GetName(), card.GetType())
			}
		case 5:
			fmt.Print("Nom de la carte : ")
			fmt.Scanln(&cardName)
			fmt.Print("Type de la carte : ")
			fmt.Scanln(&cardType)
			newCard := NewCard(cardName, cardType)
			a.Wallet.AddCard(newCard)
			fmt.Printf("Carte ajoutée : %s\n", newCard.GetName())
		case 6:
			fmt.Print("Nom de la carte à retirer : ")
			fmt.Scanln(&cardName)
			a.Wallet.RemoveCard(cardName)
		case 7:
			fmt.Print("Pas encore fonctionnel")
			// fmt.Print("Nom de la photo : ")
			// fmt.Scanln(&photoName)
			// fmt.Print("Valeur de la photo : ")
			// fmt.Scanln(&amount)
			// newPhoto := NewPhotos()
			// newPhoto.SetValues(amount)
			// m.wallet.AddPhotos(newPhoto)
			// fmt.Printf("Photo ajoutée : %s\n", newPhoto.GetName())
		case 8:
			fmt.Print("Pas encore fonctionnel")
			// fmt.Print("Nom de la photo à retirer : ")
			// fmt.Scanln(&photoName)
			// m.wallet.RemovePhotos(photoName)
		case 9:
			fmt.Println("Au revoir !")
			return
		default:
			fmt.Println("Choix invalide, veuillez réessayer.")
		}
	}
}
