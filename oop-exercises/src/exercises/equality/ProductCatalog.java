package exercises.equality;

import java.util.Collection;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. HashSet-ը և կրկնվող Product-ները։
 *
 * HashSet-ը կրկնություն համարում է երկու տարր, եթե a.equals(b) և hashCode-երը նույնն են։
 * Այս վարժությունը աշխատում է ՄԻԱՅՆ երբ EQL-1 և EQL-2 ճիշտ են իրականացված։
 */
public final class ProductCatalog {
    private ProductCatalog() {
    }

    /**
     * TODO EQL-3. Վերադարձրու տարբեր (ըստ id) Product-ների քանակը։
     *
     * Քայլեր.  1. Ստեղծիր HashSet<Product>։
     *          2. Ավելացրու նրան բոլոր products-ը (for ցիկլով կամ addAll)։
     *          3. Վերադարձրու set.size()։
     * Օրինակ.  [p1, p2, p1, p3, p3] -> 3
     */
    public static int countDistinct(Collection<Product> products) {
        // TODO EQL-3: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO EQL-3: countDistinct");
    }
}
