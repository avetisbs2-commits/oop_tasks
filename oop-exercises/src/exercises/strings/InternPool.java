package exercises.strings;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 3. String pool և intern()։
 *
 * Java-ն պահում է տողերի լիտերալները հատուկ "pool"-ում։ new String("x")-ը ստեղծում է ՆՈՐ օբյեկտ pool-ից դուրս։
 * intern()-ը վերադարձնում է pool-ի օբյեկտը։
 */
public final class InternPool {
    private InternPool() {
    }

    /**
     * TODO STR-4. Վերադարձրու տողի "կանոնական" օրինակը՝ այն օբյեկտը, որը գտնվում է String pool-ում։
     *
     * Հուշում. մեկ տող՝ text.intern()։ (text-ը null չէ։)
     * Օրինակ.  canonical(new String("java")) == "java"  պետք է լինի true
     *          (իսկ առանց canonical-ի՝ new String("java") == "java" -> false)
     */
    public static String canonical(String text) {
        // TODO STR-4: Իրականացրու և ջնջիր հետևյալ տողը
        if (text == null){
            throw new NullPointerException();
        }

        return  text.intern();
    }
}
