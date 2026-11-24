package exercises.inheritance;

import exercises.support.Demo;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.inheritance.InheritanceDemo
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. Car");
        Car car = new Car("Toyota", 2020, 4);
        Demo.expect("car.getBrand() (ժառանգված)", "Toyota", car::getBrand);
        Demo.expect("car.getAge(2025) (ժառանգված)", 5, () -> car.getAge(2025));
        Demo.expect("car.getDoors() (Car-ի հատուկ)", 4, car::getDoors);
        Demo.expect("car.describe() (վերասահմանված)", "Toyota (2020), doors: 4", car::describe);

        Demo.title("2. Վարժություն 1. Truck (INH-1, INH-2)");
        Demo.expect("new Truck(\"Volvo\", 2018, 5000).getBrand()", "Volvo", () -> new Truck("Volvo", 2018, 5000).getBrand());
        Demo.expect("new Truck(\"Volvo\", 2018, 5000).describe()", "Volvo (2018), cargo: 5000 kg",
                () -> new Truck("Volvo", 2018, 5000).describe());
        Demo.expect("truck.getAge(2025) (ժառանգված, ոչինչ գրել պետք չէ)", 7, () -> new Truck("Volvo", 2018, 5000).getAge(2025));

        Demo.title("3. Վարժություն 2. Motorcycle (INH-3, INH-4)");
        Demo.expect("new Motorcycle(\"Ural\", 1980, true).hasSidecar()", true, () -> new Motorcycle("Ural", 1980, true).hasSidecar());
        Demo.expect("new Motorcycle(\"Honda\", 2020, false).describe()", "Honda (2020), no sidecar",
                () -> new Motorcycle("Honda", 2020, false).describe());
        Demo.expect("new Motorcycle(\"Ural\", 1980, true).describe()", "Ural (1980), with sidecar",
                () -> new Motorcycle("Ural", 1980, true).describe());

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ է Truck-ի կոնստրուկտորը պարտավոր կանչել super(brand, year)։");
        Demo.line("  2. Ո՞ր մեթոդները Truck-ը ժառանգում է Vehicle-ից և ո՞րն է միայն Truck-ինը։");
        Demo.line("  3. Ինչու՞ է describe()-ում ավելի լավ կանչել super.describe(), քան նորից գրել brand + year-ը։");
    }
}
