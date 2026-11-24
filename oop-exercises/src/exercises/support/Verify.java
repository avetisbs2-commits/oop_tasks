package exercises.support;

import java.util.Objects;

/**
 * Փոքր ստուգման մեթոդներ (JUnit-ի փոխարեն, որպեսզի նախագծին լրացուցիչ գրադարան պետք չլինի).
 * Ձախողման դեպքում նետվում է AssertionError։ Այս դասը ուսանողների համար փոփոխելու համար չէ։
 */
public final class Verify {

    private Verify() {
    }

    public static void isTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    public static void isFalse(boolean condition, String message) {
        if (condition) {
            throw new AssertionError(message);
        }
    }

    public static void equal(Object expected, Object actual, String message) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError(message + " (expected: " + expected + ", actual: " + actual + ")");
        }
    }

    public static void near(double expected, double actual, String message) {
        if (Math.abs(expected - actual) > 1e-9) {
            throw new AssertionError(message + " (expected: " + expected + ", actual: " + actual + ")");
        }
    }

    public static void same(Object expected, Object actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + " (expected the SAME object)");
        }
    }

    public static void notSame(Object a, Object b, String message) {
        if (a == b) {
            throw new AssertionError(message + " (expected DIFFERENT objects)");
        }
    }

    /**
     * Ստուգում է, որ action-ը նետում է տվյալ տիպի բացառություն։
     * Եթե action-ը նետում է դեռ չիրականացված TODO-ի բացառություն, այն չի համարվում ճիշտ պատասխան,
     * այլ վերանետվում է (ստուգումը կհամարվի «TODO»)։
     */
    public static void throwsException(Class<? extends Throwable> type, Runnable action, String message) {
        try {
            action.run();
        } catch (Throwable t) {
            if (CheckRunner.isTodoPlaceholder(t)) {
                throw (RuntimeException) t;
            }
            if (type.isInstance(t)) {
                return;
            }
            throw new AssertionError(message + " (expected " + type.getSimpleName()
                    + ", but got " + t.getClass().getSimpleName() + ")");
        }
        throw new AssertionError(message + " (expected " + type.getSimpleName() + ", but nothing was thrown)");
    }
}
