package exercises.strings;

import exercises.support.Demo;

/**
 * Գործարկվող օրինակներ. Ցույց է տալիս նմուշային մուտքերը և սպասվող արդյունքները։
 * [OK] = համընկնում է, [DIFF] = տարբերվում է, [TODO] = դեռ չես լրացրել։
 *
 * Գործարկում. exercises.strings.StringsDemo
 */
public class StringsDemo {
    @SuppressWarnings({"StringEquality", "StringOperationCanBeSimplified"})
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. == և equals");
        String literal1 = "java";
        String literal2 = "java";
        String created = new String("java");
        Demo.expect("literal1 == literal2", true, () -> StringsReference.sameReference(literal1, literal2));
        Demo.expect("literal1 == created", false, () -> StringsReference.sameReference(literal1, created));
        Demo.expect("literal1.equals(created)", true, () -> StringsReference.sameText(literal1, created));
        Demo.expect("compare(literal1, created)", "== : false, equals : true",
                () -> StringsReference.compare(literal1, created));
        Demo.expect("shout(\"hello\")", "HELLO!", () -> StringsReference.shout("hello"));
        Demo.expect("shout(null)", "", () -> StringsReference.shout(null));

        Demo.title("2. Գուշակիր նախքան գործարկելը (լրացրու StringsPredict.java)");
        for (int n = 1; n <= StringsPredict.PREDICTIONS.length; n++) {
            String prediction = StringsPredict.PREDICTIONS[n - 1];
            String actual = String.valueOf(StringsPredict.actual(n));
            String verdict;
            if (prediction == null || prediction.isBlank()) {
                verdict = "[TODO] դեռ չես գուշակել";
            } else if (prediction.trim().equalsIgnoreCase(actual)) {
                verdict = "[OK]   ճիշտ գուշակեցիր";
            } else {
                verdict = "[DIFF] սխալ գուշակեցիր, մտածիր՝ ինչու";
            }
            String shown = (prediction == null || prediction.isBlank()) ? "-" : prediction;
            System.out.println("  հատված " + n + ": քո գուշակությունը=" + shown
                    + ", իրականը=" + actual + "  " + verdict);
        }

        Demo.title("3. Վարժություն 1. null-անվտանգ համեմատություն (STR-1)");
        Demo.expect("safeEquals(null, null)", true, () -> NullSafeComparison.safeEquals(null, null));
        Demo.expect("safeEquals(\"a\", null)", false, () -> NullSafeComparison.safeEquals("a", null));
        Demo.expect("safeEquals(\"Java\", \"Java\")", true, () -> NullSafeComparison.safeEquals("Java", "Java"));
        Demo.expect("safeEquals(\"Java\", \"java\")", false, () -> NullSafeComparison.safeEquals("Java", "java"));

        Demo.title("4. Վարժություն 2. տեքստի մշակում (STR-2, STR-3)");
        Demo.expect("isPalindrome(\"Level\")", true, () -> TextProcessing.isPalindrome("Level"));
        Demo.expect("isPalindrome(\"Java\")", false, () -> TextProcessing.isPalindrome("Java"));
        Demo.expect("countVowels(\"Hello World\")", 3, () -> TextProcessing.countVowels("Hello World"));
        Demo.expect("countVowels(\"xyz\")", 0, () -> TextProcessing.countVowels("xyz"));

        Demo.title("5. Վարժություն 3. intern() (STR-4)");
        Demo.expect("InternPool.canonical(new String(\"java\")) == \"java\"", true,
                () -> InternPool.canonical(new String("java")) == "java");

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչո՞ւ է new String(\"java\") == \"java\" false, իսկ \"java\" == \"java\" true։");
        Demo.line("  2. Ինչո՞ւ է (p + \"va\") == \"java\" false, իսկ (p + \"va\").intern() == \"java\" true։");
        Demo.line("  3. Ինչո՞ւ պետք է տեքստը համեմատել equals()-ով, ոչ թե ==։");
    }
}
