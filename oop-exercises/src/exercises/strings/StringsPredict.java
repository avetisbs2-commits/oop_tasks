package exercises.strings;

/**
 * ԳՈՒՇԱԿԻՐ ՆԱԽՔԱՆ ԱՇԽԱՏԵՑՆԵԼԸ.
 *
 * Ամեն հատվածի համար կարդա կոդը, ՄԻՆՉԵՎ գործարկելը որոշիր՝ արդյունքը "true" է, թե "false"։
 * Գրիր քո գուշակությունը PREDICTION_n հաստատունի մեջ (օրինակ՝ "true")։
 * Հետո գործարկիր StringsDemo-ն. այն կհամեմատի քո գուշակությունը իրական արդյունքի հետ։
 * Եթե սխալվեցիր, մտածիր՝ ինչու (հարցերը՝ TODO.md-ում)։
 *
 * Այս ֆայլում միայն PREDICTION_n արժեքներն են քո աշխատանքը։ actual(...) մեթոդը ավարտված է։
 */
public final class StringsPredict {
    private StringsPredict() {
    }

    // 1)  String a = "java";  String b = "java";               a == b
    public static final String PREDICTION_1 = "true";   // TODO STR-P1: գրիր "true" կամ "false"

    // 2)  new String("java") == "java"
    public static final String PREDICTION_2 = "false";   // TODO STR-P2

    // 3)  new String("java").equals("java")
    public static final String PREDICTION_3 = "true";   // TODO STR-P3

    // 4)  String p = "ja";   (p + "va") == "java"               (գումարումը կատարվում է աշխատանքի ժամանակ)
    public static final String PREDICTION_4 = "false";   // TODO STR-P4

    // 5)  String p = "ja";   (p + "va").intern() == "java"
    public static final String PREDICTION_5 = "true";   // TODO STR-P5

    public static final String[] PREDICTIONS = {
            PREDICTION_1, PREDICTION_2, PREDICTION_3, PREDICTION_4, PREDICTION_5
    };

    @SuppressWarnings({"StringEquality", "StringOperationCanBeSimplified"})
    public static boolean actual(int n) {
        String p = "ja";
        return switch (n) {
            case 1 -> {
                String a = "java";
                String b = "java";
                yield a == b;
            }
            case 2 -> new String("java") == "java";
            case 3 -> new String("java").equals("java");
            case 4 -> (p + "va") == "java";
            case 5 -> (p + "va").intern() == "java";
            default -> throw new IllegalArgumentException("n must be 1..5");
        };
    }
}
