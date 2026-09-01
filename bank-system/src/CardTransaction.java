public class CardTransaction implements Transaction {

    @Override
    public void deposit(Account account, double amount) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a CardAccount
        // 2. Check that the card is not BLOCKED
        // 3. Add amount to card balance
    }

    @Override
    public void withdraw(Account account, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that account is a CardAccount
        // 2. Check that the card is not BLOCKED
        // 3. Check that balance is enough
        // 4. Subtract amount from card balance
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that both accounts are CardAccount objects
        // 2. Check that the source card is not BLOCKED
        // 3. Check that the target card is not BLOCKED
        // 4. Check that source card balance is enough
        // 5. Move money from source card to target card
    }

    @Override
    public double checkBalance(Account account) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a CardAccount
        // 2. Return the card balance
        return 0;
    }

    public void blockCard(CardAccount cardAccount) {
        // TODO:
        // Change card status to BLOCKED.
    }
}
