package exercises.copying;

import exercises.support.CheckRunner;
import exercises.support.Verify;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.copying.CopyingChecks
 */
public class CopyingChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("copying");

        r.example("shallowCopy shares the City object", () -> {
            Person original = new Person("Ani", new City("Yerevan", 100));
            Person copy = original.shallowCopy();
            Verify.notSame(original, copy, "a new Person");
            Verify.same(original.getCity(), copy.getCity(), "the same City");
            copy.getCity().setName("CHANGED");
            Verify.equal("CHANGED", original.getCity().getName(), "the change is visible in the original");
        });

        r.acceptance("CPY-1", "City.copy creates an equal but independent object", () -> {
            City city = new City("Vanadzor", 80000);
            City copy = city.copy();
            Verify.notSame(city, copy, "a new object");
            Verify.equal("Vanadzor", copy.getName(), "name");
            Verify.equal(80000, copy.getPopulation(), "population");
            copy.setName("X");
            Verify.equal("Vanadzor", city.getName(), "original name unchanged");
        });
        r.acceptance("CPY-2", "Person.deepCopy copies the City too", () -> {
            Person original = new Person("Ani", new City("Yerevan", 1000));
            Person copy = original.deepCopy();
            Verify.notSame(original, copy, "a new Person");
            Verify.notSame(original.getCity(), copy.getCity(), "a new City");
            Verify.equal("Ani", copy.getName(), "name");
            Verify.equal("Yerevan", copy.getCity().getName(), "city name");
        });
        r.acceptance("CPY-2", "changing the deep copy does not change the original", () -> {
            Person original = new Person("Ani", new City("Yerevan", 1000));
            Person copy = original.deepCopy();
            copy.getCity().setName("CHANGED");
            Verify.equal("Yerevan", original.getCity().getName(), "original city unchanged");
        });
        r.acceptance("CPY-3", "copyIsIndependent proves independence and leaves the original untouched", () -> {
            Person original = new Person("Ani", new City("Yerevan", 1000));
            Verify.isTrue(CopyTools.copyIsIndependent(original), "should be true");
            Verify.equal("Yerevan", original.getCity().getName(), "original city must not change");
        });

        return r.summary();
    }
}
