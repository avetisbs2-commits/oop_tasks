package exercises.inheritance;

import exercises.support.CheckRunner;
import exercises.support.Verify;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.inheritance.InheritanceChecks
 */
public class InheritanceChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("inheritance");

        r.example("Car inherits from Vehicle and adds its own behavior", () -> {
            Car car = new Car("Toyota", 2020, 4);
            Verify.isTrue(car instanceof Vehicle, "Car is a Vehicle");
            Verify.equal("Toyota", car.getBrand(), "inherited getBrand");
            Verify.equal(5, car.getAge(2025), "inherited getAge");
            Verify.equal(4, car.getDoors(), "own getDoors");
            Verify.equal("Toyota (2020), doors: 4", car.describe(), "describe");
        });

        r.acceptance("INH-1", "Truck constructor passes brand and year to super and stores the capacity", () -> {
            Truck t = new Truck("Volvo", 2018, 5000);
            Verify.equal("Volvo", t.getBrand(), "brand");
            Verify.equal(2018, t.getYear(), "year");
            Verify.equal(5000, t.getCargoCapacityKg(), "capacity");
            Verify.equal(7, t.getAge(2025), "inherited getAge");
        });
        r.acceptance("INH-2", "Truck.describe uses super.describe()", () -> {
            Verify.equal("Volvo (2018), cargo: 5000 kg", new Truck("Volvo", 2018, 5000).describe(), "describe");
            Vehicle asVehicle = new Truck("MAN", 2020, 100);
            Verify.equal("MAN (2020), cargo: 100 kg", asVehicle.describe(), "describe through a Vehicle reference");
        });
        r.acceptance("INH-3", "Motorcycle constructor passes brand and year to super and stores hasSidecar", () -> {
            Motorcycle m = new Motorcycle("Ural", 1980, true);
            Verify.equal("Ural", m.getBrand(), "brand");
            Verify.equal(1980, m.getYear(), "year");
            Verify.isTrue(m.hasSidecar(), "sidecar");
            Verify.isFalse(new Motorcycle("Honda", 2020, false).hasSidecar(), "no sidecar");
        });
        r.acceptance("INH-4", "Motorcycle.describe", () -> {
            Verify.equal("Honda (2020), no sidecar", new Motorcycle("Honda", 2020, false).describe(), "no sidecar");
            Verify.equal("Ural (1980), with sidecar", new Motorcycle("Ural", 1980, true).describe(), "sidecar");
        });

        return r.summary();
    }
}
