public class Van extends Vehicle {

    private double cargoCapacity;

    public Van(int id, String brand, String model, double pricePerDay, double cargoCapacity) {
        super(id, brand, model, pricePerDay);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String getVehicleDetails() {
        // TODO:
        // Return van information as text.
        // Include brand, model, status, and cargo capacity.
        return "";
    }

    @Override
    public double calculateRentalPrice(int days) {
        // TODO:
        // Calculate rental price for a van.
        // Add 15% to the base price.
        return 0;
    }

    @Override
    public void rent() {
        // TODO:
        // Change the van status when it is rented.
    }

    @Override
    public void returnVehicle() {
        // TODO:
        // Change the van status when it is returned.
    }
}

