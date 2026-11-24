package exercises.strings;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Տեքստի պարզ մշակում։
 * Այս վարժություններում տեքստը երբեք null չէ։
 */
public final class TextProcessing {
    private TextProcessing() {
    }

    /**
     * TODO STR-2. Ստուգիր՝ մեկ բառը պալինդրոմ է, թե ոչ։ Մեծատառ/փոքրատառը անտեսվում է։
     *
     * (Բառը առանց բացատների է։ Պալինդրոմը նույնն է կարդացվում երկու կողմից։)
     * Քայլեր.  1. Դարձրու փոքրատառ (toLowerCase)։
     *          2. Շրջիր՝ new StringBuilder(text).reverse().toString()։
     *          3. Համեմատիր երկուսը equals-ով։
     *
     * Օրինակներ.  isPalindrome("Level") -> true     isPalindrome("Java") -> false     isPalindrome("a") -> true
     */
    public static boolean isPalindrome(String word) {
        // TODO STR-2: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO STR-2: isPalindrome");
    }

    /**
     * TODO STR-3. Հաշվիր ձայնավորների քանակը (a, e, i, o, u). մեծատառ/փոքրատառը նշանակություն չունի։
     *
     * Քայլեր.  1. Անցիր տեքստի բոլոր նիշերով (for ցիկլ և charAt(i), կամ toCharArray())։
     *          2. Յուրաքանչյուր նիշը դարձրու փոքրատառ և ստուգիր՝ "aeiou".indexOf(c) >= 0։
     *
     * Օրինակներ.  countVowels("Hello World") -> 3     countVowels("xyz") -> 0     countVowels("") -> 0
     */
    public static int countVowels(String text) {
        // TODO STR-3: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO STR-3: countVowels");
    }
}
