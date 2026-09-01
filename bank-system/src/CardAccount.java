public class CardAccount extends Account {

    private String cvv;
    private String expirationDate;
    private CardType cardType;
    private CardStatus cardStatus;

    public CardAccount(
            String accountNumber,
            String cvv,
            String expirationDate,
            CardType cardType,
            double balance,
            CardStatus cardStatus,
            Currency currency
    ) {
        super(accountNumber, currency, balance);
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.cardStatus = cardStatus;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    @Override
    public String getAccountInfo() {
        return "Card account: " + getAccountNumber()
                + ", type: " + cardType
                + ", status: " + cardStatus
                + ", balance: " + getBalance()
                + " " + getCurrency();
    }

    @Override
    public String toString() {
        return getAccountInfo();
    }
}

