package exercises.collections;

import exercises.support.Demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.collections.CollectionsDemo
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ (CollectionsReference)");
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, 7, 10);
        Demo.expect("onlyEven([1, 2, null, 4, 7, 10])", "[2, 4, 10]", () -> CollectionsReference.onlyEven(numbers));
        Demo.expect("letterCounts(\"banana\")", "{b=1, a=3, n=2}", () -> CollectionsReference.letterCounts("banana"));

        Demo.title("2. Վարժություն 1. List-ի ֆիլտրում (COL-1)");
        List<String> words = Arrays.asList("a", "abc", null, "hello");
        Demo.expect("longWords([a, abc, null, hello], 3)", "[abc, hello]", () -> ListFilter.longWords(words, 3));

        Demo.title("3. Վարժություն 2. Կրկնությունների հեռացում (COL-2)");
        List<String> items = Arrays.asList("b", "a", "b", null, "c", "a");
        Demo.expect("removeDuplicates([b, a, b, null, c, a])", "[b, a, c]", () -> DuplicateRemoval.removeDuplicates(items));

        Demo.title("4. Վարժություն 3. Բառերի հաճախականություն (COL-3)");
        List<String> text = Arrays.asList("the", "cat", "the", "dog", "the", "cat");
        Demo.expect("countWords([the, cat, the, dog, the, cat])", "{the=3, cat=2, dog=1}", () -> WordFrequency.countWords(text));

        Demo.title("5. Ինքդ ստուգիր. մուտքի ցուցակը չի փոխվում");
        List<String> original = new ArrayList<>(Arrays.asList("x", "yy", "yy"));
        Demo.show("longWords(original, 2)", () -> ListFilter.longWords(original, 2));
        Demo.expect("original-ը նույնն է", "[x, yy, yy]", () -> original);

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ո՞ր Set-ը պահպանում է հերթականությունը և ո՞րը տեսակավորում է։");
        Demo.line("  2. Ինչու՞ ենք մուտքի ցուցակը չփոխում և վերադարձնում նոր ցուցակ։");
        Demo.line("  3. Ի՞նչ տարբերություն կա HashMap-ի և LinkedHashMap-ի միջև ձեր բառերի հաճախականության արդյունքում։");
    }
}
