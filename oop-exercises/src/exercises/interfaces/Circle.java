package exercises.interfaces;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Շրջան։ Լրացրու area() մեթոդը։
 */
public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * TODO INT-2. Վերադարձրու շրջանի մակերեսը։
     * Հուշում. Math.PI * radius * radius
     * Օրինակ. new Circle(1).area() -> 3.141592653589793
     */
    @Override
    public double area() {
        // TODO INT-2: Իրականացրու և ջնջիր հետևյալ տողը
        return Math.PI * radius * radius;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
