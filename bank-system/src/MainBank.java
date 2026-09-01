public class MainBank {

    public static void main(String[] args) {

        Address bankAddress = new Address(
                "Armenia",
                "Yerevan",
                "Yerevan",
                "Baghramyan",
                "10"
        );

        Address customerAddress = new Address(
                "Armenia",
                "Yerevan",
                "Yerevan",
                "Mashtots",
                "25"
        );

        Bank bank = new Bank("Student Bank", bankAddress);

        BankAccount debitAccount = new BankAccount(
                "1234567890123456",
                1000,
                Currency.AMD,
                BankAccountType.DEBIT
        );

        BankAccount creditAccount = new BankAccount(
                "6543210987654321",
                300,
                Currency.USD,
                BankAccountType.CREDIT
        );

        CardAccount visaCard = new CardAccount(
                "1111222233334444",
                "123",
                "12/28",
                CardType.VISA,
                500,
                CardStatus.ACTIVE,
                Currency.AMD
        );

        CardAccount masterCard = new CardAccount(
                "5555666677778888",
                "456",
                "10/27",
                CardType.MASTERCARD,
                250,
                CardStatus.ACTIVE,
                Currency.AMD
        );

        CardHolder cardHolder = new CardHolder(
                "AN123456",
                "John Smith",
                customerAddress,
                debitAccount
        );

        cardHolder.addCard(visaCard);
        cardHolder.addCard(masterCard);
        bank.addCardHolder(cardHolder);

        System.out.println("=== BANK ===");
        System.out.println(bank);

        System.out.println();
        System.out.println("=== CARD HOLDER ===");
        System.out.println(cardHolder);

        System.out.println();
        System.out.println("=== ACCOUNTS ===");
        System.out.println(debitAccount);
        System.out.println(creditAccount);
        System.out.println(visaCard);
        System.out.println(masterCard);

        Transaction cardTransaction = new CardTransaction();
        Transaction bankAccountTransaction = new BankAccountTransaction();

        try {
            System.out.println();
            System.out.println("=== CARD BALANCES BEFORE TRANSFER ===");
            System.out.println("Visa card balance: " + cardTransaction.checkBalance(visaCard));
            System.out.println("Mastercard balance: " + cardTransaction.checkBalance(masterCard));

            System.out.println();
            System.out.println("=== SEND MONEY FROM ONE CARD TO ANOTHER ===");
            cardTransaction.deposit(visaCard, 100);
            cardTransaction.withdraw(visaCard, 50);
            cardTransaction.transfer(visaCard, masterCard, 200);
            System.out.println(visaCard);
            System.out.println(masterCard);

            System.out.println();
            System.out.println("=== BANK ACCOUNT BALANCES BEFORE TRANSFER ===");
            System.out.println("Debit account balance: " + bankAccountTransaction.checkBalance(debitAccount));
            System.out.println("Credit account balance: " + bankAccountTransaction.checkBalance(creditAccount));

            System.out.println();
            System.out.println("=== SEND MONEY FROM ONE ACCOUNT TO ANOTHER ===");
            bankAccountTransaction.deposit(debitAccount, 500);
            bankAccountTransaction.transfer(debitAccount, creditAccount, 300);
            System.out.println(debitAccount);
            System.out.println(creditAccount);
        } catch (BankTransactionException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
