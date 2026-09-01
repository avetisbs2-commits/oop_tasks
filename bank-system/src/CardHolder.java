import java.util.ArrayList;

public class CardHolder {

    private String passportNumber;
    private String fullName;
    private Address address;
    private ArrayList<CardAccount> cardList;
    private BankAccount bankAccount;

    public CardHolder(String passportNumber, String fullName, Address address, BankAccount bankAccount) {
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.address = address;
        this.bankAccount = bankAccount;
        this.cardList = new ArrayList<>();
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<CardAccount> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<CardAccount> cardList) {
        this.cardList = cardList;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void addCard(CardAccount cardAccount) {
        cardList.add(cardAccount);
    }

    @Override
    public String toString() {
        return "CardHolder: " + fullName
                + ", passport: " + passportNumber
                + ", address: " + address;
    }
}

