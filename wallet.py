class Wallet:
    def __init__(self, balance):
        self.balance = balance
        self.cards = []

    def display_balance(self):
        print(f"Solde actuel : {self.balance}")

    def add_money(self, amount):
        self.balance += amount
        print(f"Montant ajouté. Nouveau solde : {self.balance}")

    def withdraw_money(self, amount):
        if amount > self.balance:
            print("Fonds insuffisants.")
        else:
            self.balance -= amount
            print(f"Montant retiré. Nouveau solde : {self.balance}")

    def add_card(self, card):
        self.cards.append(card)
        print("Carte ajoutée :", card.get_name())

    def remove_card(self, card_name):
        card_to_remove = next((card for card in self.cards if card.get_name() == card_name), None)
        if card_to_remove:
            self.cards.remove(card_to_remove)
            print("Carte retirée :", card_to_remove.get_name())
        else:
            print("Carte non trouvée :", card_name)
    def display_all_cards(self):
        print("Cartes dans le portefeuille :")
        for card in self.cards:
            print(f"Nom : {card.get_name()}, Type : {card.get_type()}")        