package main

import "fmt"

type Wallet struct {
	Balance  float64
	Password string
	Username string
}

func NewWallet(username string, password string, balance float64) *Wallet {
	return &Wallet{
		Balance:  balance,
		Password: password,
		Username: username,
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

func (w *Wallet) authenticate(enteredUsername string, enteredPassword string) bool {
	return enteredPassword == w.Password && enteredUsername == w.Username
}
