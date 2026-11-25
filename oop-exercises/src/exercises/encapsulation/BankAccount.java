package exercises.encapsulation;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. BankAccount՝ private վիճակով։
 *
 * Գումարները պահվում են ԱՄԲՈՂՋ թվերով՝ ամենափոքր արժույթի միավորով (օրինակ՝ լումա/ցենտ).
 * 1234 նշանակում է 12.34։ (Ինչու՞ ոչ double. տես հարցերը TODO.md-ում։)
 *
 * Անվավեր գործողության կանոնները.
 *   - Գումարը <= 0                -> նետիր IllegalArgumentException։
 *   - Անբավարար միջոցներ withdraw-ում -> նետիր IllegalStateException։
 *   - Ցանկացած սխալի դեպքում մնացորդը ՉԻ ՓՈՓՈԽՎՈՒՄ։
 *
 * Նայիր Thermostat-ին որպես օրինակ։ Կոնստրուկտորը և getter-ները պատրաստ են։
 */
public class BankAccount {
    private final String owner;
    private long balanceCents;

    public BankAccount(String owner, long initialBalanceCents) {
        this.owner = owner;
        this.balanceCents = initialBalanceCents;
    }

    /**
     * TODO ENC-1. Ավելացրու amountCents-ը մնացորդին։
     *
     * Քայլեր.  1. Եթե amountCents <= 0, նետիր new IllegalArgumentException("...")։
     *          2. Այլապես balanceCents += amountCents;
     * Օրինակ.  մնացորդ 1000, deposit(250) -> 1250
     */
    public void deposit(long amountCents) {
        // TODO ENC-1: Իրականացրու և ջնջիր հետևյալ տողը
        if (amountCents <= 0){
            throw new IllegalArgumentException("...");
        }
        balanceCents += amountCents;
    }

    /**
     * TODO ENC-2. Հանիր amountCents-ը մնացորդից։
     *
     * Քայլեր.  1. Եթե amountCents <= 0, նետիր IllegalArgumentException։
     *          2. Եթե amountCents > balanceCents, նետիր IllegalStateException։
     *          3. Այլապես balanceCents -= amountCents;
     * Օրինակ.  մնացորդ 1000, withdraw(300) -> 700;  withdraw(1001) -> IllegalStateException (մնացորդը մնում է 1000)
     */
    public void withdraw(long amountCents) {
        // TODO ENC-2: Իրականացրու և ջնջիր հետևյալ տողը
        if (amountCents <= 0 ){
            throw new IllegalArgumentException("...");
        }else if (amountCents > balanceCents){
            throw new IllegalStateException ("մն ացորդը մնում է 1000");
        }
        balanceCents -= amountCents;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalanceCents() {
        return balanceCents;
    }
}
