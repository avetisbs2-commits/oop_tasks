package exercises.classes;

import exercises.support.Demo;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.classes.ClassesDemo
 */
public class ClassesDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. instance և static (Pen)");
        int before = Pen.getCreated();
        Pen red = new Pen("red");
        Pen blue = new Pen("blue");
        Demo.expect("red.describe()", "Pen(red)", red::describe);
        Demo.expect("blue.describe()", "Pen(blue)", blue::describe);
        Demo.expect("Pen.getCreated() - before", 2, () -> Pen.getCreated() - before);

        Demo.title("2. Երկու փոփոխական նույն օբյեկտին (ավարտված օրինակ)");
        Pen first = new Pen("green");
        Pen alias = first;
        Demo.expect("first == alias", true, () -> first == alias);
        Demo.expect("Pen.getCreated() - before", 3, () -> Pen.getCreated() - before);

        Demo.title("3. Վարժություն 1. Book (CLS-1 .. CLS-3)");
        Demo.expect("new Book(\"Java\", \"Gosling\", 400).toString()", "Java by Gosling (400 pages)",
                () -> new Book("Java", "Gosling", 400).toString());
        Demo.expect("new Book(\"A\", \"B\", 300).isLong()", true, () -> new Book("A", "B", 300).isLong());
        Demo.expect("new Book(\"A\", \"B\", 299).isLong()", false, () -> new Book("A", "B", 299).isLong());
        Demo.expect("Book.getCreatedCount()-ի աճը 3 նոր Book-ից հետո", 3, () -> {
            int count = Book.getCreatedCount();
            new Book("A", "x", 1);
            new Book("B", "y", 2);
            new Book("C", "z", 3);
            return Book.getCreatedCount() - count;
        });

        Demo.title("4. Վարժություն 2. Նույն օբյեկտի հղումներ (CLS-4)");
        Demo.expect("rename(book, \"New\").getTitle()", "New", () -> {
            Book book = new Book("Old", "Author", 100);
            return BookActions.rename(book, "New").getTitle();
        });
        Demo.expect("rename(book, \"New\") == book", true, () -> {
            Book book = new Book("Old", "Author", 100);
            return BookActions.rename(book, "New") == book;
        });

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ է getCreatedCount() static, իսկ getTitle()-ը՝ ոչ։");
        Demo.line("  2. Երբ գրում ես Pen alias = first;, քանի՞ Pen օբյեկտ կա հիշողության մեջ։");
        Demo.line("  3. Ինչու՞ BookActions.rename-ը փոխում է original գիրքը, թեև մենք այն չենք վերագրում։");
    }
}
