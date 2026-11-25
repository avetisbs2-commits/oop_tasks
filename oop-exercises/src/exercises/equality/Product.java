package exercises.equality;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Product՝ անփոփոխ id-ով։
 *
 * ՀԱՎԱՍԱՐՈՒԹՅԱՆ ՍԱՀՄԱՆՈՒՄ. Երկու Product հավասար են, եթե ունեն ՆՈՒՅՆ id-ն։
 * name-ը և priceCents-ը հավասարության մեջ ՉԵՆ մասնակցում (դրանք փոփոխելի են և կարող են տարբերվել)։
 *
 * Նայիր Point-ին որպես օրինակ։
 */
public class Product {
    private final String id;
    private String name;
    private long priceCents;

    public Product(String id, String name, long priceCents) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id must not be blank");
        }
        this.id = id;
        this.name = name;
        this.priceCents = priceCents;
    }

    /**
     * TODO EQL-1. Իրականացրու equals()-ը՝ ըստ ՄԻԱՅՆ id-ի։
     *
     * Քայլեր.
     *   1. Եթե this == o, վերադարձրու true։
     *   2. Եթե o == null կամ getClass() != o.getClass(), վերադարձրու false։
     *   3. Cast արա՝ Product other = (Product) o; և վերադարձրու id.equals(other.id)։
     * (Նայիր Point.equals-ին. այն նույն ձևն ունի։)
     * Օրինակ.  new Product("p1", "Tea", 500).equals(new Product("p1", "Coffee", 900)) -> true
     *          new Product("p1", ...).equals(new Product("p2", ...)) -> false
     */
    @Override
    public boolean equals(Object o) {
        // TODO EQL-1: Իրականացրու և ջնջիր հետևյալ տողը
        if (this == o) {
            return true;
        }else if (o == null || getClass() != o.getClass()){
            return false;
        }Product other = (Product) o;
        return id.equals(other.id);

    }

    /**
     * TODO EQL-2. Իրականացրու hashCode()-ը՝ ՀԱՄԱՁԱՅՆ equals()-ի հետ։
     *
     * Պահանջ. երկու հավասար Product-ը (նույն id) ՊԵՏՔ Է ունենան նույն hashCode։ Օգտագործիր միայն id-ն։
     * Հուշում. մեկ տող՝ return id.hashCode();
     */
    @Override
    public int hashCode() {
        // TODO EQL-2: Իրականացրու և ջնջիր հետևյալ տողը
        return id.hashCode();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(long priceCents) {
        this.priceCents = priceCents;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
