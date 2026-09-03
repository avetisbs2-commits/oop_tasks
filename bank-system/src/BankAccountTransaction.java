public class BankAccountTransaction implements Transaction {

    @Override
    public void deposit(Account account, double amount) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a BankAccount
        if (!(account instanceof BankAccount)){
            throw new BankTransactionException("Account is not Bank Account");
        }
        // 2. Check that bank account type is DEBIT
        if (!(((BankAccount) account).getBankAccountType() == BankAccountType.DEBIT)){
            throw new BankTransactionException("Account is not Debit");
        }
        // 3. Add amount to balance
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(Account account, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that account is a BankAccount
        if (!(account instanceof BankAccount)){
            throw new BankTransactionException("Account is not Bank Account");
        }
        // 2. Check that bank account type is CREDIT
        if (!(((BankAccount) account).getBankAccountType() == BankAccountType.CREDIT)){
            throw new BankTransactionException("Account is not Credit");
        }
        // 3. Check that balance is enough
        if (account.getBalance() < amount){
            throw new InsufficientFundsException("Not enough money");
        }
        // 4. Subtract amount from card balance
        account.setBalance(account.getBalance() - amount);
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that both accounts are BankAccount objects
        if(!(fromAccount instanceof BankAccount)  || !(toAccount instanceof BankAccount)){
            throw new BankTransactionException("Account is not Bank Account");
        }
        // 2. Check that money goes from DEBIT account to CREDIT account
        if (((BankAccount) fromAccount).getBankAccountType() != BankAccountType.DEBIT
        || ((BankAccount) toAccount).getBankAccountType() != BankAccountType.CREDIT){
            throw new BankTransactionException("Money should go from DEBIT account to CREDIT account");
        }
        // 4. Check that source card balance is enough
        if (fromAccount.getBalance() < amount){
            throw new InsufficientFundsException("Not enough money");
        }
        // 5. Move money from source card to target card
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
    }

    @Override
    public double checkBalance(Account account) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a BankAccount
        if (!(account instanceof BankAccount)){
            throw new BankTransactionException("Account is not Bank Account");
        }
        // 2. Return the bank account balance
        return account.getBalance();
    }
}
