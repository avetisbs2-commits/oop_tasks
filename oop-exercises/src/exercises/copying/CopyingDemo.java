package exercises.copying;

import exercises.support.Demo;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.copying.CopyingDemo
 */
public class CopyingDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. shallow copy (Person.shallowCopy)");
        Person original = new Person("Ani", new City("Yerevan", 1_100_000));
        Person shallow = original.shallowCopy();
        Demo.expect("shallow != original", true, () -> shallow != original);
        Demo.expect("shallow.getCity() == original.getCity()", true, () -> shallow.getCity() == original.getCity());
        shallow.getCity().setName("CHANGED");
        Demo.expect("shallow-ի քաղաքը փոխելուց հետո original.getCity().getName()", "CHANGED",
                () -> original.getCity().getName());
        Demo.line("  ^ original-ի քաղաքը փոխվեց, քանի որ երկու Person-ը ՆՈՒՅՆ City-ն են օգտագործում։");

        Demo.title("2. Վարժություն 1. City.copy և Person.deepCopy (CPY-1, CPY-2)");
        Demo.expect("new City(\"Vanadzor\", 80000).copy().toString()", "Vanadzor (80000)",
                () -> new City("Vanadzor", 80_000).copy().toString());
        Demo.expect("deepCopy().getCity() != original.getCity()", true, () -> {
            Person p = new Person("Ani", new City("Yerevan", 1_100_000));
            return p.deepCopy().getCity() != p.getCity();
        });
        Demo.expect("deepCopy-ի քաղաքը փոխելուց հետո original-ի քաղաքը", "Yerevan", () -> {
            Person p = new Person("Ani", new City("Yerevan", 1_100_000));
            Person copy = p.deepCopy();
            copy.getCity().setName("CHANGED");
            return p.getCity().getName();
        });

        Demo.title("3. Վարժություն 2. Ապացույց (CPY-3)");
        Demo.expect("copyIsIndependent(person)", true,
                () -> CopyTools.copyIsIndependent(new Person("Ani", new City("Yerevan", 1_100_000))));

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ shallowCopy()-ից հետո քաղաքի անունը փոխվեց օրիգինալում։");
        Demo.line("  2. Ինչու՞ String name-ի համար խոր պատճեն պետք չէ։");
        Demo.line("  3. Ինչու՞ է ցանկացած դաշտ, որը ՓՈՓՈԽԵԼԻ օբյեկտ է, պատճենելիս ուշադրություն պահանջում։");
    }
}
