package exercises.relationships;

/**
 * Խաղացող. ստեղծվում է Team-ից ԱՆԿԱԽ (ագրեգացիա)։ Նա կարող է գոյություն ունենալ առանց թիմի։
 */
public class Player {
    private final String name;
    private final int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + " #" + number;
    }
}
