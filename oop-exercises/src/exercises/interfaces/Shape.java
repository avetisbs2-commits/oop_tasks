package exercises.interfaces;

import java.util.Locale;

/**
 * Երկրաչափական պատկերի ԻՆՏԵՐՖԵՅՍ (պայմանագիր). ցանկացած պատկեր պետք է իրականացնի այս երկու մեթոդները։
 * Ինտերֆեյսը չի ասում, ԻՆՉՊԵՍ է հաշվվում մակերեսը, այլ միայն՝ որ այն հնարավոր է հաշվել։
 */
public interface Shape {
    double area();

    String name();

    default String describe() {
        return String.format(Locale.ROOT, "%s (area=%.2f)", name(), area());
    }
}
