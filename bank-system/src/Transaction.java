public interface Transaction {

    void deposit(Account account, double amount) throws BankTransactionException;

    void withdraw(Account account, double amount) throws BankTransactionException, InsufficientFundsException;

    void transfer(Account fromAccount, Account toAccount, double amount)
            throws BankTransactionException, InsufficientFundsException;

    double checkBalance(Account account) throws BankTransactionException;
}
