public class Rental {

    private int id;
    private Customer customer;
    private Vehicle vehicle;
    private int numberOfDays;
    private double totalPrice;

    public Rental(int id, Customer customer, Vehicle vehicle, int numberOfDays, double totalPrice) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
        this.numberOfDays = numberOfDays;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        if (customer == null || vehicle == null) {
            return "No rental";
        }

        return "Customer: " + customer.getFirstName() + " " + customer.getLastName()
                + "\nVehicle: " + vehicle.getBrand() + " " + vehicle.getModel()
                + "\nDays: " + numberOfDays
                + "\nTotal: " + totalPrice;
    }
}

