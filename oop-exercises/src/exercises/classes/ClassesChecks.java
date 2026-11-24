package exercises.classes;

import exercises.support.CheckRunner;
import exercises.support.Verify;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.classes.ClassesChecks
 */
public class ClassesChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("classes");

        r.example("Pen: static counter is shared, color is per object", () -> {
            int before = Pen.getCreated();
            Pen a = new Pen("red");
            Pen b = new Pen("blue");
            Verify.equal("Pen(red)", a.describe(), "a");
            Verify.equal("Pen(blue)", b.describe(), "b");
            Verify.equal(2, Pen.getCreated() - before, "created count");
        });
        r.example("A second reference is the same object", () -> {
            Pen a = new Pen("red");
            Pen alias = a;
            Verify.same(a, alias, "alias");
        });

        r.acceptance("CLS-1", "constructor sets all fields", () -> {
            Book b = new Book("Java", "Gosling", 400);
            Verify.equal("Java", b.getTitle(), "title");
            Verify.equal("Gosling", b.getAuthor(), "author");
            Verify.equal(400, b.getPages(), "pages");
        });
        r.acceptance("CLS-1", "every constructor call increases Book.getCreatedCount()", () -> {
            int before = Book.getCreatedCount();
            new Book("A", "B", 10);
            new Book("C", "D", 20);
            Verify.equal(2, Book.getCreatedCount() - before, "created count");
        });
        r.acceptance("CLS-2", "isLong boundary at LONG_BOOK_PAGES", () -> {
            Verify.isTrue(new Book("A", "B", Book.LONG_BOOK_PAGES).isLong(), "300 pages");
            Verify.isFalse(new Book("A", "B", Book.LONG_BOOK_PAGES - 1).isLong(), "299 pages");
        });
        r.acceptance("CLS-3", "toString format", () ->
                Verify.equal("Java by Gosling (400 pages)", new Book("Java", "Gosling", 400).toString(), "toString"));
        r.acceptance("CLS-4", "rename changes the SAME object and returns it", () -> {
            Book original = new Book("Old", "Author", 100);
            int before = Book.getCreatedCount();
            Book result = BookActions.rename(original, "New");
            Verify.same(original, result, "must return the same object");
            Verify.equal("New", original.getTitle(), "the original sees the change");
            Verify.equal(0, Book.getCreatedCount() - before, "no new Book may be created");
        });

        return r.summary();
    }
}
