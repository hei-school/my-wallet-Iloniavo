from wallet import Wallet
from menu import Menu


def main():
    username = "username"
    password = "your_password"  # Remplacez cela par le mot de passe réel
    initial_balance = 500  # Remplacez cela par le solde initial souhaité

    wallet = Wallet(username, password, initial_balance)
    menu = Menu(wallet)

    while not wallet.authenticate(input("Bienvenue, veuillez entrer votre nom d'utilisateur : "),
                                  input("Veuillez entrer votre mot de passe : ")):
        print("Nom d'utilisateur ou mot de passe incorrect. Réessayez.")

    print("Authentifié avec succès.")
    menu.menu()


if __name__ == "__main__":
    main()
