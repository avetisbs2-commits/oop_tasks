package exercises.inheritance;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Truck՝ Vehicle-ի ենթադաս։ Լրացրու կոնստրուկտորը և describe()-ը։
 * Նայիր Car-ին որպես օրինակ։
 */
public class Truck extends Vehicle {
    private int cargoCapacityKg;

    /**
     * TODO INH-1. Կոնստրուկտոր։
     *   1. Կանչիր super(brand, year)՝ ԱՌԱՋԻՆ տողում (այժմ այնտեղ փոխարինող արժեքներ են՝ "TODO", 0. փոխիր դրանք)։
     *   2. Վերագրիր cargoCapacityKg դաշտին (this.cargoCapacityKg = cargoCapacityKg)։
     *   3. Ջնջիր throw տողը։
     * Օրինակ.  new Truck("Volvo", 2018, 5000).getBrand() -> "Volvo"
     */
    public Truck(String brand, int year, int cargoCapacityKg) {
        super(brand, year);
        this.cargoCapacityKg = cargoCapacityKg;
    }

    /**
     * TODO INH-2. Վերասահմանիր describe()-ը՝ ավելացնելով բեռնատարողությունը։
     * Հուշում. super.describe() + ", cargo: " + cargoCapacityKg + " kg"
     * Օրինակ.  new Truck("Volvo", 2018, 5000).describe() -> "Volvo (2018), cargo: 5000 kg"
     */
    @Override
    public String describe() {
        // TODO INH-2: Իրականացրու և ջնջիր հետևյալ տողը
        return super.describe() + ", cargo: " + cargoCapacityKg + " kg";
    }

    public int getCargoCapacityKg() {
        return cargoCapacityKg;
    }
}
