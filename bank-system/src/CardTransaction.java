public class CardTransaction implements Transaction {

    @Override
    public void deposit(Account account, double amount) throws BankTransactionException {
        // TODO:
        // 1. Check that account is a CardAccount
        if(!(account instanceof CardAccount)){
            throw new BankTransactionException("Account is not Card Account");
        }
        // 2. Check that the card is not BLOCKED
        if (((CardAccount) account).getCardStatus() == CardStatus.BLOCKED){
            throw new BankTransactionException("Account is blocked");
        }
        // 3. Add amount to card balance
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(Account account, double amount)
            throws BankTransactionException, InsufficientFundsException {
        // TODO:
        // 1. Check that account is a CardAccount
        if(!(account instanceof CardAccount)){
            throw new BankTransactionException("Account is not Card Account");
        }
        // 2. Check that the card is not BLOCKED
        if (((CardAccount) account).getCardStatus() == CardStatus.BLOCKED){
            throw new BankTransactionException("Account is blocked");
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
        // 1. Check that both accounts are CardAccount objects
        if(!(fromAccount instanceof CardAccount)  || !(toAccount instanceof CardAccount)){
            throw new BankTransactionException("Account is not Card Account");
        }
        // 2. Check that the source card is not BLOCKED
        // 3. Check that the target card is not BLOCKED
        if (((CardAccount) fromAccount).getCardStatus() == CardStatus.BLOCKED){
            throw new BankTransactionException("Source Account is blocked");
        }
        if (((CardAccount) toAccount).getCardStatus() == CardStatus.BLOCKED){
            throw new BankTransactionException("Target Account is blocked");
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
        // 1. Check that account is a CardAccount
        if(!(account instanceof CardAccount)){
            throw new BankTransactionException("Account is not Card Account");
        }
        // 2. Return the card balance
        return account.getBalance();
    }

    public void blockCard(CardAccount cardAccount) {
        // TODO:
        // Change card status to BLOCKED.
        cardAccount.setCardStatus(CardStatus.BLOCKED);
    }
}