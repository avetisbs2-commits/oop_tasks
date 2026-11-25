package exercises;

import exercises.classes.ClassesChecks;
import exercises.collections.CollectionsChecks;
import exercises.copying.CopyingChecks;
import exercises.encapsulation.EncapsulationChecks;
import exercises.equality.EqualityChecks;
import exercises.inheritance.InheritanceChecks;
import exercises.interfaces.InterfacesChecks;
import exercises.polymorphism.PolymorphismChecks;
import exercises.relationships.RelationshipsChecks;
import exercises.strings.StringsChecks;

/**
 * Գործարկում է ԲՈԼՈՐ թեմաների ստուգումները մեկ անգամ։
 * Գործարկում. exercises.AllChecks
 *
 * Ելքի կոդը 0 է, եթե չկա [EXAMPLE BUG] և [FAIL]։ Դեռ չարված TODO-ները ([TODO]) սխալ չեն համարվում։
 * Սա միայն ՕՐԻՆԱԿՆԵՐԻ և քո արդեն արած աշխատանքի ստուգումն է։
 */
public class AllChecks {
    public static void main(String[] args) {
        int exit = 0;
        exit |= StringsChecks.run();
        exit |= CollectionsChecks.run();
        exit |= InterfacesChecks.run();
        exit |= ClassesChecks.run();
        exit |= EncapsulationChecks.run();
        exit |= InheritanceChecks.run();
        exit |= PolymorphismChecks.run();
        exit |= CopyingChecks.run();
        exit |= EqualityChecks.run();
        exit |= RelationshipsChecks.run();
        System.out.println();
        System.out.println(exit == 0
                ? "Ընդհանուր. սխալներ չկան (դեռ չարված TODO-ները [TODO] են)։"
                : "Ընդհանուր. կան [EXAMPLE BUG] կամ [FAIL]. նայիր վերևի տողերը։");
        System.exit(exit);
    }
}
