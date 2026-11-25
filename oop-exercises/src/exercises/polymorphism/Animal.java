package exercises.polymorphism;

/**
 * ԲԱԶՄԱՅԻՆ ԴԱՍ (ավարտված. ուսանողը չի փոխում)։
 *
 * sound()-ը վերասահմանվում է ենթադասերում։ describe()-ը ՉԻ վերասահմանվում շատ ենթադասերում, բայց կանչում է sound()-ը,
 * ուստի ԱՆՈՒՂԱԿԻՈՐԵՆ օգտագործում է ենթադասի տարբերակը. սա է պոլիմորֆիզմը։
 */
public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sound() {
        return "...";
    }

    public String describe() {
        return name + " says " + sound();
    }
}
