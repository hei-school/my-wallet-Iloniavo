package main

func main() {
	initialBalance := 500.0

	wallet := NewWallet(initialBalance)
	app := NewApp(wallet)
	
	app.Menu()
}
