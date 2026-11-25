package exercises.copying;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ. Ապացուցիր, որ խոր պատճենը անկախ է։
 */
public final class CopyTools {
    private CopyTools() {
    }

    /**
     * TODO CPY-3. ԱՊԱՑՈՒՅՑ. վերադարձրու true, եթե խոր պատճենի փոփոխությունը ՉԻ ազդել օրիգինալի վրա։
     *
     * Քայլեր.
     *   1. String before = original.getCity().getName();      (հիշիր օրիգինալի քաղաքի անունը)
     *   2. Person copy = original.deepCopy();
     *   3. copy.getCity().setName("CHANGED");                 (փոխիր ՊԱՏՃԵՆԻ քաղաքը)
     *   4. վերադարձրու՝ original.getCity().getName().equals(before)
     * Այս մեթոդը ՉԻ ՓՈՓՈԽՈՒՄ original-ը։
     */
    public static boolean copyIsIndependent(Person original) {
        // TODO CPY-3: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO CPY-3: copyIsIndependent");
    }
}
