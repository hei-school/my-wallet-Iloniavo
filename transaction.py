class Transaction:
    def __init__(self, description, amount, transaction_type):
        self._description = description
        self._amount = amount
        self._transaction_type = transaction_type

    def get_description(self):
        return self._description

    def get_amount(self):
        return self._amount

    def get_transaction_type(self):
        return self._transaction_type