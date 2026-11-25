package exercises.collections;

import exercises.support.CheckRunner;
import exercises.support.Verify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.collections.CollectionsChecks
 */
public class CollectionsChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("collections");

        r.example("onlyEven keeps order and skips null", () ->
                Verify.equal(List.of(4, 2), CollectionsReference.onlyEven(Arrays.asList(4, null, 1, 2)), "result"));
        r.example("letterCounts keeps first-seen order", () ->
                Verify.equal("{b=1, a=3, n=2}", CollectionsReference.letterCounts("banana").toString(), "banana"));

        r.acceptance("COL-1", "longWords filters, keeps order, skips null", () -> {
            List<String> input = Arrays.asList("a", "abc", null, "hello", "xy");
            Verify.equal(List.of("abc", "hello"), ListFilter.longWords(input, 3), "minLength 3");
            Verify.equal(List.of("a", "abc", "hello", "xy"), ListFilter.longWords(input, 0), "minLength 0");
        });
        r.acceptance("COL-1", "longWords does not change the input list", () -> {
            List<String> input = new ArrayList<>(Arrays.asList("a", "abc"));
            List<String> result = ListFilter.longWords(input, 3);
            Verify.equal(List.of("a", "abc"), input, "input changed");
            Verify.notSame(input, result, "must return a new list");
        });
        r.acceptance("COL-2", "removeDuplicates keeps first-occurrence order, skips null", () -> {
            Verify.equal(List.of("b", "a", "c"),
                    DuplicateRemoval.removeDuplicates(Arrays.asList("b", "a", "b", null, "c", "a")), "result");
            Verify.equal(List.of(), DuplicateRemoval.removeDuplicates(List.of()), "empty list");
        });
        r.acceptance("COL-3", "countWords counts words in first-seen order", () -> {
            Verify.equal("{the=3, cat=2, dog=1}",
                    WordFrequency.countWords(List.of("the", "cat", "the", "dog", "the", "cat")).toString(), "counts and order");
            Verify.equal("{Cat=1, cat=1}", WordFrequency.countWords(List.of("Cat", "cat")).toString(), "case-sensitive");
            Verify.equal(0, WordFrequency.countWords(List.of()).size(), "empty list");
        });

        return r.summary();
    }
}
