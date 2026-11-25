package exercises.encapsulation;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Օգնական մեթոդ BankAccount-ի հետ աշխատելու համար։
 * Այս դասը ՉԻ կարող դիպչել BankAccount-ի private դաշտերին. օգտագործիր միայն public մեթոդները։
 */
public final class AccountTools {
    private AccountTools() {
    }

    /**
     * TODO ENC-3. Փոխանցիր amountCents-ը from հաշվից to հաշվին։
     *
     * Քայլեր.  1. from.withdraw(amountCents);
     *          2. to.deposit(amountCents);
     * Ինչու՞ այս հերթականությամբ. եթե withdraw-ը սխալ նետի, deposit-ը չի կատարվի, և ԵՐԿՈՒ մնացորդները չեն փոխվի։
     * Օրինակ.  from=1000, to=50, transfer 400 -> from=600, to=450
     */
    public static void transfer(BankAccount from, BankAccount to, long amountCents) {
        // TODO ENC-3: Իրականացրու և ջնջիր հետևյալ տողը
        from.withdraw(amountCents);
        to.deposit(amountCents);
    }
}
