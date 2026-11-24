package exercises.classes;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 1. Book դաս։ Լրացրու կոնստրուկտորը և երկու մեթոդ։
 * Նայիր Pen դասին որպես օրինակ (static հաշվիչ, instance դաշտեր)։
 *
 * Դաշտերը (title, author, pages) և static դաշտերը արդեն հայտարարված են։
 */
public class Book {
    public static final int LONG_BOOK_PAGES = 300;

    private static int createdCount = 0;

    private String title;
    private String author;
    private int pages;

    /**
     * TODO CLS-1. Կոնստրուկտոր։
     *   1. Վերագրիր title, author, pages դաշտերին (օգտագործիր this)։
     *   2. Ավելացրու createdCount-ը 1-ով (createdCount++)։
     * Օրինակ.  new Book("Java", "Gosling", 400)  -> getTitle() = "Java", getPages() = 400
     */
    public Book(String title, String author, int pages) {
        // TODO CLS-1: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO CLS-1: Book constructor");
    }

    /**
     * TODO CLS-2. Վերադարձրու true, եթե գիրքը "long" է (էջերը >= LONG_BOOK_PAGES)։
     * Օրինակ.  300 էջ -> true, 299 էջ -> false
     */
    public boolean isLong() {
        // TODO CLS-2: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO CLS-2: isLong");
    }

    /**
     * TODO CLS-3. Վերադարձրու գրքի տեքստային նկարագրությունը՝  Title by Author (N pages)
     * Հուշում. title + " by " + author + " (" + pages + " pages)"
     * Օրինակ.  new Book("Java", "Gosling", 400).toString() -> "Java by Gosling (400 pages)"
     */
    @Override
    public String toString() {
        // TODO CLS-3: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO CLS-3: toString");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public static int getCreatedCount() {
        return createdCount;
    }
}
