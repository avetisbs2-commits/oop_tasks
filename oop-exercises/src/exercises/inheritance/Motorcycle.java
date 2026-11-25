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
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    /**
     * TODO INH-4. Վերասահմանիր describe()-ը։
     * Ֆորմատ՝ <Vehicle-ի describe()>, with sidecar   կամ   <Vehicle-ի describe()>, no sidecar
     * Հուշում. օգտագործիր super.describe() և եռամասնյա օպերատոր (hasSidecar ? "..." : "...")։
     * Օրինակ.  new Motorcycle("Honda", 2020, false).describe() -> "Honda (2020), no sidecar"
     */
    @Override
    public String describe() {
        String sidecarText = hasSidecar ? ", with sidecar" : ", no sidecar";
        return super.describe() + sidecarText;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
