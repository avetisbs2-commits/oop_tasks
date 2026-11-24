package exercises.polymorphism;

import exercises.support.CheckRunner;
import exercises.support.Verify;
import java.util.List;

/**
 * Ստուգումներ. example = ավարտված օրինակ, acceptance = քո TODO-ները։
 * Գործարկում. exercises.polymorphism.PolymorphismChecks
 */
public class PolymorphismChecks {
    public static void main(String[] args) {
        System.exit(run());
    }

    public static int run() {
        CheckRunner r = new CheckRunner("polymorphism");

        r.example("Animal base class and Dog override", () -> {
            Animal pet = new Dog("Rex");
            Verify.equal("Woof", pet.sound(), "dynamic dispatch picks Dog.sound");
            Verify.equal("Rex says Woof", pet.describe(), "describe uses the overridden sound");
            Verify.equal("Generic says ...", new Animal("Generic").describe(), "base behavior");
        });
        r.example("overload is chosen by the reference type", () -> {
            Animal a = new Dog("Rex");
            Dog d = new Dog("Rex");
            Verify.equal("feed(Animal)", PolymorphismPredict.feed(a), "static type Animal");
            Verify.equal("feed(Dog)", PolymorphismPredict.feed(d), "static type Dog");
        });

        r.acceptance("POL-1", "Cat.sound and inherited describe", () -> {
            Animal cat = new Cat("Tom");
            Verify.equal("Meow", cat.sound(), "sound");
            Verify.equal("Tom says Meow", cat.describe(), "describe (inherited)");
        });
        r.acceptance("POL-2", "Duck.sound and inherited describe", () -> {
            Animal duck = new Duck("Don");
            Verify.equal("Quack", duck.sound(), "sound");
            Verify.equal("Don says Quack", duck.describe(), "describe (inherited)");
        });
        r.acceptance("POL-3", "chorus joins sounds via Animal references", () -> {
            List<Animal> animals = List.of(new Dog("Rex"), new Cat("Tom"), new Duck("Don"), new Animal("Generic"));
            Verify.equal("Woof, Meow, Quack, ...", Zoo.chorus(animals), "mixed list");
            Verify.equal("", Zoo.chorus(List.of()), "empty list");
            Verify.equal("Woof", Zoo.chorus(List.of(new Dog("Rex"))), "one animal, no separator");
        });

        return r.summary();
    }
}
