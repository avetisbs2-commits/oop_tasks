package exercises.polymorphism;

import exercises.support.Demo;
import java.util.List;

/**
 * Գործարկվող օրինակներ նմուշային մուտքերով և սպասվող արդյունքներով։
 * Գործարկում. exercises.polymorphism.PolymorphismDemo
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        Demo.title("1. Ավարտված օրինակ. Dog");
        Animal pet = new Dog("Rex");
        Demo.expect("pet.sound() (Dog-ի տարբերակ)", "Woof", pet::sound);
        Demo.expect("pet.describe()", "Rex says Woof", pet::describe);
        Demo.expect("pet.getClass().getSimpleName()", "Dog", () -> pet.getClass().getSimpleName());
        Demo.expect("new Animal(\"Generic\").describe()", "Generic says ...", () -> new Animal("Generic").describe());

        Demo.title("2. Վարժություն 1-2. Cat և Duck (POL-1, POL-2)");
        Demo.expect("new Cat(\"Tom\").sound()", "Meow", () -> new Cat("Tom").sound());
        Demo.expect("new Cat(\"Tom\").describe()", "Tom says Meow", () -> new Cat("Tom").describe());
        Demo.expect("new Duck(\"Don\").sound()", "Quack", () -> new Duck("Don").sound());
        Demo.expect("new Duck(\"Don\").describe()", "Don says Quack", () -> new Duck("Don").describe());

        Demo.title("3. Վարժություն 3. Zoo՝ Animal հղումներով (POL-3)");
        List<Animal> animals = List.of(new Dog("Rex"), new Cat("Tom"), new Duck("Don"), new Dog("Fido"));
        Demo.expect("chorus(animals)", "Woof, Meow, Quack, Woof", () -> Zoo.chorus(animals));
        Demo.expect("chorus([])", "", () -> Zoo.chorus(List.of()));

        Demo.title("4. Գուշակիր. overload թե override");
        Animal a = new Dog("Rex");
        Dog d = new Dog("Rex");
        System.out.println("  PolymorphismPredict.feed(a) -> " + PolymorphismPredict.feed(a)
                + "   (գուշակի՞ր. հղումի տիպը Animal է)");
        System.out.println("  PolymorphismPredict.feed(d) -> " + PolymorphismPredict.feed(d));
        System.out.println("  a.sound()                   -> " + a.sound() + "   (ըստ օբյեկտի տիպի՝ Dog)");

        Demo.title("Հարցեր (պատասխանիր TODO.md-ում նշված հարցերին)");
        Demo.line("  1. Ինչու՞ է pet.sound()-ը վերադարձնում \"Woof\", թեև pet-ի տիպը Animal է։");
        Demo.line("  2. Ինչու՞ է feed(a)-ն կանչում feed(Animal)-ը, թեև a-ն իրականում Dog է։");
        Demo.line("  3. Ինչու՞ describe()-ը Cat-ում գրել պետք չէ, բայց արդյունքը ճիշտ է։");
    }
}
