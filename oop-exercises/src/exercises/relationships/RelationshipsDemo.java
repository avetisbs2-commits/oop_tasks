package exercises.relationships;

import exercises.relationships.OwnershipReference.Car;
import exercises.relationships.OwnershipReference.Garage;
import exercises.relationships.OwnershipReference.House;
import exercises.support.Demo;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.relationships.RelationshipsDemo
 */
public class RelationshipsDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. ագրեգացիա (Garage + Car)");
        Car car = new Car("AB-123");
        Garage garage = new Garage();
        garage.park(car);
        Demo.expect("garage.size() park-ից հետո", 1, garage::size);
        garage.leave(car);
        Demo.expect("garage.size() leave-ից հետո", 0, garage::size);
        Demo.expect("car.getPlate() (Car-ը շարունակում է ապրել)", "AB-123", car::getPlate);

        Demo.title("2. Ավարտված օրինակ. կոմպոզիցիա (House + Room)");
        House house = new House();
        house.addRoom("Kitchen");
        Demo.expect("house.getRooms().size()", 1, () -> house.getRooms().size());
        Demo.expectThrows("house.getRooms().add(...) դրսից", UnsupportedOperationException.class,
                () -> house.getRooms().add(null));

        Demo.title("3. Վարժություն 1. ագրեգացիա. Team + Player (REL-1, REL-2)");
        Player ani = new Player("Ani", 10);
        Team team = new Team("Ararat");
        Demo.expect("addPlayer(ani) հետո getPlayers().size()", 1, () -> {
            team.addPlayer(ani);
            return team.getPlayers().size();
        });
        Demo.expect("removePlayer(ani)", true, () -> team.removePlayer(ani));
        Demo.expect("ani.getName() (Player-ը շարունակում է ապրել)", "Ani", ani::getName);

        Demo.title("4. Վարժություն 2. կոմպոզիցիա. Order + OrderLine (REL-3, REL-4)");
        Demo.expect("Tea 2 x 500 + Milk 1 x 300 -> totalCents()", 1300L, () -> {
            Order order = new Order("Ani");
            order.addLine("Tea", 2, 500);
            order.addLine("Milk", 1, 300);
            return order.totalCents();
        });
        Demo.expect("addLine(\"Tea\", 2, 500) հետո getLines().size()", 1, () -> {
            Order order = new Order("Ani");
            order.addLine("Tea", 2, 500);
            return order.getLines().size();
        });

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ Player-ը ստեղծվում է Team-ից դուրս, իսկ OrderLine-ը՝ Order-ի ներսում։");
        Demo.line("  2. Ինչու՞ OrderLine-ի կոնստրուկտորը package-private է։ Ինչ կփոխվեր, եթե public լիներ։");
        Demo.line("  3. Երբ Order օբյեկտը դառնում է անհասանելի, ի՞նչ է կատարվում նրա OrderLine-ների հետ Java-ում։ (Հուշում. աղբահավաք)");
    }
}
