package exercises.strings;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։
 *
 * Ցույց է տալիս երկու տարբեր հարց.
 *   a == b       — արդյո՞ք a-ն և b-ն նույն օբյեկտն են (հղումների համեմատություն)
 *   a.equals(b)  — արդյո՞ք a-ի և b-ի ՏԵՔՍՏԸ նույնն է (բովանդակության համեմատություն)
 *
 * Տեքստը համեմատելու համար միշտ օգտագործիր equals(), ոչ թե ==։
 *
 * shout(text)-ը null-անվտանգ տեքստի մշակման օրինակ. "hello" -> "HELLO!", null -> "", "   " -> ""։
 * Նայիր, թե ինչպես է null-ը մշակված. նման ոճով ես պետք է լրացնես քո մեթոդները։
 */
public final class StringsReference {
    private StringsReference() {
    }

    public static boolean sameReference(String a, String b) {
        return a == b;
    }

    public static boolean sameText(String a, String b) {
        return a.equals(b);
    }

    public static String compare(String a, String b) {
        return "== : " + (a == b) + ", equals : " + a.equals(b);
    }

    public static String shout(String text) {
        if (text == null || text.isBlank()) {
            return "";
        }
        return text.trim().toUpperCase() + "!";
    }
}
