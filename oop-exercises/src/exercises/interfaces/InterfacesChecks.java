package exercises.interfaces;

import exercises.support.CheckRunner;
import exercises.support.Verify;
import java.util.List;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.interfaces.InterfacesChecks
 */
public class InterfacesChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("interfaces");

        r.example("Square implements Shape correctly", () -> {
            Shape s = new Square(3);
            Verify.near(9.0, s.area(), "area");
            Verify.equal("Square", s.name(), "name");
            Verify.equal("Square (area=9.00)", s.describe(), "describe");
        });

        r.acceptance("INT-1", "Rectangle.area", () -> {
            Verify.near(12.0, new Rectangle(3, 4).area(), "3x4");
            Verify.near(2.5, new Rectangle(0.5, 5).area(), "0.5x5");
        });
        r.acceptance("INT-2", "Circle.area", () -> {
            Verify.near(Math.PI, new Circle(1).area(), "r=1");
            Verify.near(Math.PI * 4, new Circle(2).area(), "r=2");
        });
        r.acceptance("INT-3", "totalArea sums areas through Shape references", () -> {
            List<Shape> shapes = List.of(new Square(2), new Rectangle(3, 4), new Circle(1));
            Verify.near(16.0 + Math.PI, ShapeCalculator.totalArea(shapes), "mixed list");
            Verify.near(0.0, ShapeCalculator.totalArea(List.of()), "empty list");
        });
        r.acceptance("INT-3", "totalArea works with a shape the calculator has never seen", () -> {
            Shape unit = new Shape() {
                @Override public double area() { return 7.5; }
                @Override public String name() { return "Anonymous"; }
            };
            Verify.near(7.5, ShapeCalculator.totalArea(List.of(unit)), "anonymous Shape");
        });

        return r.summary();
    }
}
