package exercises.polymorphism;

/**
 * ԳՈՒՇԱԿԻՐ (ավարտված օրինակ, ուսանողը չի փոխում). overriding և overloading տարբերությունը։
 *
 * Նախքան PolymorphismDemo-ն գործարկելը՝ ԳՈՒՇԱԿԻՐ, թե ինչ կտպվի feed(...)-ի ամեն կանչի համար։
 *
 *   Animal a = new Dog("Rex");
 *   Dog d = new Dog("Rex");
 *
 *   feed(a)   -> ?
 *   feed(d)   -> ?
 *   a.sound() -> ?
 *
 * Կանոն. overload-ի (նույն անունով տարբեր պարամետրեր) ընտրությունը կատարվում է ԿՈՄՊԻԼՅԱՑԻԱՅԻ պահին՝ ըստ ՀՂՈՒՄԻ ՏԻՊԻ։
 *        override-ի (ենթադասում վերասահմանված մեթոդ) ընտրությունը կատարվում է ԳՈՐԾԱՐԿՄԱՆ պահին՝ ըստ ՕԲՅԵԿՏԻ ՏԻՊԻ։
 */
public final class PolymorphismPredict {
    private PolymorphismPredict() {
    }

    public static String feed(Animal animal) {
        return "feed(Animal)";
    }

    public static String feed(Dog dog) {
        return "feed(Dog)";
    }
}
