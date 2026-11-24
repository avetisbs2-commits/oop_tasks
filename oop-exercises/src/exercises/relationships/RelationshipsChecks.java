package exercises.relationships;

import exercises.relationships.OwnershipReference.Car;
import exercises.relationships.OwnershipReference.Garage;
import exercises.relationships.OwnershipReference.House;
import exercises.support.CheckRunner;
import exercises.support.Verify;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.relationships.RelationshipsChecks
 */
public class RelationshipsChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("relationships");

        r.example("aggregation: a Car outlives its Garage membership", () -> {
            Car car = new Car("AB-123");
            Garage garage = new Garage();
            garage.park(car);
            Verify.equal(1, garage.size(), "parked");
            Verify.isTrue(garage.leave(car), "left");
            Verify.equal(0, garage.size(), "garage is empty");
            Verify.equal("AB-123", car.getPlate(), "the car still exists and works");
        });
        r.example("composition: the House creates and owns its Rooms", () -> {
            House house = new House();
            house.addRoom("Kitchen");
            Verify.equal(1, house.getRooms().size(), "one room");
            Verify.throwsException(UnsupportedOperationException.class, () -> house.getRooms().clear(),
                    "outsiders cannot change the room list");
        });

        r.acceptance("REL-1", "addPlayer stores the same Player object", () -> {
            Team team = new Team("Ararat");
            Player ani = new Player("Ani", 10);
            team.addPlayer(ani);
            Verify.equal(1, team.getPlayers().size(), "size");
            Verify.same(ani, team.getPlayers().get(0), "the SAME player object is stored (aggregation)");
        });
        r.acceptance("REL-2", "removePlayer returns true/false and the Player survives", () -> {
            Team team = new Team("Ararat");
            Player ani = new Player("Ani", 10);
            Player other = new Player("Bo", 7);
            team.addPlayer(ani);
            Verify.isTrue(team.removePlayer(ani), "removed");
            Verify.isFalse(team.removePlayer(ani), "already removed");
            Verify.isFalse(team.removePlayer(other), "never added");
            Verify.equal(0, team.getPlayers().size(), "empty");
            Verify.equal("Ani", ani.getName(), "the Player object is still alive and usable");
            Team second = new Team("Other");
            second.addPlayer(ani);
            Verify.equal(1, second.getPlayers().size(), "joined another team");
        });
        r.acceptance("REL-3", "addLine creates an OrderLine inside the Order", () -> {
            Order order = new Order("Ani");
            order.addLine("Tea", 2, 500);
            Verify.equal(1, order.getLines().size(), "one line");
            OrderLine line = order.getLines().get(0);
            Verify.equal("Tea", line.getProduct(), "product");
            Verify.equal(2, line.getQuantity(), "quantity");
            Verify.equal(500L, line.getUnitPriceCents(), "unit price");
        });
        r.acceptance("REL-4", "totalCents sums all lines", () -> {
            Order order = new Order("Ani");
            Verify.equal(0L, order.totalCents(), "empty order");
            order.addLine("Tea", 2, 500);
            order.addLine("Milk", 1, 300);
            Verify.equal(1300L, order.totalCents(), "total");
        });

        return r.summary();
    }
}
