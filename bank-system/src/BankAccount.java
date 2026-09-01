public class BankAccount extends Account {

    private BankAccountType bankAccountType;

    public BankAccount(String accountNumber, double balance, Currency currency, BankAccountType bankAccountType) {
        super(accountNumber, currency, balance);
        this.bankAccountType = bankAccountType;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    @Override
    public String getAccountInfo() {
        return "Bank account: " + getAccountNumber()
                + ", type: " + bankAccountType
                + ", balance: " + getBalance()
                + " " + getCurrency();
    }

    @Override
    public String toString() {
        return getAccountInfo();
    }
}

