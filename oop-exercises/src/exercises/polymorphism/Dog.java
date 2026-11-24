package exercises.polymorphism;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։ Վերասահմանված sound()։
 * Նայիր @Override-ին. կոմպիլյատորը կստուգի, որ մեթոդը իսկապես վերասահմանում է ծնողինը։
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Woof";
    }
}
