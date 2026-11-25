package exercises.strings;

import exercises.support.CheckRunner;
import exercises.support.Verify;

/**
 * Ստուգումներ.
 *  - example(...)    ավարտված օրինակի համար (պետք է միշտ անցնեն)
 *  - acceptance(...) ՔՈ TODO-ների համար (մինչև լրացնելը՝ [TODO])
 *
 * Գործարկում. exercises.strings.StringsChecks
 */
public class StringsChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    @SuppressWarnings({"StringEquality", "StringOperationCanBeSimplified"})
    public static int run() {
        CheckRunner r = new CheckRunner("strings");

        r.example("sameText compares content", () -> {
            Verify.isTrue(StringsReference.sameText(new String("a"), "a"), "equal text");
            Verify.isFalse(StringsReference.sameText("a", "b"), "different text");
        });
        r.example("sameReference: literal vs new String", () -> {
            Verify.isTrue(StringsReference.sameReference("a", "a"), "literals are the same object");
            Verify.isFalse(StringsReference.sameReference(new String("a"), "a"), "new String is another object");
        });
        r.example("shout is null-safe", () -> {
            Verify.equal("HI!", StringsReference.shout(" hi "), "shout");
            Verify.equal("", StringsReference.shout(null), "shout(null)");
        });
        r.example("StringsPredict.actual answers are stable", () -> {
            Verify.equal(true, StringsPredict.actual(1), "1");
            Verify.equal(false, StringsPredict.actual(2), "2");
            Verify.equal(true, StringsPredict.actual(3), "3");
            Verify.equal(false, StringsPredict.actual(4), "4");
            Verify.equal(true, StringsPredict.actual(5), "5");
        });

        r.acceptance("STR-1", "safeEquals handles null and compares content", () -> {
            Verify.isTrue(NullSafeComparison.safeEquals(null, null), "null, null");
            Verify.isFalse(NullSafeComparison.safeEquals("a", null), "a, null");
            Verify.isFalse(NullSafeComparison.safeEquals(null, "a"), "null, a");
            Verify.isTrue(NullSafeComparison.safeEquals(new String("Java"), new String("Java")), "equal text, different objects");
            Verify.isFalse(NullSafeComparison.safeEquals("Java", "java"), "case matters");
        });
        r.acceptance("STR-2", "isPalindrome", () -> {
            Verify.isTrue(TextProcessing.isPalindrome("Level"), "Level (case ignored)");
            Verify.isTrue(TextProcessing.isPalindrome("a"), "one letter");
            Verify.isFalse(TextProcessing.isPalindrome("Java"), "Java");
        });
        r.acceptance("STR-3", "countVowels", () -> {
            Verify.equal(3, TextProcessing.countVowels("Hello World"), "Hello World");
            Verify.equal(5, TextProcessing.countVowels("AEIOU"), "capital letters");
            Verify.equal(0, TextProcessing.countVowels("xyz"), "no vowels");
            Verify.equal(0, TextProcessing.countVowels(""), "empty text");
        });
        r.acceptance("STR-4", "canonical returns the pooled instance", () ->
                Verify.same("java", InternPool.canonical(new String("java")), "canonical(new String) == literal"));

        return r.summary();
    }
}
