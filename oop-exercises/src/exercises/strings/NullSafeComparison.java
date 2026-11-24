package exercises.strings;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Null-անվտանգ համեմատություն։
 *
 * a.equals(b)-ն նետում է NullPointerException, եթե a == null։ Գրիր մեթոդ, որը երբեք չի նետում։
 */
public final class NullSafeComparison {
    private NullSafeComparison() {
    }

    /**
     * TODO STR-1. Համեմատիր երկու տող ըստ բովանդակության՝ null-անվտանգ։
     *
     * Կանոններ.
     *   - երկուսն էլ null  -> true
     *   - միայն մեկը null  -> false
     *   - ուրիշ դեպքում    -> a.equals(b)
     *
     * Քայլեր.  1. Եթե a == null կամ b == null, վերադարձրու a == b (երկուսն էլ null են՝ true, մեկը՝ false)։
     *          2. Հակառակ դեպքում վերադարձրու a.equals(b)։
     *
     * Օրինակներ.  safeEquals(null, null) -> true      safeEquals("a", null) -> false
     *             safeEquals("Java", "Java") -> true   safeEquals("Java", "java") -> false
     */
    public static boolean safeEquals(String a, String b) {
        // TODO STR-1: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO STR-1: safeEquals");
    }
}
