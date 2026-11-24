package exercises.inheritance;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։ Ենթադասի ամբողջական իրականացում.
 * Նայիր, թե ինչպես է կոնստրուկտորը կանչում super(...)-ը ԱՌԱՋԻՆ տողում, և թե ինչպես է describe()-ը
 * օգտագործում super.describe()-ը՝ ժառանգած տրամաբանությունը չկրկնելու համար։
 */
public class Car extends Vehicle {
    private final int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String describe() {
        return super.describe() + ", doors: " + doors;
    }
}
