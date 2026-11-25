package exercises.relationships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։ Երկու տեսակի կապ.
 *
 * ԱԳՐԵԳԱՑԻԱ (aggregation) — Garage և Car.
 *   Car-երը ստեղծվում են Garage-ից ԴՐՍՈՒՄ և կարող են գոյություն ունենալ առանց Garage-ի։
 *   Garage-ը միայն ՀՂՈՒՄ է պահում։ Car-ը կարող է լինել մեկ այլ Garage-ում կամ ոչ մեկում։
 *
 * ԿՈՄՊՈԶԻՑԻԱ (composition) — House և Room.
 *   Room-ները ստեղծվում են House-ի ՆԵՐՍՈՒՄ (addRoom-ը), Room-ի կոնստրուկտորը package-private է,
 *   և House-ը չի տալիս ուրիշներին փոփոխել սենյակների ցուցակը։ House-ը ՍԵՓԱԿԱՆԱՏԵՐՆ է։
 *
 * Կարևոր (խնդրում ենք հասկանալ). կոմպոզիցիան ՆԱԽԱԳԾԻ (design) մասին է՝ «ով է տերը»։ Java-ն ինքնաբերաբար
 * ՉԻ ոչնչացնում Room օբյեկտները, երբ House-ը դառնում է անհասանելի։ Աղբահավաքը (garbage collector) ազատում է
 * հիշողությունը, երբ օբյեկտին այլևս ոչ մի հղում չկա։ Եթե ինչ-որ մեկը պահի Room-ի հղումը, այն կապրի։
 * Դրա համար կոմպոզիցիայում Room-ի հղումը չի տրվում դրսին (կամ տրվում է միայն ընթերցման համար)։
 */
public final class OwnershipReference {
    private OwnershipReference() {
    }

    public static class Car {
        private final String plate;

        public Car(String plate) {
            this.plate = plate;
        }

        public String getPlate() {
            return plate;
        }
    }

    public static class Garage {
        private final List<Car> cars = new ArrayList<>();

        public void park(Car car) {
            cars.add(car);
        }

        public boolean leave(Car car) {
            return cars.remove(car);
        }

        public int size() {
            return cars.size();
        }
    }

    public static class Room {
        private final String name;

        Room(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class House {
        private final List<Room> rooms = new ArrayList<>();

        public void addRoom(String name) {
            rooms.add(new Room(name));
        }

        public List<Room> getRooms() {
            return Collections.unmodifiableList(rooms);
        }
    }
}
