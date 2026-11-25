package exercises.equality;

import java.util.Objects;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։ equals() և hashCode() ճիշտ գրելու օրինակ։
 *
 * Կանոններ.
 *   1. equals()-ում համեմատիր նույն դաշտերը, որոնք մասնակցում են hashCode()-ին։
 *   2. Եթե a.equals(b), ապա a.hashCode() == b.hashCode() (հակառակը պարտադիր չէ)։
 *   3. Առանց hashCode()-ը գրելու equals()-ը գրել չի կարելի. HashSet և HashMap-ը կաշխատեն սխալ։
 *   4. Այստեղ Point-ը անփոփոխ է (final դաշտեր). փոփոխելի դաշտերով hashCode-ը վտանգավոր է։
 */
public final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point other = (Point) o;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
