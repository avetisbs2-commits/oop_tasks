import java.util.ArrayList;
import java.util.List;

public class RentalService {

    private final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        // TODO:
        // Add the vehicle into the vehicles ArrayList.
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        // TODO:
        // Add the customer into the customers ArrayList.
        customers.add(customer);
    }

    public Vehicle findVehicleById(int id) {
        // TODO:
        // Search the vehicles ArrayList using a loop.
        // Return the vehicle with the matching id.
        // Return null if no vehicle is found.
        for (Vehicle vehicle : vehicles){
            if (vehicle.getId() == id){
                return vehicle;
            }
        }
        return null;
    }

    public Customer findCustomerById(int id) {
        // TODO:
        // Search the customers ArrayList using a loop.
        // Return the customer with the matching id.
        // Return null if no customer is found.
        for (Customer customer : customers){
            if (customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> getAvailableVehicles() {
        // TODO:
        // Create a new ArrayList.
        // Go through vehicles using a loop.
        // Add only vehicles with AVAILABLE status.
        // Return the new ArrayList.
        ArrayList<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles){
            if (vehicle.getStatus() == VehicleStatus.AVAILABLE) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
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

        Customer customer = findCustomerById(customerId);
        Vehicle vehicle = findVehicleById(vehicleId);

        if (!(vehicle.getStatus() == VehicleStatus.AVAILABLE)) {
            System.out.println("Vehicle is not available");
        }

        double totalPrice = vehicle.calculateRentalPrice(days);
        vehicle.rent();
        Rental rental = new Rental(customerId , customer , vehicle ,days ,totalPrice);
        rentals.add(rental);

        return rental;
    }

    public boolean returnVehicle(int vehicleId) {
        // TODO:
        // Find the vehicle by id.
        Vehicle vehicle = findVehicleById(vehicleId);
        // If the vehicle exists, return it and return true.
        // If the vehicle does not exist, return false.
        return !(vehicle == null);
    }

    public ArrayList<Rental> findRentalsByCustomer(int customerId) {
        // TODO:
        // Create a new ArrayList.
        ArrayList<Rental> matchingRentals = new ArrayList<>();
        // Go through rentals using a loop.
        // Add rentals that belong to the matching customer id.
        for (Rental rental : rentals){
            if (rental.getId() == customerId){
                matchingRentals.add(rental);
            }
        }
        // Return the new ArrayList.
        return matchingRentals;
    }

    public double calculateTotalRevenue() {
        // TODO:
        // Go through rentals using a loop.
        // Add all rental total prices.
        // Return the total revenue.

        double totalRevenue = 0.0;
        for (Rental rental : rentals){
            totalRevenue += rental.getTotalPrice();
        }
        return totalRevenue;
    }

    public void printVehicleInformation() {
        // TODO:
        // Go through vehicles using a loop.
        // Print vehicle details for each vehicle.
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.getVehicleDetails());
        }
    }
}