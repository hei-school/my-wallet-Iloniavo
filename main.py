from wallet import Wallet
from menu import Menu


def main():
    password = "your_password"  # Remplacez cela par le mot de passe réel
    initial_balance = 500  # Remplacez cela par le solde initial souhaité

    wallet = Wallet(initial_balance, password)
    menu = Menu(wallet)

    while not wallet.is_owner(input("Bienvenue, veuillez entrer votre mot de passe : ")):
        print("Mot de passe incorrect. Réessayez.")

    print("Authentifié avec succès.")
    menu.menu()


if __name__ == "__main__":
    main()
