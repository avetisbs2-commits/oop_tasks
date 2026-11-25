package exercises.inheritance;

/**
 * ԲԱԶՄԱՅԻՆ ԴԱՍ (ավարտված. ուսանողը չի փոխում)։
 *
 * Վերջավոր դասերը (Car, Truck, Motorcycle) ժառանգում են brand, year, getAge() և describe()։
 * Նկատիր. Vehicle-ը չունի կոնստրուկտոր առանց պարամետրերի, ուստի ԱՄԵՆ ենթադաս ՊԱՐՏԱԴԻՐ է
 * կանչի super(brand, year)։
 */
public class Vehicle {
    private final String brand;
    private final int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public String describe() {
        return brand + " (" + year + ")";
    }
}
