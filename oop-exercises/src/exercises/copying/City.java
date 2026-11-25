package exercises.copying;

/**
 * ՓՈՓՈԽԵԼԻ (mutable) դաս. նրա դաշտերը կարելի է փոխել setter-ներով։
 * Հենց դրա համար պատճենելու եղանակը կարևոր է։
 */
public class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * TODO CPY-1. Վերադարձրու այս քաղաքի ՆՈՐ, անկախ պատճենը (նույն name և population)։
     * Հուշում. return new City(name, population);
     * Արդյունքը այլ օբյեկտ է. նրա փոփոխությունը չպետք է ազդի ԱՅՍ քաղաքի վրա։
     * Օրինակ.  City copy = city.copy();  copy.setName("X");  city.getName() -> անփոփոխ
     */
    public City copy() {
        // TODO CPY-1: Իրականացրու և ջնջիր հետևյալ տողը
        return new City(name, population);
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }
}
