package exercises.support;

/**
 * Ստուգումների կատարող. Ամեն թեմա ունի իր XxxChecks դասը, որն օգտագործում է այս runner-ը։
 *
 * Երկու տեսակի ստուգում կա.
 *  - example(...)    — ավարտված ՕՐԻՆԱԿԻ ստուգում. պետք է ՄԻՇՏ անցնի։ Եթե ձախողվի, սխալը դասընթացի նյութի մեջ է։
 *  - acceptance(...) — ՔՈ աշխատանքի ստուգում. քանի դեռ TODO-ն չես լրացրել, արդյունքը "TODO" է (սա սխալ չէ)։
 *                      Երբ լրացնես, պետք է դառնա "PASS"։ Սխալ իրականացման դեպքում կտեսնես "FAIL"։
 */
public final class CheckRunner {

    private final String topic;
    private int exampleOk;
    private int exampleFail;
    private int pass;
    private int fail;
    private int todo;

    public CheckRunner(String topic) {
        this.topic = topic;
        System.out.println();
        System.out.println("=== " + topic + " ===");
    }

    /** true, եթե բացառությունը placeholder-ի "TODO ..." բացառություն է։ */
    static boolean isTodoPlaceholder(Throwable t) {
        return t instanceof UnsupportedOperationException
                && t.getMessage() != null
                && t.getMessage().startsWith("TODO");
    }

    public void example(String name, Runnable check) {
        try {
            check.run();
            exampleOk++;
            System.out.println("[EXAMPLE ok ] " + name);
        } catch (Throwable t) {
            exampleFail++;
            System.out.println("[EXAMPLE BUG] " + name + "  -> " + describe(t));
        }
    }

    public void acceptance(String todoId, String name, Runnable check) {
        try {
            check.run();
            pass++;
            System.out.println("[PASS       ] " + todoId + "  " + name);
        } catch (Throwable t) {
            if (isTodoPlaceholder(t)) {
                todo++;
                System.out.println("[TODO       ] " + todoId + "  " + name + "  (դեռ չի իրականացված)");
            } else {
                fail++;
                System.out.println("[FAIL       ] " + todoId + "  " + name + "  -> " + describe(t));
            }
        }
    }

    private static String describe(Throwable t) {
        if (t instanceof AssertionError) {
            return t.getMessage();
        }
        return "exception " + t.getClass().getSimpleName() + (t.getMessage() == null ? "" : ": " + t.getMessage());
    }

    /** Տպում է ամփոփումը։ Վերադարձնում է 0, եթե չկան EXAMPLE BUG և FAIL, այլապես 1։ */
    public int summary() {
        System.out.println("--- " + topic + ": օրինակներ OK=" + exampleOk + ", օրինակի սխալ=" + exampleFail
                + " | քո աշխատանք PASS=" + pass + ", FAIL=" + fail + ", TODO (դեռ չարված)=" + todo);
        return (exampleFail == 0 && fail == 0) ? 0 : 1;
    }
}
