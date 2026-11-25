package exercises.collections;

import java.util.List;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Կրկնությունների հեռացում (List և Set)։
 *
 * Set-ը չի պարունակում կրկնվող տարրեր։ Բայց Set-երի տեսակները տարբեր հերթականություն ունեն.
 *   HashSet       — հերթականությունը չի երաշխավորվում
 *   LinkedHashSet — պահպանում է ավելացման հերթականությունը
 *   TreeSet       — տարրերը տեսակավորված են
 */
public final class DuplicateRemoval {
    private DuplicateRemoval() {
    }

    /**
     * TODO COL-2. Հեռացրու կրկնությունները՝ ՊԱՀՊԱՆԵԼՈՎ առաջին հայտնվելու հերթականությունը։
     *
     * Որոշումներ.
     *   - Հերթականությունը ՊԱՀՊԱՆՎՈՒՄ Է (առաջին հանդիպումը մնում է)։
     *   - null տարրերը բաց են թողնվում։
     *   - Մուտքը չի փոխվում։
     *
     * Քայլեր.  1. Ստեղծիր LinkedHashSet<String>։  2. Ավելացրու նրան յուրաքանչյուր ոչ-null տարրը։
     *          3. Վերադարձրու new ArrayList<>(set)։
     *
     * Օրինակ.  removeDuplicates(["b", "a", "b", null, "c", "a"]) -> ["b", "a", "c"]
     */
    public static List<String> removeDuplicates(List<String> items) {
        // TODO COL-2: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO COL-2: removeDuplicates");
    }
}
