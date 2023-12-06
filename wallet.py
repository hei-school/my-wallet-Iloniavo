class Wallet:
    def __init__(self, balance, password):
        self.balance = balance
        self.password = password

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

    def is_owner(self, entered_password):
        return entered_password == self.password
