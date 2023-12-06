from wallet import Wallet


class Menu:
    def __init__(self, wallet):
        self.wallet = wallet

    def menu(self):
        while True:
            print("\nMenu:")
            print("1 - Afficher la solde")
            print("2 - Ajouter de l'argent")
            print("3 - Retirer de l'argent")
            print("4 - Quitter")

            choice = input("Veuillez choisir une option : ")

            if choice == "1":
                self.wallet.display_balance()
            elif choice == "2":
                amount = float(input("Veuillez entrer le montant à ajouter : "))
                self.wallet.add_money(amount)
            elif choice == "3":
                amount = float(input("Veuillez entrer le montant à retirer : "))
                self.wallet.withdraw_money(amount)
            elif choice == "4":
                print("Au revoir !")
                break
            else:
                print("Option non valide. Veuillez réessayer.")
