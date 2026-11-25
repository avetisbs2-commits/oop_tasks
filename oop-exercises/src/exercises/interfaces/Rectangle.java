package exercises.interfaces;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Ուղղանկյուն։ Լրացրու area() մեթոդը։
 * Կոնստրուկտորը և name() արդեն պատրաստ են։ Նայիր Square-ին որպես օրինակ։
 */
public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * TODO INT-1. Վերադարձրու ուղղանկյան մակերեսը։
     * Հուշում. width * height
     * Օրինակ. new Rectangle(3, 4).area() -> 12.0
     */
    @Override
    public double area() {
        // TODO INT-1: Իրականացրու և ջնջիր հետևյալ տողը
        return width * height;
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}
