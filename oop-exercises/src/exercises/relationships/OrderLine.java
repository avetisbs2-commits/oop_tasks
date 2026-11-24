package exercises.relationships;

/**
 * Պատվերի մեկ տող. ԿՈՄՊՈԶԻՑԻԱՅԻ "մաս"։
 *
 * Կոնստրուկտորը package-private է (public բառ չկա). դրսից OrderLine ստեղծել չի լինում, այն ստեղծում է
 * միայն Order-ը (նույն package-ում)։ Սա է ՍԵՓԱԿԱՆՈՒԹՅԱՆ նախագծումը։
 */
public class OrderLine {
    private final String product;
    private final int quantity;
    private final long unitPriceCents;

    OrderLine(String product, int quantity, long unitPriceCents) {
        this.product = product;
        this.quantity = quantity;
        this.unitPriceCents = unitPriceCents;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getUnitPriceCents() {
        return unitPriceCents;
    }

    public long totalCents() {
        return quantity * unitPriceCents;
    }
}
