package exercises.inheritance;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Motorcycle՝ Vehicle-ի ենթադաս։ Նույն քայլերը, ինչ Truck-ում։
 */
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    /**
     * TODO INH-3. Կոնստրուկտոր. կանչիր super(brand, year) և վերագրիր hasSidecar-ը։
     * (Այժմ super-ում փոխարինող արժեքներ են՝ "TODO", 0. փոխիր դրանք։)
     * Օրինակ.  new Motorcycle("Ural", 1980, true).hasSidecar() -> true
     */
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super("TODO", 0);   // TODO INH-3: փոխիր՝ փոխանցիր brand և year
        // TODO INH-3: վերագրիր hasSidecar-ը և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO INH-3: Motorcycle constructor");
    }

    /**
     * TODO INH-4. Վերասահմանիր describe()-ը։
     * Ֆորմատ՝ <Vehicle-ի describe()>, with sidecar   կամ   <Vehicle-ի describe()>, no sidecar
     * Հուշում. օգտագործիր super.describe() և եռամասնյա օպերատոր (hasSidecar ? "..." : "...")։
     * Օրինակ.  new Motorcycle("Honda", 2020, false).describe() -> "Honda (2020), no sidecar"
     */
    @Override
    public String describe() {
        // TODO INH-4: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO INH-4: Motorcycle.describe");
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
