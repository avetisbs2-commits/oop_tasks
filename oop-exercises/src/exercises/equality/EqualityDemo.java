package exercises.equality;

import exercises.support.Demo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.equality.EqualityDemo
 */
public class EqualityDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. Point (equals + hashCode)");
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Demo.expect("p1 == p2", false, () -> p1 == p2);
        Demo.expect("p1.equals(p2)", true, () -> p1.equals(p2));
        Demo.expect("p1.hashCode() == p2.hashCode()", true, () -> p1.hashCode() == p2.hashCode());
        Set<Point> points = new HashSet<>();
        points.add(p1);
        points.add(p2);
        points.add(new Point(3, 4));
        Demo.expect("HashSet<Point>-ի չափը (3 add-ից հետո)", 2, points::size);

        Demo.title("2. Վարժություն 1. Product (EQL-1, EQL-2)");
        Product tea = new Product("p1", "Tea", 500);
        Product coffee = new Product("p1", "Coffee", 900);
        Product milk = new Product("p2", "Milk", 300);
        Demo.expect("tea.equals(coffee) (նույն id)", true, () -> tea.equals(coffee));
        Demo.expect("tea.equals(milk) (այլ id)", false, () -> tea.equals(milk));
        Demo.expect("tea.equals(null)", false, () -> tea.equals(null));
        Demo.expect("tea.hashCode() == coffee.hashCode()", true, () -> tea.hashCode() == coffee.hashCode());

        Demo.title("3. Վարժություն 2. HashSet և կրկնություններ (EQL-3)");
        List<Product> products = List.of(tea, milk, coffee);
        Demo.expect("countDistinct([p1:Tea, p2:Milk, p1:Coffee])", 2, () -> ProductCatalog.countDistinct(products));
        Demo.expect("new HashSet<>(products).size()", 2, () -> new HashSet<>(products).size());

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ equals()-ը գրելիս պարտադիր է գրել նաև hashCode()-ը։ Ի՞նչ կլիներ HashSet-ում առանց hashCode()-ի։");
        Demo.line("  2. Ինչու՞ Product-ի id-ն final է, և ինչու name/price-ը չպետք է մասնակցեն equals()-ին։");
        Demo.line("  3. Ի՞նչ կարող է պատահել, եթե HashSet-ի մեջ գտնվող օբյեկտի այն դաշտը, որից հաշվվում է hashCode-ը, փոխվի։");
    }
}
