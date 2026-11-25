package exercises.equality;

import exercises.support.CheckRunner;
import exercises.support.Verify;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.equality.EqualityChecks
 */
public class EqualityChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("equality");

        r.example("Point equals/hashCode work in a HashSet", () -> {
            Set<Point> set = new HashSet<>();
            set.add(new Point(1, 2));
            set.add(new Point(1, 2));
            set.add(new Point(2, 1));
            Verify.equal(2, set.size(), "duplicates are ignored");
            Verify.isTrue(set.contains(new Point(2, 1)), "contains uses equals");
            Verify.isFalse(new Point(1, 2).equals(null), "null");
            Verify.isFalse(new Point(1, 2).equals("(1, 2)"), "another type");
        });

        r.acceptance("EQL-1", "equals is based on id only", () -> {
            Product tea = new Product("p1", "Tea", 500);
            Verify.isTrue(tea.equals(new Product("p1", "Coffee", 900)), "same id, other name and price");
            Verify.isFalse(tea.equals(new Product("p2", "Tea", 500)), "other id");
        });
        r.acceptance("EQL-1", "equals handles itself, null and another class", () -> {
            Product a = new Product("p1", "A", 1);
            Verify.isTrue(a.equals(a), "reflexive");
            Verify.isFalse(a.equals(null), "null");
            Verify.isFalse(a.equals("p1"), "a String with the same text is not a Product");
        });
        r.acceptance("EQL-2", "equal products have equal hash codes", () -> {
            Product a = new Product("p1", "A", 1);
            Product b = new Product("p1", "B", 2);
            Verify.equal(a.hashCode(), b.hashCode(), "same id -> same hash");
        });
        r.acceptance("EQL-2", "Product works as a HashSet element and as a HashMap key", () -> {
            Set<Product> set = new HashSet<>();
            set.add(new Product("p1", "A", 1));
            set.add(new Product("p1", "B", 2));
            set.add(new Product("p2", "C", 3));
            Verify.equal(2, set.size(), "set size");
            Verify.isTrue(set.contains(new Product("p2", "anything", 0)), "contains by id");
            Map<Product, String> map = new HashMap<>();
            map.put(new Product("k", "x", 1), "first");
            Verify.equal("first", map.get(new Product("k", "y", 2)), "map lookup by id");
        });
        r.acceptance("EQL-3", "countDistinct counts distinct ids", () -> {
            List<Product> products = List.of(
                    new Product("p1", "A", 1), new Product("p2", "B", 1), new Product("p1", "C", 1),
                    new Product("p3", "D", 1), new Product("p3", "E", 1));
            Verify.equal(3, ProductCatalog.countDistinct(products), "three ids");
            Verify.equal(0, ProductCatalog.countDistinct(List.of()), "empty");
        });

        return r.summary();
    }
}
