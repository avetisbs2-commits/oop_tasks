public class MainVehicle {

    public static void main(String[] args) {

        RentalService service = new RentalService();

        Vehicle car = new Car(
                1,
                "Toyota",
                "Camry",
                100,
                4,
                true
        );

        Vehicle motorcycle = new Motorcycle(
                2,
                "Yamaha",
                "MT-07",
                80,
                700
        );

        Vehicle van = new Van(
                3,
                "Ford",
                "Transit",
                150,
                12
        );

        Customer customer1 = new Customer(
                1,
                "John",
                "Smith",
                "john@test.com"
        );

        Customer customer2 = new Customer(
                2,
                "Anna",
                "Brown",
                "anna@test.com"
        );

        service.addVehicle(car);
        service.addVehicle(motorcycle);
        service.addVehicle(van);

        service.addCustomer(customer1);
        service.addCustomer(customer2);

        System.out.println("=== VEHICLES ===");
        service.printVehicleInformation();

        System.out.println();
        System.out.println("=== AVAILABLE VEHICLES ===");

        for (Vehicle vehicle : service.getAvailableVehicles()) {
            System.out.println(vehicle.getVehicleDetails());
        }

        System.out.println();
        System.out.println("=== RENT VEHICLE ===");

        Rental rental = service.rentVehicle(
                1,
                1,
                5
        );

        System.out.println(rental);

        System.out.println();
        System.out.println("=== AVAILABLE AFTER RENT ===");

        for (Vehicle vehicle : service.getAvailableVehicles()) {
            System.out.println(vehicle.getVehicleDetails());
        }

        System.out.println();
        System.out.println("Total revenue: " + service.calculateTotalRevenue());

        System.out.println();
        System.out.println("=== RETURN VEHICLE ===");

        service.returnVehicle(1);

        System.out.println(car.getVehicleDetails());
    }
}

