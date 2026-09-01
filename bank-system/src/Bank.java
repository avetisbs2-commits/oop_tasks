import java.util.ArrayList;

public class Bank {

    private String bankName;
    private Address address;
    private ArrayList<CardHolder> cardHolderList;

    public Bank(String bankName, Address address) {
        this.bankName = bankName;
        this.address = address;
        this.cardHolderList = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<CardHolder> getCardHolderList() {
        return cardHolderList;
    }

    public void setCardHolderList(ArrayList<CardHolder> cardHolderList) {
        this.cardHolderList = cardHolderList;
    }

    public void addCardHolder(CardHolder cardHolder) {
        cardHolderList.add(cardHolder);
    }

    @Override
    public String toString() {
        return bankName + " - " + address;
    }
}

