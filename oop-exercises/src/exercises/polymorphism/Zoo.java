package exercises.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * ՎԱՐԺՈՒԹՅՈՒՆ 3. Տարբեր կենդանիների մշակում ԲԱԶՄԱՅԻՆ ԴԱՍԻ հղումներով։
 *
 * Այս դասը ՉԻ ԳԻՏԵ Dog-ի, Cat-ի կամ Duck-ի մասին. նա տեսնում է միայն Animal։ JVM-ը ԳՈՐԾԱՐԿՄԱՆ պահին ընտրում է
 * իրական օբյեկտի (Dog, Cat, ...) մեթոդը։
 */
public final class Zoo {
    private Zoo() {
    }

    /**
     * TODO POL-3. Վերադարձրու բոլոր կենդանիների ձայները՝ մեկ տողով, ", " բաժանարարով, ցուցակի հերթականությամբ։
     *
     * Քայլեր.  1. Ստեղծիր դատարկ List<String>։
     *          2. for (Animal animal : animals) { sounds.add(animal.sound()); }
     *          3. Վերադարձրու String.join(", ", sounds)։
     * Արգելվում է instanceof. օգտագործիր միայն animal.sound()։ Դատարկ ցուցակ -> "" (դատարկ տող)։
     *
     * Օրինակ.  chorus([Dog, Cat, Duck]) -> "Woof, Meow, Quack"
     */
    public static String chorus(List<Animal> animals) {
        // TODO POL-3: Իրականացրու և ջնջիր հետևյալ տողը
        List<String> sounds = new ArrayList<>();
        for (Animal animal : animals) { sounds.add(animal.sound()); }
        return String.join(", ", sounds);
    }
}
