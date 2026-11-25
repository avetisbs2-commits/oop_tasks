package exercises.polymorphism;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Cat. վերասահմանիր sound()-ը։
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    /**
     * TODO POL-1. Վերադարձրու "Meow"։
     * Օրինակ.  new Cat("Tom").sound() -> "Meow",  new Cat("Tom").describe() -> "Tom says Meow"
     * (describe()-ը գրել պետք չէ. այն արդեն կա Animal-ում և կանչում է քո sound()-ը։)
     */
    @Override
    public String sound() {
        // TODO POL-1: Իրականացրու և ջնջիր հետևյալ տողը
        return "Meow";
    }
}
