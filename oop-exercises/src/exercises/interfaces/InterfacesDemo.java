package exercises.interfaces;

import exercises.support.Demo;
import java.util.List;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.interfaces.InterfacesDemo
 */
public class InterfacesDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. Square");
        Shape square = new Square(2);
        Demo.expect("square.area()", 4.0, square::area);
        Demo.expect("square.describe()", "Square (area=4.00)", square::describe);

        Demo.title("2. Վարժություն 1-2. Rectangle և Circle (INT-1, INT-2)");
        Shape rectangle = new Rectangle(3, 4);
        Shape circle = new Circle(1);
        Demo.expect("new Rectangle(3, 4).area()", 12.0, rectangle::area);
        Demo.expect("new Circle(1).area()", Math.PI, circle::area);
        Demo.expect("rectangle.describe()", "Rectangle (area=12.00)", rectangle::describe);

        Demo.title("3. Վարժություն 3. Աշխատանք ինտերֆեյսի հղումներով (INT-3)");
        List<Shape> shapes = List.of(new Square(2), new Rectangle(3, 4), new Square(1));
        Demo.expect("totalArea([Square(2), Rectangle(3,4), Square(1)])", 17.0, () -> ShapeCalculator.totalArea(shapes));
        Demo.expect("totalArea([])", 0.0, () -> ShapeCalculator.totalArea(List.of()));

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ է փոփոխականի տիպը Shape, թեև օբյեկտը Square է։ Ի՞նչ առավելություն է տալիս դա։");
        Demo.line("  2. Ի՞նչ կլիներ, եթե ShapeCalculator-ը օգտագործեր instanceof Rectangle / instanceof Circle։");
        Demo.line("  3. Ինչո՞վ է default մեթոդը (describe) տարբերվում սովորական աբստրակտ մեթոդից։");
    }
}
