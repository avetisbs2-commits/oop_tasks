import java.util.ArrayList;

public class RentalService {

    private final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        // TODO:
        // Add the vehicle into the vehicles ArrayList.
    }

    public void addCustomer(Customer customer) {
        // TODO:
        // Add the customer into the customers ArrayList.
    }

    public Vehicle findVehicleById(int id) {
        // TODO:
        // Search the vehicles ArrayList using a loop.
        // Return the vehicle with the matching id.
        // Return null if no vehicle is found.
        return null;
    }

    public Customer findCustomerById(int id) {
        // TODO:
        // Search the customers ArrayList using a loop.
        // Return the customer with the matching id.
        // Return null if no customer is found.
        return null;
    }

    public ArrayList<Vehicle> getAvailableVehicles() {
        // TODO:
        // Create a new ArrayList.
        // Go through vehicles using a loop.
        // Add only vehicles with AVAILABLE status.
        // Return the new ArrayList.
        return new ArrayList<>();
    }

    public Rental rentVehicle(int customerId, int vehicleId, int days) {
        // TODO:
        // 1. Find customer by id
        // 2. Find vehicle by id
        // 3. Check whether the vehicle is AVAILABLE
        // 4. Calculate rental price using vehicle.calculateRentalPrice(days)
        // 5. Rent the vehicle
        // 6. Create a Rental object
        // 7. Add the Rental into rentals ArrayList
        // 8. Return the Rental
        return null;
    }

    public boolean returnVehicle(int vehicleId) {
        // TODO:
        // Find the vehicle by id.
        // If the vehicle exists, return it and return true.
        // If the vehicle does not exist, return false.
        return false;
    }

    public ArrayList<Rental> findRentalsByCustomer(int customerId) {
        // TODO:
        // Create a new ArrayList.
        // Go through rentals using a loop.
        // Add rentals that belong to the matching customer id.
        // Return the new ArrayList.
        return new ArrayList<>();
    }

    public double calculateTotalRevenue() {
        // TODO:
        // Go through rentals using a loop.
        // Add all rental total prices.
        // Return the total revenue.
        return 0;
    }

    public void printVehicleInformation() {
        // TODO:
        // Go through vehicles using a loop.
        // Print vehicle details for each vehicle.
    }
}

