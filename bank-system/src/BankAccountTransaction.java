public class BankAccountTransaction implements Transaction {

    @Override
    public void deposit(Account account, double amount) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a BankAccount
        // 2. Check that bank account type is DEBIT
        // 3. Add amount to balance
    }

    @Override
    public void withdraw(Account account, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that account is a BankAccount
        // 2. Check that bank account type is CREDIT
        // 3. Check that balance is enough
        // 4. Subtract amount from balance
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that both accounts are BankAccount objects
        // 2. Check that money goes from DEBIT account to CREDIT account
        // 3. Check that source account balance is enough
        // 4. Move money from source account to target account
    }

    @Override
    public double checkBalance(Account account) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a BankAccount
        // 2. Return the bank account balance
        return 0;
    }
}
