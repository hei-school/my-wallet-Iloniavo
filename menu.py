from transaction import Transaction
from wallet import Wallet


class Menu:
    def __init__(self, wallet):
        self.wallet = wallet
        self.transactions = []

    def menu(self):
        while True:
            print("\nMenu:")
            print("1 - Afficher la solde")
            print("2 - Ajouter de l'argent")
            print("3 - Retirer de l'argent")
            print("4 - Transactions")
            print("5 - Quitter")
            choice = input("Veuillez choisir une option : ")

            if choice == "1":
                self.wallet.display_balance()
            elif choice == "2":
                description = input("Description : ")
                amount = float(input("Veuillez entrer le montant à ajouter : "))
                self.wallet.add_money(amount)
                self.transactions.append(Transaction(description, amount, "ajout"))
            elif choice == "3":
                description = input("Description : ")
                amount = float(input("Veuillez entrer le montant à retirer : "))
                self.wallet.withdraw_money(amount)
                self.transactions.append(Transaction(description, amount, "retrait"))
            elif choice == "4":
                print("Liste des transactions")
                for transaction in self.transactions:
                    print(
                        f"Description: {transaction.get_description()}, Montant: {transaction.get_amount()}, Type: {transaction.get_transaction_type()}")
            elif choice == "5":
                print("Au revoir !")
                break
            else:
                print("Option non valide. Veuillez réessayer.")
