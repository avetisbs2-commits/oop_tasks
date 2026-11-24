package exercises.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։
 *
 * Երեք որոշում, որոնք պետք է կայացնել յուրաքանչյուր մեթոդի համար.
 *   1. Մուտքի ցուցակը փոխվու՞մ է։          (այստեղ՝ ոչ. ստեղծվում է նոր ցուցակ)
 *   2. ՀԵՐԹԸ պահպանվու՞մ է։                 (այստեղ՝ այո. ցուցակ -> ցուցակ, առանց տեսակավորման)
 *   3. Ի՞նչ ենք անում null արժեքների հետ։  (այստեղ՝ null տարրերը բաց ենք թողնում)
 *
 * letterCounts-ի օրինակ. "banana" -> {b=1, a=3, n=2} (LinkedHashMap-ը պահպանում է առաջին հայտնվելու հերթականությունը)։
 * Վարժություններում ցուցակը ինքը երբեք null չէ։
 */
public final class CollectionsReference {
    private CollectionsReference() {
    }

    public static List<Integer> onlyEven(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number != null && number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static Map<Character, Integer> letterCounts(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : text.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }
        return counts;
    }
}
