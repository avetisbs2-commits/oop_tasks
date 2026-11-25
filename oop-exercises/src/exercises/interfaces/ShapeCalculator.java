package exercises.interfaces;

import java.util.List;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 3. Աշխատանք ինտերֆեյսի հղումներով։
 *
 * Կարևոր. այս դասը ՉԻ ԳԻՏԵ Rectangle-ի, Circle-ի կամ Square-ի մասին։ Այն օգտագործում է միայն Shape ինտերֆեյսը։
 * Նոր պատկեր ավելացնելիս այս դասը փոխել պետք չէ։
 */
public final class ShapeCalculator {
    private ShapeCalculator() {
    }

    /**
     * TODO INT-3. Վերադարձրու բոլոր պատկերների մակերեսների գումարը։
     *
     * Քայլեր.  1. double total = 0;
     *          2. for (Shape shape : shapes) { total += shape.area(); }
     *          3. Վերադարձրու total-ը։
     * Արգելվում է instanceof և cast. օգտագործիր միայն shape.area()։ Դատարկ ցուցակ -> 0.0։
     *
     * Օրինակ.  totalArea([Square(2), Rectangle(3, 4)]) -> 16.0
     */
    public static double totalArea(List<Shape> shapes) {
        // TODO INT-3: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO INT-3: totalArea");
    }
}
