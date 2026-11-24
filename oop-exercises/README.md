# OOP Exercises - OOP վարժություններ

Այս module-ը պարունակում է **10 թեմայով կարճ վարժություններ**։ Դու արդեն գիտես Java-ի շարահյուսությունը և OOP-ի հիմքերը. քո խնդիրն է **կարդալ առկա կոդը և լրացնել բացակայող մասերը**։

Ամեն թեմայի համար կա.

- **մեկ փոքր, ամբողջությամբ իրականացված օրինակ** (այն չես փոխում, միայն կարդում ես),
- **2-3 կարճ և պարզ վարժություն** մասնակի իրականացմամբ (TODO-ներով). ամեն TODO-ի վերևում կան քայլեր և հուշումներ,
- **գործարկվող օրինակ** (`...Demo`)՝ նմուշային մուտքերով և սպասվող արդյունքներով,
- **ստուգումներ** (`...Checks`),
- **հարցեր**, որոնց պետք է պատասխանես քո խոսքերով (տես `TODO.md`)։

Առաջադրանքները, TODO համարները և հարցերը՝ **[TODO.md](TODO.md)**։

## Թեմաներ

Ընդհանուր՝ **34 կարճ TODO** (թեմաներից յուրաքանչյուրում՝ 3-4, ամեն մեկը՝ մեկ մեթոդ)։

| # | Package | Թեմա | Ավարտված օրինակ | Քո ֆայլերը (TODO) |
|---|---------|------|------------------|---------------------|
| 1 | `exercises.classes` | Դասեր, instance և static | `Pen` | `Book`, `BookActions` (CLS-1..4) |
| 2 | `exercises.strings` | Տողեր, `==` / `equals`, `intern()` | `StringsReference` | `StringsPredict`, `NullSafeComparison`, `TextProcessing`, `InternPool` (STR-P1..5, STR-1..4) |
| 3 | `exercises.encapsulation` | Ինկապսուլյացիա | `Thermostat` | `BankAccount`, `AccountTools` (ENC-1..3) |
| 4 | `exercises.equality` | `equals()` և `hashCode()` | `Point` | `Product`, `ProductCatalog` (EQL-1..3) |
| 5 | `exercises.collections` | `List`, `Set`, `Map` | `CollectionsReference` | `ListFilter`, `DuplicateRemoval`, `WordFrequency` (COL-1..3) |
| 6 | `exercises.interfaces` | Ինտերֆեյսներ | `Shape`, `Square` | `Rectangle`, `Circle`, `ShapeCalculator` (INT-1..3) |
| 7 | `exercises.inheritance` | Ժառանգում | `Vehicle`, `Car` | `Truck`, `Motorcycle` (INH-1..4) |
| 8 | `exercises.polymorphism` | Պոլիմորֆիզմ | `Animal`, `Dog` | `Cat`, `Duck`, `Zoo` (POL-1..3) |
| 9 | `exercises.copying` | Shallow և deep copy | `Person.shallowCopy()` | `City`, `Person.deepCopy()`, `CopyTools` (CPY-1..3) |
| 10 | `exercises.relationships` | Ագրեգացիա և կոմպոզիցիա | `OwnershipReference` | `Team`, `Order` (REL-1..4) |

**Առաջարկվող հերթականությունը** այս աղյուսակի հերթականությունն է (1-ից 10)։ Թեմաները կախված չեն իրարից, բայց այս հերթականությունը գնում է պարզից բարդ։

## Ինչպես գործարկել

### IntelliJ IDEA

1. Եթե `oop-exercises` module-ը չի երևում. `File > New > Module from Existing Sources...` -> ընտրիր `oop-exercises` թղթապանակը։ Նշիր `src`-ը `Sources Root`։
2. Բացիր, օրինակ, `src/exercises/strings/StringsDemo.java`։ Աջ կտտացրու և ընտրիր `Run 'StringsDemo.main()'`։
3. Նույն ձևով գործարկիր `StringsChecks`-ը։

### Տերմինալ

macOS / Linux (`oop-exercises` թղթապանակում).

```bash
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -Dstdout.encoding=UTF-8 -cp out exercises.strings.StringsDemo
java -Dstdout.encoding=UTF-8 -cp out exercises.strings.StringsChecks
java -Dstdout.encoding=UTF-8 -cp out exercises.AllChecks
```

Windows (Command Prompt, `oop-exercises` թղթապանակում).

```bat
chcp 65001
dir /s /b src\*.java > sources.txt
javac -encoding UTF-8 -d out @sources.txt
java -Dstdout.encoding=UTF-8 -cp out exercises.strings.StringsDemo
```

- Պահանջվող Java՝ **17 կամ ավելի նոր** (նախագիծը օգտագործում է JDK 25, կոդը փորձարկված է JDK 21-ով և 25-ով)։
- `-encoding UTF-8` պետք է, որովհետև կոդի մեկնաբանությունները հայերեն են։ Եթե կոնսոլում հայերեն տառերի փոխարեն `?` ես տեսնում, օգտագործիր `-Dstdout.encoding=UTF-8` (Windows-ում՝ նաև `chcp 65001`)։
- `out/` թղթապանակը git-ը անտեսում է։

## `Demo` և `Checks`. ինչպես կարդալ արդյունքը

**`...Demo`** (օրինակ՝ `StringsDemo`) ցույց է տալիս նմուշային մուտքերը և **սպասվող** ու **ստացված** արդյունքները.

```text
  [OK]   safeEquals(null, null) -> true   (սպասվող՝ true)
  [DIFF] countWords("   ") -> 1   (սպասվող՝ 0)
  [TODO] isPalindrome("Java") -> (TODO — TODO STR-4: isPalindrome)   (սպասվող՝ false)
```

- `[OK]` - համընկնում է, `[DIFF]` - տարբերվում է, `[TODO]` - մեթոդը դեռ չես գրել։

**`...Checks`** (օրինակ՝ `StringsChecks`) ստուգումներ են՝ երկու տեսակի.

| Նշան | Ինչ է նշանակում |
|------|-----------------|
| `[EXAMPLE ok]` / `[EXAMPLE BUG]` | **Ավարտված օրինակի** ստուգում։ Սա քո աշխատանքը չէ և պետք է միշտ լինի `ok`։ `BUG` նշանակում է սխալ դասընթացի նյութում. տեղեկացրու դասախոսին |
| `[PASS]` | Քո TODO-ն ճիշտ է իրականացված |
| `[FAIL]` | Քո TODO-ն իրականացված է, բայց արդյունքը սխալ է. տողի վերջում գրված է պատճառը |
| `[TODO]` | Դեռ չես լրացրել (սա **սխալ չէ**, պարզապես քո հերթը չի եկել) |

`exercises.AllChecks`-ը գործարկում է բոլոր թեմաների ստուգումները և տպում ամփոփում։

## Կանոններ

1. Փոխիր **միայն** TODO-ով նշված մեթոդները (և `StringsPredict.java`-ի `PREDICTION_n`-ը)։ Ավարտված օրինակները, `Demo`, `Checks` և `support` ֆայլերը չփոխես։
2. Ամեն TODO-ի մեկնաբանության մեջ գրված են կանոնները, օրինակները և հուշումները. կարդա դրանք մինչ գրելը։
3. Երբ մեթոդը իրականացնում ես, **ջնջիր** `throw new UnsupportedOperationException("TODO ...")` տողը։
4. Կոնստրուկտորներում, որտեղ `super("TODO", 0)` է գրված, այդ տողը փոխարինիր ճիշտ կանչով (տես համապատասխան TODO-ի մեկնաբանությունը)։
5. Մի օգտագործիր արտաքին գրադարաններ. միայն JDK։
6. Վերջում պատասխանիր TODO.md-ի հարցերին։

## Դասախոսի համար

- Նախագիծը համեմատաբար անկախ module է. կախվածություն չկա `bank-system` և `vehicle-rental-management` module-ներից, և նոր գրադարաններ չեն ավելացվել։ Ստուգումները չեն օգտագործում JUnit (նախագծում build tool չկա)։ `exercises.support` package-ը փոքր օգնական դասեր է՝ `Verify`, `CheckRunner`, `Demo`։
- Թեմաները մեկը մյուսից կախված չեն (բացառությունը՝ `AllChecks`, որը միայն գործարկում է ստուգումները)։
- Ուսանողների լուծումները այս repository-ում չկան։
- Թեմաներում թրեդներ, համաժամեցում և ասինխրոն կոդ չկա։
