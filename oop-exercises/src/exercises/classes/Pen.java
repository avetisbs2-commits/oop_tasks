package exercises.classes;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։
 *
 * Ցույց է տալիս դասի անդամների երկու տեսակ.
 *   ՕԲՅԵԿՏԻ (instance) անդամներ — color, describe(). Ամեն Pen օբյեկտ ունի իր color-ը։
 *   ԴԱՍԻ (static) անդամներ     — created, getCreated(). Դրանք ՄԵԿՆ են ամբողջ դասի համար և պատկանում են դասին, ոչ թե օբյեկտին։
 */
public class Pen {
    private static int created = 0;

    private final String color;

    public Pen(String color) {
        this.color = color;
        created++;
    }

    public String describe() {
        return "Pen(" + color + ")";
    }

    public static int getCreated() {
        return created;
    }
}
