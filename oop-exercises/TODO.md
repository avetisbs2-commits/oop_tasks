# TODO. ուսանողի առաջադրանքներ

Այս ֆայլը նկարագրում է **ինչ պետք է անես** յուրաքանչյուր թեմայում։ Բոլոր աշխատանքը `src/exercises/<թեմա>/` թղթապանակներում է։
Կոդի մեջ կգտնես նույն համարներով `// TODO XXX-n` մեկնաբանություններ (IntelliJ IDEA-ում՝ `View > Tool Windows > TODO`)։

## Ինչպես աշխատել

1. Բացիր թեմայի **ավարտված օրինակը** (նշված է ստորև) և կարդա։
2. Գործարկիր `...Demo` դասը. այն ցույց է տալիս նմուշային մուտքերը, **սպասվող** և **ստացված** արդյունքները։ `[TODO]` նշանակում է՝ մեթոդը դեռ չես գրել, `[DIFF]`՝ արդյունքը տարբերվում է սպասվողից, `[OK]`՝ ճիշտ է։
3. Լրացրու TODO-ները **հերթականությամբ**։ Ամեն TODO-ի վերևում կա կանոնների մանրամասն նկարագրություն. կարդա այն։ Ջնջիր `throw new UnsupportedOperationException("TODO ...")` տողը, երբ մեթոդը իրականացնես։
4. Գործարկիր `...Checks` դասը. `[PASS]` նշանակում է՝ ճիշտ է, `[FAIL]`՝ սխալ կա (կտեսնես պատճառը), `[TODO]`՝ դեռ չես գրել։
5. Պատասխանիր «Հարցեր»-ին (գրավոր, քո խոսքերով)։

> `[EXAMPLE ok]` / `[EXAMPLE BUG]` տողերը **ավարտված օրինակների** ստուգումներն են։ Դրանք պետք է միշտ անցնեն. դրանք քո աշխատանքը չեն։

**Արգելված է** փոխել `Checks`, `Demo` և `support` ֆայլերը։ Մի ջնջիր TODO մեկնաբանությունները, մինչև չես իրականացրել համապատասխան մեթոդը։

## Առաջարկվող հերթականություն

| Քայլ | Թեմա | Ինչու այս հերթականությամբ |
|------|------|---------------------------|
| 1 | `classes` — Դասեր (Classes) | Սկսի՛ր դասերից. դրանք բոլոր հաջորդ թեմաների հիմքն են |
| 2 | `strings` — Տողեր (Strings) | Հղում և բովանդակություն (== և equals). կարևոր է հաջորդ թեմաների համար |
| 3 | `encapsulation` — Ինկապսուլյացիա (Encapsulation) | private վիճակ և ստուգված գործողություններ |
| 4 | `equality` — Հավասարություն (Equality) | Տողերից հետո equals/hashCode ըստ id-ի |
| 5 | `collections` — Հավաքածուներ (Collections) | Set և Map-ը օգտագործում են equals/hashCode-ը |
| 6 | `interfaces` — Ինտերֆեյսներ (Interfaces) | Պայմանագիր և աշխատանք ինտերֆեյսի հղումով |
| 7 | `inheritance` — Ժառանգում (Inheritance) | Բազային դաս և ենթադասեր, կոնստրուկտորների շղթա |
| 8 | `polymorphism` — Պոլիմորֆիզմ (Polymorphism) | Ժառանգումից հետո. նույն հղումը՝ տարբեր վարք |
| 9 | `copying` — Պատճենում (Copying) | Հղումներ, փոփոխելի օբյեկտներ, խոր պատճեն |
| 10 | `relationships` — Կապեր (Relationships) | Ամփոփում. ագրեգացիա և կոմպոզիցիա (սեփականություն) |

Ստորև թեմաները նկարագրված են հենց այս հերթականությամբ (բաժին 1 = քայլ 1 և այլն)։

---

## 1. Դասեր (Classes), package `exercises.classes`

**Թղթապանակ՝** `src/exercises/classes/`
**Ֆայլեր՝** Pen.java (օրինակ), Book.java, BookActions.java
**Գործարկել՝** `exercises.classes.ClassesDemo` (օրինակներ) և `exercises.classes.ClassesChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `CLS-1` | `Book.java — Book(title, author, pages)` | Վերագրիր դաշտերը (this) և ավելացրու createdCount-ը 1-ով | new Book("Java","Gosling",400).getTitle() -> "Java"; ամեն new-ից հետո Book.getCreatedCount() +1 |
| `CLS-2` | `Book.java — isLong()` | true, երբ pages >= LONG_BOOK_PAGES (300) | 300 -> true, 299 -> false |
| `CLS-3` | `Book.java — toString()` | Ֆորմատ՝ Title by Author (N pages) | "Java by Gosling (400 pages)" |
| `CLS-4` | `BookActions.java — rename(book, newTitle)` | Փոխիր ՏՐՎԱԾ գրքի վերնագիրը և վերադարձրու ՆՈՒՅՆ օբյեկտը (առանց new Book) | original.getTitle() = newTitle; վերադարձվածը == original |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ է Pen.getCreated() / Book.getCreatedCount() static, իսկ getTitle()-ը՝ ոչ։
2. Երբ գրում ես `Pen alias = first;`, քանի՞ Pen օբյեկտ կա հիշողության մեջ։ Ինչու՞։
3. Ինչու՞ BookActions.rename-ը փոխում է original գիրքը, թեև մենք այն չենք վերագրում։

---

## 2. Տողեր (Strings), package `exercises.strings`

**Թղթապանակ՝** `src/exercises/strings/`
**Ֆայլեր՝** StringsReference.java (օրինակ), StringsPredict.java, NullSafeComparison.java, TextProcessing.java, InternPool.java
**Գործարկել՝** `exercises.strings.StringsDemo` (օրինակներ) և `exercises.strings.StringsChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `STR-P1 … STR-P5` | `StringsPredict.java — PREDICTION_1 … PREDICTION_5` | ՄԻՆՉԵՎ գործարկելը գրիր "true" կամ "false" ամեն հատվածի համար | StringsDemo-ն ցույց է տալիս՝ ճիշտ գուշակեցի՞ր (սա checks-ով չի ստուգվում) |
| `STR-1` | `NullSafeComparison.java — safeEquals(a, b)` | null-անվտանգ equals | (null,null) -> true; ("a",null) -> false; ("Java","java") -> false |
| `STR-2` | `TextProcessing.java — isPalindrome(word)` | Մեկ բառ. մեծատառ/փոքրատառը անտեսվում է | "Level" -> true; "Java" -> false |
| `STR-3` | `TextProcessing.java — countVowels(text)` | Ձայնավորների (a, e, i, o, u) քանակը, մեծատառ/փոքրատառը նշանակություն չունի | "Hello World" -> 3; "xyz" -> 0 |
| `STR-4` | `InternPool.java — canonical(text)` | Վերադարձրու String pool-ի օրինակը (intern) | canonical(new String("java")) == "java" -> true |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ է `new String("java") == "java"` false, իսկ `"java" == "java"` true։
2. Ինչու՞ է `(p + "va") == "java"` false, իսկ `(p + "va").intern() == "java"` true։
3. Ինչու՞ տեքստը պետք է համեմատել equals()-ով, ոչ թե ==։

---

## 3. Ինկապսուլյացիա (Encapsulation), package `exercises.encapsulation`

**Թղթապանակ՝** `src/exercises/encapsulation/`
**Ֆայլեր՝** Thermostat.java (օրինակ), BankAccount.java, AccountTools.java
**Գործարկել՝** `exercises.encapsulation.EncapsulationDemo` (օրինակներ) և `exercises.encapsulation.EncapsulationChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `ENC-1` | `BankAccount.java — deposit(amountCents)` | amount <= 0 -> IllegalArgumentException (մնացորդը չի փոխվում), այլապես ավելացրու | 1000 + deposit(250) -> 1250 |
| `ENC-2` | `BankAccount.java — withdraw(amountCents)` | amount <= 0 -> IllegalArgumentException; amount > մնացորդ -> IllegalStateException; սխալի դեպքում մնացորդը չի փոխվում | 1000 - withdraw(300) -> 700; withdraw(1001) -> IllegalStateException |
| `ENC-3` | `AccountTools.java — transfer(from, to, amountCents)` | from.withdraw(...), հետո to.deposit(...). սխալի դեպքում երկու հաշիվները չեն փոխվում | from=1000, to=50, transfer 400 -> 600 / 450 |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ են դաշտերը private։ Ի՞նչ կարող էր պատահել, եթե balanceCents-ը public լիներ։
2. Ինչու՞ են գումարները long լումաներով, ոչ թե double։ Փորձիր `0.1 + 0.2` Java-ում։
3. Ինչու՞ transfer-ում withdraw-ը կանչվում է deposit-ից ՆԱԽ։

---

## 4. Հավասարություն (Equality), package `exercises.equality`

**Թղթապանակ՝** `src/exercises/equality/`
**Ֆայլեր՝** Point.java (օրինակ), Product.java, ProductCatalog.java
**Գործարկել՝** `exercises.equality.EqualityDemo` (օրինակներ) և `exercises.equality.EqualityChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `EQL-1` | `Product.java — equals(Object)` | Հավասարությունը՝ ՄԻԱՅՆ id-ով (նույն օբյեկտ -> true; null/այլ դաս -> false) | ("p1","Tea") equals ("p1","Coffee") -> true; այլ id -> false |
| `EQL-2` | `Product.java — hashCode()` | Համաձայն equals-ի. օգտագործիր միայն id-ն | նույն id -> նույն hashCode |
| `EQL-3` | `ProductCatalog.java — countDistinct(products)` | Տարբեր id-ների քանակը (HashSet) | [p1,p2,p1,p3,p3] -> 3 |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ equals()-ը գրելիս պարտադիր է գրել նաև hashCode()-ը։ Ի՞նչ կլիներ HashSet-ում առանց hashCode()-ի։
2. Ինչու՞ է Product-ի id-ն final, և ինչու՞ name/price-ը չեն մասնակցում equals()-ին։
3. Ի՞նչ կարող է պատահել, եթե HashSet-ում գտնվող օբյեկտի այն դաշտը, որից հաշվվում է hashCode-ը, փոխվի։

---

## 5. Հավաքածուներ (Collections), package `exercises.collections`

**Թղթապանակ՝** `src/exercises/collections/`
**Ֆայլեր՝** CollectionsReference.java (օրինակ), ListFilter.java, DuplicateRemoval.java, WordFrequency.java
**Գործարկել՝** `exercises.collections.CollectionsDemo` (օրինակներ) և `exercises.collections.CollectionsChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `COL-1` | `ListFilter.java — longWords(words, minLength)` | Բառեր՝ երկարությունը >= minLength; հերթականությունը պահպանվում է; null տարրերը բաց են թողնվում; մուտքը չի փոխվում | [a, abc, null, hello], 3 -> [abc, hello] |
| `COL-2` | `DuplicateRemoval.java — removeDuplicates(items)` | Հեռացրու կրկնությունները՝ առաջին հանդիպման հերթականությամբ (LinkedHashSet); null տարրերը բաց թող | [b, a, b, null, c, a] -> [b, a, c] |
| `COL-3` | `WordFrequency.java — countWords(words)` | Բառերի հաճախականություն՝ առաջին հանդիպման հերթականությամբ (LinkedHashMap); մեծատառ/փոքրատառը տարբեր է | [the, cat, the, dog, the, cat] -> {the=3, cat=2, dog=1} |

**Հարցեր (պատասխանիր գրավոր).**

1. Ո՞ր Set-ը պահպանում է ավելացման հերթականությունը, ո՞րը՝ տեսակավորում, ո՞րը չի երաշխավորում ոչինչ։
2. Ինչու՞ ենք մուտքի ցուցակը չփոխում և վերադարձնում նոր ցուցակ։
3. Ի՞նչ կփոխվեր քո COL-3 արդյունքում, եթե LinkedHashMap-ի փոխարեն օգտագործեիր HashMap։

---

## 6. Ինտերֆեյսներ (Interfaces), package `exercises.interfaces`

**Թղթապանակ՝** `src/exercises/interfaces/`
**Ֆայլեր՝** Shape.java, Square.java (օրինակ), Rectangle.java, Circle.java, ShapeCalculator.java
**Գործարկել՝** `exercises.interfaces.InterfacesDemo` (օրինակներ) և `exercises.interfaces.InterfacesChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `INT-1` | `Rectangle.java — area()` | width * height | 3x4 -> 12.0 |
| `INT-2` | `Circle.java — area()` | Math.PI * radius * radius | r=1 -> 3.141592653589793 |
| `INT-3` | `ShapeCalculator.java — totalArea(shapes)` | Մակերեսների գումարը՝ ՄԻԱՅՆ Shape հղումներով (առանց instanceof/cast) | [Square(2), Rectangle(3,4)] -> 16.0; [] -> 0.0 |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ է փոփոխականի տիպը Shape, թեև օբյեկտը Square է։ Ի՞նչ առավելություն է տալիս դա։
2. Ի՞նչ կլիներ, եթե ShapeCalculator-ը օգտագործեր instanceof Rectangle / instanceof Circle։ Ի՞նչ տեղի կունենար նոր Triangle ավելացնելիս։
3. Ինչո՞վ է default մեթոդը (describe) տարբերվում սովորական աբստրակտ մեթոդից։

---

## 7. Ժառանգում (Inheritance), package `exercises.inheritance`

**Թղթապանակ՝** `src/exercises/inheritance/`
**Ֆայլեր՝** Vehicle.java (բազային), Car.java (օրինակ), Truck.java, Motorcycle.java
**Գործարկել՝** `exercises.inheritance.InheritanceDemo` (օրինակներ) և `exercises.inheritance.InheritanceChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `INH-1` | `Truck.java — Truck(brand, year, cargoCapacityKg)` | Կանչիր super(brand, year) առաջին տողում (փոխարինիր փոխարինող "TODO", 0-ն); վերագրիր cargoCapacityKg-ը | new Truck("Volvo",2018,5000).getBrand() -> "Volvo" |
| `INH-2` | `Truck.java — describe()` | super.describe() + ", cargo: N kg" | "Volvo (2018), cargo: 5000 kg" |
| `INH-3` | `Motorcycle.java — Motorcycle(brand, year, hasSidecar)` | super(brand, year) + վերագրիր hasSidecar-ը | new Motorcycle("Ural",1980,true).hasSidecar() -> true |
| `INH-4` | `Motorcycle.java — describe()` | super.describe() + ", with sidecar" կամ ", no sidecar" | "Honda (2020), no sidecar" |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ է Truck-ի կոնստրուկտորը պարտավոր կանչել super(brand, year)։
2. Ո՞ր մեթոդները Truck-ը ժառանգում է Vehicle-ից (օր.՝ getAge) և ո՞րն է միայն Truck-ինը (getCargoCapacityKg)։
3. Ինչու՞ է describe()-ում ավելի լավ կանչել super.describe(), քան նորից գրել brand + year-ը։

---

## 8. Պոլիմորֆիզմ (Polymorphism), package `exercises.polymorphism`

**Թղթապանակ՝** `src/exercises/polymorphism/`
**Ֆայլեր՝** Animal.java (բազային), Dog.java (օրինակ), Cat.java, Duck.java, Zoo.java, PolymorphismPredict.java (օրինակ)
**Գործարկել՝** `exercises.polymorphism.PolymorphismDemo` (օրինակներ) և `exercises.polymorphism.PolymorphismChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `POL-1` | `Cat.java — sound()` | Վերադարձրու "Meow" | new Cat("Tom").describe() -> "Tom says Meow" (describe-ը գրել պետք չէ) |
| `POL-2` | `Duck.java — sound()` | Վերադարձրու "Quack" | new Duck("Don").describe() -> "Don says Quack" |
| `POL-3` | `Zoo.java — chorus(animals)` | Ձայները՝ ", " բաժանարարով, ցուցակի հերթականությամբ; առանց instanceof | [Dog, Cat, Duck] -> "Woof, Meow, Quack"; [] -> "" |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ է `Animal pet = new Dog("Rex"); pet.sound()` վերադարձնում "Woof", թեև pet-ի տիպը Animal է։
2. PolymorphismDemo-ում ինչու՞ է feed(a)-ն կանչում feed(Animal)-ը, թեև a-ն իրականում Dog է։ Ինչո՞վ է overload-ը տարբերվում override-ից։
3. Ինչու՞ Cat-ում describe()-ը գրել պետք չէ, բայց արդյունքը ճիշտ է։

---

## 9. Պատճենում (Copying), package `exercises.copying`

**Թղթապանակ՝** `src/exercises/copying/`
**Ֆայլեր՝** City.java, Person.java (shallowCopy՝ օրինակ), CopyTools.java
**Գործարկել՝** `exercises.copying.CopyingDemo` (օրինակներ) և `exercises.copying.CopyingChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `CPY-1` | `City.java — copy()` | Վերադարձրու նույն արժեքներով ՆՈՐ City | copy != city; copy-ի փոփոխությունը չի ազդում city-ի վրա |
| `CPY-2` | `Person.java — deepCopy()` | Նոր Person ՆՈՐ City-ով (օգտագործիր city.copy()) | copy.getCity() != original.getCity() |
| `CPY-3` | `CopyTools.java — copyIsIndependent(original)` | deepCopy արա, փոխիր պատճենի քաղաքը, վերադարձրու true, եթե original-ի քաղաքը անփոփոխ է | true ճիշտ deepCopy-ի դեպքում |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ shallowCopy()-ից հետո քաղաքի անունը փոխվեց օրիգինալում։ (Տես CopyingDemo)
2. Ինչու՞ String name-ի համար խոր պատճեն պետք չէ։
3. Ինչու՞ է ցանկացած դաշտ, որը ՓՈՓՈԽԵԼԻ օբյեկտ է, պատճենելիս ուշադրություն պահանջում։

---

## 10. Կապեր (Relationships), package `exercises.relationships`

**Թղթապանակ՝** `src/exercises/relationships/`
**Ֆայլեր՝** OwnershipReference.java (Garage/Car և House/Room՝ օրինակ), Player.java, Team.java, OrderLine.java, Order.java
**Գործարկել՝** `exercises.relationships.RelationshipsDemo` (օրինակներ) և `exercises.relationships.RelationshipsChecks` (ստուգումներ)

| TODO | Ֆայլ և մեթոդ | Պահանջ | Սպասվող արդյունք |
|------|--------------|--------|------------------|
| `REL-1` | `Team.java — addPlayer(player)` | Ավելացրու Player-ին players ցուցակին (պահվում է նույն օբյեկտը) | team.addPlayer(ani) -> getPlayers().size() = 1 |
| `REL-2` | `Team.java — removePlayer(player)` | true, եթե թիմում էր և հեռացվեց, այլապես false. Player-ը շարունակում է ապրել | երկրորդ հեռացումը -> false |
| `REL-3` | `Order.java — addLine(product, quantity, unitPriceCents)` | Ստեղծիր new OrderLine(...) Order-ի ՆԵՐՍՈՒՄ և ավելացրու lines ցուցակին | addLine("Tea", 2, 500) -> getLines().size() = 1 |
| `REL-4` | `Order.java — totalCents()` | Բոլոր տողերի totalCents()-ների գումարը | Tea 2x500 + Milk 1x300 -> 1300 |

**Հարցեր (պատասխանիր գրավոր).**

1. Ինչու՞ Player-ը ստեղծվում է Team-ից դուրս, իսկ OrderLine-ը՝ Order-ի ներսում։ Ո՞վ է «տերը» յուրաքանչյուր դեպքում։
2. Ինչու՞ OrderLine-ի կոնստրուկտորը package-private է, և ինչու՞ getLines()-ը անփոփոխ տեսք է վերադարձնում։
3. Երբ Order օբյեկտը դառնում է անհասանելի, ի՞նչ է կատարվում նրա OrderLine-ների հետ Java-ում։ Արդյո՞ք Java-ն ինքնաբերաբար «ոչնչացնում» է դրանք։ (Հուշում՝ աղբահավաք)

---

## Ամփոփում ստուգելու համար

Բոլոր թեմաները միասին (տեսնել ամփոփ աղյուսակը).

```bash
java -Dstdout.encoding=UTF-8 -cp out exercises.AllChecks
```

Ավարտելուց հետո բոլոր TODO տողերը պետք է լինեն `[PASS]`։ Դեռ չարված TODO-ները `[TODO]` են և սխալ չեն համարվում։
