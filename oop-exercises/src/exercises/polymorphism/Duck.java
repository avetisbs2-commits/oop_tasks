package exercises.polymorphism;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Duck. վերասահմանիր sound()-ը (նույնը, ինչ Cat-ում)։
 */
public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    /**
     * TODO POL-2. Վերադարձրու "Quack"։
     * Օրինակ.  new Duck("Don").describe() -> "Don says Quack"
     */
    @Override
    public String sound() {
        // TODO POL-2: Իրականացրու և ջնջիր հետևյալ տողը
        return  "Quack";
    }
}
