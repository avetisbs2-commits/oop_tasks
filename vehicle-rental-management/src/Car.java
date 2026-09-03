public class Car extends Vehicle {

    private int numberOfDoors;
    private boolean automatic;

    public Car(int id, String brand, String model, double pricePerDay, int numberOfDoors, boolean automatic) {
        super(id, brand, model, pricePerDay);
        this.numberOfDoors = numberOfDoors;
        this.automatic = automatic;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String getVehicleDetails() {
        // TODO:
        // Return car information as text.
        // Include brand, model, status, number of doors, and transmission type.
        return "Car brand: " + getBrand()
                + ", model: " + getModel()
                + ", status: " + getStatus()
                + ", number of doors: " + getNumberOfDoors()
                + " Is automatic" + isAutomatic();
    }

    @Override
    public double calculateRentalPrice(int days) {
        // TODO:
        // Calculate rental price for a car.
        // Use pricePerDay * days.
        return getPricePerDay() * days;
    }

    @Override
    public void rent() {
        // TODO:
        // Change the car status when it is rented.
        setStatus(VehicleStatus.RENTED);
    }

    @Override
    public void returnVehicle() {
        // TODO:
        // Change the car status when it is returned.
        setStatus(VehicleStatus.AVAILABLE);
    }
}

