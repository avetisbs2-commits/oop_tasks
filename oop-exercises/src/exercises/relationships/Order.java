package exercises.relationships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. ԿՈՄՊՈԶԻՑԻԱ. Order-ը ՍԵՓԱԿԱՆԱՏԵՐՆ է OrderLine-ների։ Նա ինքն է դրանք ստեղծում,
 * և դրսից ուղղակի OrderLine ավելացնել չի լինում։
 * Նայիր OwnershipReference.House-ին որպես օրինակ։
 *
 * Հիշիր. կոմպոզիցիան նախագծային որոշում է։ Java-ն ինքնաբերաբար չի ոչնչացնում OrderLine-ները, երբ Order-ը
 * անհասանելի է դառնում. դրանք կազատվեն աղբահավաքի կողմից, երբ ոչ մի հղում չմնա։
 */
public class Order {
    private final String customer;
    private final List<OrderLine> lines = new ArrayList<>();

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    /**
     * TODO REL-3. Ստեղծիր ՆՈՐ OrderLine ԱՅՍՏԵՂ (new OrderLine(...)) և ավելացրու lines ցուցակին։
     * Հուշում. lines.add(new OrderLine(product, quantity, unitPriceCents));
     * Օրինակ.  order.addLine("Tea", 2, 500); order.getLines().size() -> 1
     */
    public void addLine(String product, int quantity, long unitPriceCents) {
        // TODO REL-3: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO REL-3: addLine");
    }

    /**
     * TODO REL-4. Վերադարձրու պատվերի ընդհանուր գումարը լումաներով՝ բոլոր տողերի totalCents()-ների գումարը։
     *
     * Քայլեր.  1. long total = 0;   2. for (OrderLine line : lines) { total += line.totalCents(); }   3. return total;
     * Դատարկ պատվեր -> 0։
     * Օրինակ.  Tea 2 x 500 + Milk 1 x 300 -> 1300
     */
    public long totalCents() {
        // TODO REL-4: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO REL-4: totalCents");
    }

    public List<OrderLine> getLines() {
        return Collections.unmodifiableList(lines);
    }
}
