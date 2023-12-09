package main

import "fmt"

type Wallet struct {
	Balance  float64
	Cards []*Card
}

func NewWallet(balance float64) *Wallet {
	return &Wallet{
		Balance:  balance,
		Cards: []*Card{},
	}
}

func (w *Wallet) DisplayBalance() {
	fmt.Printf("Solde actuel : %.2f\n", w.Balance)
}

func (w *Wallet) AddMoney(amount float64) {
	w.Balance += amount
	fmt.Printf("Montant ajouté. Nouveau solde : %.2f\n", w.Balance)
}

func (w *Wallet) WithdrawMoney(amount float64) {
	if amount > w.Balance {
		fmt.Println("Fonds insuffisants.")
	} else {
		w.Balance -= amount
		fmt.Printf("Montant retiré. Nouveau solde : %.2f\n", w.Balance)
	}
}

func (w *Wallet) AddCard(card *Card) {
	w.Cards = append(w.Cards, card)
	fmt.Printf("Carte ajoutée : %s\n", card.GetName())
}

func (w *Wallet) RemoveCard(cardName string) {
	for i, card := range w.Cards {
		if card.GetName() == cardName {
			w.Cards = append(w.Cards[:i], w.Cards[i+1:]...)
			fmt.Printf("Carte retirée : %s\n", card.GetName())
			return
		}
	}
	fmt.Printf("Carte non trouvée : %s\n", cardName)
}

func (w *Wallet) DisplayAllCards() {
	fmt.Println("Cartes dans le portefeuille :")
	for _, card := range w.Cards {
		fmt.Printf("Nom : %s, Type : %s\n", card.GetName(), card.GetType())
	}
}
