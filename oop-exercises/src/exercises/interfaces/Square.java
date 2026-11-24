package exercises.interfaces;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում). Shape-ի ամբողջությամբ իրականացված դաս։
 * Նայիր այս դասին՝ նախքան Rectangle և Circle լրացնելը։
 */
public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String name() {
        return "Square";
    }
}
