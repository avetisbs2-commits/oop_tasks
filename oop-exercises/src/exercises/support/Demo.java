package exercises.support;

import java.util.function.Supplier;

/**
 * Օգնական տպելու մեթոդներ XxxDemo դասերի համար։
 * Ուսանողների համար փոփոխելու համար չէ։
 */
public final class Demo {

    private Demo() {
    }

    public static void title(String text) {
        System.out.println();
        System.out.println("##### " + text);
    }

    public static void line(String text) {
        System.out.println(text);
    }

    /** Տպում է արտահայտության արդյունքը։ Եթե մեթոդը դեռ TODO է, սա նշում է։ */
    public static void show(String label, Supplier<?> value) {
        System.out.println("  " + label + " = " + evaluate(value));
    }

    /** Տպում է ստացված և սպասվող արդյունքը, և [OK] / [DIFF] / [TODO]։ */
    public static void expect(String label, Object expected, Supplier<?> actual) {
        String result = evaluate(actual);
        String status;
        if (result.startsWith("(TODO")) {
            status = "[TODO]";
        } else if (result.equals(String.valueOf(expected))) {
            status = "[OK]  ";
        } else {
            status = "[DIFF]";
        }
        System.out.println("  " + status + " " + label + " -> " + result + "   (սպասվող՝ " + expected + ")");
    }

    /** Ստուգում է, որ գործողությունը նետում է սպասվող տիպի բացառություն։ */
    public static void expectThrows(String label, Class<? extends Throwable> type, Runnable action) {
        String status;
        String result;
        try {
            action.run();
            status = "[DIFF]";
            result = "ոչինչ չնետվեց";
        } catch (Throwable t) {
            if (CheckRunnerAccess.isTodo(t)) {
                status = "[TODO]";
                result = "(TODO — " + t.getMessage() + ")";
            } else if (type.isInstance(t)) {
                status = "[OK]  ";
                result = "նետվեց " + t.getClass().getSimpleName();
            } else {
                status = "[DIFF]";
                result = "նետվեց " + t.getClass().getSimpleName();
            }
        }
        System.out.println("  " + status + " " + label + " -> " + result
                + "   (սպասվող՝ " + type.getSimpleName() + ")");
    }

    private static String evaluate(Supplier<?> value) {
        try {
            return String.valueOf(value.get());
        } catch (Throwable t) {
            if (CheckRunnerAccess.isTodo(t)) {
                return "(TODO — " + t.getMessage() + ")";
            }
            return "(սխալ՝ " + t.getClass().getSimpleName() + ": " + t.getMessage() + ")";
        }
    }

    /** CheckRunner.isTodoPlaceholder-ը package-private է, ուստի այստեղ նույն տրամաբանությունն է։ */
    private static final class CheckRunnerAccess {
        static boolean isTodo(Throwable t) {
            return t instanceof UnsupportedOperationException
                    && t.getMessage() != null
                    && t.getMessage().startsWith("TODO");
        }
    }
}
