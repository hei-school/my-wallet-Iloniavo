from wallet import Wallet
from card import Card

class Menu:
    def __init__(self, wallet):
        self.wallet = wallet

    def menu(self):
        while True:
            print("\n1. Afficher le solde")
            print("2. Ajouter de l'argent")
            print("3. Retirer de l'argent")
            print("4. Afficher les cartes")
            print("5. Ajouter une carte")
            print("6. Retirer une carte")
            print("7. Ajouter des photos")
            print("8. Retirer des photos")
            print("9. Quitter")
            choice = input("Veuillez choisir une option : ")
            amount, card_name, card_type, photo_name, photo_value, description = 0, "", "", "", 0, ""

            if choice == "1":
                self.wallet.display_balance()
            elif choice == "2":
                description = input("Description : ")
                amount = float(input("Veuillez entrer le montant à ajouter : "))
                self.wallet.add_money(amount)
            elif choice == "3":
                description = input("Description : ")
                amount = float(input("Veuillez entrer le montant à retirer : "))
                self.wallet.withdraw_money(amount)
            elif choice == '4':
                self.wallet.display_all_cards()
            elif choice == '5':
                card_name = input("Nom de la carte : ")
                card_type = input("Type de la carte : ")
                new_card = Card(card_name, card_type)
                self.wallet.add_card(new_card)
                print("Carte ajoutée :", new_card.get_name())
            elif choice == '6':
                card_name = input("Nom de la carte à retirer : ")
                self.wallet.remove_card(card_name)
            elif choice == '7':
                # photo_name = input("Nom de la photo : ")
                # photo_value = int(input("Valeur de la photo : "))
                # new_photo = Photos()
                # new_photo.set_name(photo_name)
                # new_photo.set_values(photo_value)
                # self.wallet.add_photos(new_photo)
                # print("Photo ajoutée :", new_photo.get_name())
                print("Pas encore fonctionnel")
            elif choice == '8':
                # photo_name = input("Nom de la photo à retirer : ")
                # self.wallet.remove_photos(photo_name)
                print("Pas encore fonctionnel")
            elif choice == '9':
                print("Au revoir !")
                return
            else:
                print("Choix invalide, veuillez réessayer.")
