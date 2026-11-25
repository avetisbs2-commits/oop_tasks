package exercises.relationships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. ԱԳՐԵԳԱՑԻԱ. Team-ը ունի Player-ներ, բայց Player-ները ստեղծվում են դրսում և ապրում են անկախ։
 * Նայիր OwnershipReference.Garage-ին որպես օրինակ։
 */
public class Team {
    private final String name;
    private final List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * TODO REL-1. Ավելացրու խաղացողին թիմի players ցուցակին։
     * Հուշում. players.add(player);   (պահվում է ՆՈՒՅՆ Player օբյեկտի հղումը, ոչ պատճեն)
     * Օրինակ.  team.addPlayer(ani); team.getPlayers().size() -> 1
     */
    public void addPlayer(Player player) {
        // TODO REL-1: Իրականացրու և ջնջիր հետևյալ տողը
        players.add(player);
    }

    /**
     * TODO REL-2. Հեռացրու խաղացողին թիմից։ Վերադարձրու true, եթե նա թիմում էր (և հեռացվեց), այլապես false։
     * Հուշում. players.remove(player)-ը արդեն վերադարձնում է boolean։
     * Կարևոր. Player օբյեկտը ՉԻ ՈՉՆՉԱՆՈՒՄ. թիմը պարզապես դադարում է նրան պահել։ Խաղացողը շարունակում է ապրել դրսում։
     */
    public boolean removePlayer(Player player) {
        // TODO REL-2: Իրականացրու և ջնջիր հետևյալ տողը
        return players.remove(player);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}
