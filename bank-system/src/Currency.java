public enum Currency {
    AMD(5.0),
    USD(2.0),
    RUB(3.0);

    private double interest;

    Currency(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}

