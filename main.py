from wallet import Wallet
from menu import Menu


def main():
    wallet = Wallet(500)
    menu = Menu(wallet)
    menu.menu()

if __name__ == "__main__":
    main()
