package exercises.collections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 3. Բառերի հաճախականություն (Map)։
 */
public final class WordFrequency {
    private WordFrequency() {
    }

    /**
     * TODO COL-3. Հաշվիր, թե ամեն բառը քանի անգամ է հանդիպում ցուցակում։
     *
     * Որոշումներ.
     *   - Մեծատառ/փոքրատառը ՏԱՐԲԵՐ է ("Cat" և "cat" տարբեր բառեր են)։
     *   - Արդյունքի հերթականությունը՝ բառերի ԱՌԱՋԻՆ հայտնվելու հերթականությամբ (LinkedHashMap)։
     *   - Ցուցակում null չկա։
     *
     * Քայլեր.  1. Ստեղծիր LinkedHashMap<String, Integer>։
     *          2. Յուրաքանչյուր բառի համար՝ counts.merge(word, 1, Integer::sum)
     *             (տես CollectionsReference.letterCounts(...)-ը)։  3. Վերադարձրու Map-ը։
     *
     * Օրինակ.  countWords(["the", "cat", "the", "dog", "the", "cat"]) -> {the=3, cat=2, dog=1}   (այս հերթականությամբ)
     */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO COL-3: Իրականացրու և ջնջիր հետևյալ տողը
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (String word : words ){
            linkedHashMap.merge(word, 1, Integer::sum);
        }
        return linkedHashMap;
    }
}
