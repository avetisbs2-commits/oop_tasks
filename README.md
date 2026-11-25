# OOP Tasks

This project contains separate Java console apps for practicing Object-Oriented Programming.

Each app is an independent IntelliJ IDEA module and can be started separately.

Important: do not run the project root as one Java module. Each folder below is a separate module with its own main class.

## Project Structure

```text
oop_tasks/
├── README.md
├── .gitignore
├── vehicle-rental-management/
│   ├── README.md
│   ├── vehicle-rental-management.iml
│   └── src/
├── bank-system/
│   ├── README.md
│   ├── bank-system.iml
│   └── src/
└── oop-exercises/
    ├── README.md
    ├── TODO.md
    ├── oop-exercises.iml
    └── src/exercises/
```

## Run/Debug Configurations

Open:

```text
Run -> Edit Configurations...
```

Click `+`, then choose `Application`.

If IntelliJ asks about source roots, mark each module's `src` folder as `Sources Root`:

```text
vehicle-rental-management/src
bank-system/src
oop-exercises/src
```

## Configuration 1: Vehicle Rental Management

Use these values:

- Name: `Vehicle Rental Management`
- Main class: `Main`
- Module: `vehicle-rental-management`
- JRE: project default JDK
- Program arguments: leave empty
- VM options: leave empty
- Working directory:

```text
/Users/tigranho/Projects/test/oop_tasks/vehicle-rental-management
```

Build and run settings:

- Before launch: `Build`
- Activate tool window: checked

## Configuration 2: Bank System

Use these values:

- Name: `Bank System`
- Main class: `MainBank`
- Module: `bank-system`
- JRE: project default JDK
- Program arguments: leave empty
- VM options: leave empty
- Working directory:

```text
/Users/tigranho/Projects/test/oop_tasks/bank-system
```

Build and run settings:

- Before launch: `Build`
- Activate tool window: checked

If `Build` is missing under `Before launch`:

1. Click `+` in the `Before launch` section.
2. Choose `Build`.
3. Click `OK`.

## Start The Apps From IntelliJ

After creating the configurations:

1. Open the Run/Debug configuration dropdown near the top-right of IntelliJ IDEA.
2. Select one app:

```text
Vehicle Rental Management
Bank System
```

3. Click the green `Run` button.

Use `Debug` instead of `Run` if you want to practice breakpoints.

## Notes

- Each module has its own `README.md` with student tasks.
- Start each console app from its own main class.
- The apps are separate and do not share code.

## OOP Exercises (`oop-exercises`) - Վարժություններ

Սա առանձին module է՝ 10 թեմայով կարճ վարժություններով (հայերեն հրահանգներով)։ Ամեն թեմա ունի իր package-ը `exercises` տակ։
Այս module-ում շատ main դասեր կան, ուստի մեկ ընդհանուր Run configuration չկա. ամեն թեմայի `...Demo` և `...Checks` դասը գործարկվում է առանձին։

| Package | Թեմա | Գործարկվող դասեր |
|---------|------|------------------|
| `exercises.classes` | Դասեր, instance և static | `ClassesDemo`, `ClassesChecks` |
| `exercises.strings` | Տողեր, `==` և `equals`, `intern()` | `StringsDemo`, `StringsChecks` |
| `exercises.encapsulation` | Ինկապսուլյացիա (`BankAccount`) | `EncapsulationDemo`, `EncapsulationChecks` |
| `exercises.equality` | `equals()` և `hashCode()` (`Product`) | `EqualityDemo`, `EqualityChecks` |
| `exercises.collections` | `List`, `Set`, `Map` | `CollectionsDemo`, `CollectionsChecks` |
| `exercises.interfaces` | Ինտերֆեյսներ (`Shape`) | `InterfacesDemo`, `InterfacesChecks` |
| `exercises.inheritance` | Ժառանգում, `super(...)` | `InheritanceDemo`, `InheritanceChecks` |
| `exercises.polymorphism` | Պոլիմորֆիզմ (`Animal`) | `PolymorphismDemo`, `PolymorphismChecks` |
| `exercises.copying` | Shallow և deep copy | `CopyingDemo`, `CopyingChecks` |
| `exercises.relationships` | Ագրեգացիա և կոմպոզիցիա | `RelationshipsDemo`, `RelationshipsChecks` |

Առաջադրանքները, TODO համարները և հարցերը՝ **[oop-exercises/TODO.md](oop-exercises/TODO.md)**։ Մանրամասն հրահանգները՝ **[oop-exercises/README.md](oop-exercises/README.md)**։

### Գործարկում IntelliJ IDEA-ում

1. Եթե `oop-exercises` module-ը չկա Project panel-ում. `File > New > Module from Existing Sources...` և ընտրիր `oop-exercises` թղթապանակը (կամ `oop-exercises.iml` ֆայլը)։ Նշիր `oop-exercises/src`-ը որպես `Sources Root`։
2. Բացիր օրինակ `oop-exercises/src/exercises/strings/StringsDemo.java`, աջ կտտացրու ֆայլի վրա և ընտրիր `Run 'StringsDemo.main()'`։
3. Նույն ձևով գործարկիր `StringsChecks`-ը՝ ստուգումների համար։

### Գործարկում տերմինալից

macOS / Linux (`oop_tasks` թղթապանակից).

```bash
cd oop-exercises
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -Dstdout.encoding=UTF-8 -cp out exercises.strings.StringsDemo
java -Dstdout.encoding=UTF-8 -cp out exercises.strings.StringsChecks
java -Dstdout.encoding=UTF-8 -cp out exercises.AllChecks
```

Windows (`oop-exercises` թղթապանակում).

```bat
chcp 65001
dir /s /b src\*.java > sources.txt
javac -encoding UTF-8 -d out @sources.txt
java -Dstdout.encoding=UTF-8 -cp out exercises.strings.StringsDemo
```

`out/` թղթապանակը արդեն անտեսվում է git-ի կողմից (`.gitignore`)։

