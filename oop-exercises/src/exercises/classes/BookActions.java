package exercises.classes;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 2. Երկու փոփոխական կարող են ցույց տալ ՆՈՒՅՆ օբյեկտին։
 *
 * Java-ում օբյեկտը մեթոդին փոխանցելիս փոխանցվում է ՀՂՈՒՄԸ։ Մեթոդի ներսում այդ հղումով օբյեկտը փոխելու դեպքում
 * փոփոխությունը երևում է նաև դրսում։
 */
public final class BookActions {
    private BookActions() {
    }

    /**
     * TODO CLS-4. Փոխիր տրված գրքի վերնագիրը newTitle-ով և վերադարձրու ՆՈՒՅՆ գիրքը (ոչ թե նոր օբյեկտ)։
     *
     * Քայլեր.  1. book.setTitle(newTitle);   2. return book;
     * Արդյունք. original.getTitle() նույնպես դառնում է newTitle, և վերադարձվածը == original։
     * Արգելվում է new Book(...)։
     */
    public static Book rename(Book book, String newTitle) {
        // TODO CLS-4: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO CLS-4: rename");
    }
}
