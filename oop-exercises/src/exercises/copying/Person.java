package exercises.copying;

/**
 * Person ունի անուն (String. անփոփոխ) և քաղաք (City. ՓՈՓՈԽԵԼԻ օբյեկտ)։
 *
 * shallowCopy() ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ է (ուսանողը չի փոխում). ՄԱԿԵՐԵՎՈՒՅԹԱՅԻՆ պատճեն։
 * Ստեղծվում է նոր Person, բայց city դաշտը ցույց է տալիս ՆՈՒՅՆ City օբյեկտին։ Հետևանք.
 * copy.getCity().setName("X") փոխում է նաև օրիգինալի քաղաքը (name-ը String է, այն անփոփոխ է)։
 */
public class Person {
    private String name;
    private City city;

    public Person(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public Person shallowCopy() {
        return new Person(name, city);
    }

    /**
     * TODO CPY-2. ԽՈՐ (deep) պատճեն. նոր Person ՆՈՐ City օբյեկտով։
     *
     * Պահանջ. copy.getCity() != this.getCity() (տարբեր օբյեկտներ), բայց արժեքները հավասար են։
     * Copy-ի քաղաքի փոփոխությունը ՉԻ ազդում օրիգինալի վրա, և հակառակը։
     * Հուշում. նայիր shallowCopy()-ին. տարբերությունը մեկ բառ է. city-ի փոխարեն օգտագործիր city.copy()։
     */
    public Person deepCopy() {
        // TODO CPY-2: Իրականացրու և ջնջիր հետևյալ տողը
        throw new UnsupportedOperationException("TODO CPY-2: Person.deepCopy");
    }

    @Override
    public String toString() {
        return name + " from " + city;
    }
}
