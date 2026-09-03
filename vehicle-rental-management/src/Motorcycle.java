public class Motorcycle extends Vehicle {

    private int engineCapacity;

    public Motorcycle(int id, String brand, String model, double pricePerDay, int engineCapacity) {
        super(id, brand, model, pricePerDay);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getVehicleDetails() {
        // TODO:
        // Return motorcycle information as text.
        // Include brand, model, status, and engine capacity.
        return "Motorcycle brand: " + getBrand()
                + ", model: " + getModel()
                + ", status: " + getStatus()
                + " Engine capacity " + getEngineCapacity();
    }

    @Override
    public double calculateRentalPrice(int days) {
        // TODO:
        // Calculate rental price for a motorcycle.
        // Apply a 10% discount.
        return getPricePerDay() * days - (getPricePerDay() * days) / 10;
    }

    @Override
    public void rent() {
        // TODO:
        // Change the motorcycle status when it is rented.
        setStatus(VehicleStatus.RENTED);
    }

    @Override
    public void returnVehicle() {
        // TODO:
        // Change the motorcycle status when it is returned.
        setStatus(VehicleStatus.AVAILABLE);
    }
}

