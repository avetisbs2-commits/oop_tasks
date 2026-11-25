package exercises.collections;

import java.util.List;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Ցուցակի ֆիլտրում (List)։
 */
public final class ListFilter {
    private ListFilter() {
    }

    /**
     * TODO COL-1. Վերադարձրու միայն այն բառերը, որոնց երկարությունը >= minLength։
     *
     * Որոշումներ.
     *   - ՀԵՐԹԸ պահպանվում է (ինչպես մուտքում)։
     *   - null տարրերը բաց են թողնվում։
     *   - Մուտքի ցուցակը ՉԻ ՓՈՓՈԽՎՈՒՄ. վերադարձրու ՆՈՐ ցուցակ։
     *
     * Քայլեր.  1. Ստեղծիր նոր ArrayList։  2. for ցիկլով անցիր words-ով։
     *          3. Եթե word != null և word.length() >= minLength, ավելացրու նոր ցուցակին։  4. Վերադարձրու այն։
     * (Նայիր CollectionsReference.onlyEven(...)-ին. այն նույն ձևն ունի։)
     *
     * Օրինակ.  longWords(["a", "abc", null, "hello"], 3) -> ["abc", "hello"]
     */
    public static List<String> longWords(List<String> words, int minLength) {
        // TODO COL-1: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO COL-1: longWords");
    }
}
