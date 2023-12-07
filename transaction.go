package main

type Transaction struct {
	Description string
	Amount      float64
	Category    string
}

func NewTransaction(description string, amount float64, category string) *Transaction {
	return &Transaction{
		Description: description,
		Amount:      amount,
		Category:    category,
	}
}
