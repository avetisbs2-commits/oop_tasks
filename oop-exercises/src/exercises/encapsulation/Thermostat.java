package exercises.encapsulation;

/**
 * ԱՎԱՐՏՎԱԾ ՕՐԻՆԱԿ (ուսանողը չի փոխում)։ Ինկապսուլյացիայի հիմնական ձևը.
 *
 *   1. Դաշտը private է. դրսից ուղղակի փոխել չի լինում։
 *   2. Փոփոխությունը հնարավոր է միայն մեթոդի միջոցով, որը ստուգում է կանոնը։
 *   3. Սխալ արժեքի դեպքում օբյեկտի վիճակը ՉԻ ՓՈՓՈԽՎՈՒՄ, և նետվում է բացառություն։
 */
public final class Thermostat {
    public static final int MIN_TEMPERATURE = 10;
    public static final int MAX_TEMPERATURE = 30;

    private int targetTemperature;

    public Thermostat(int targetTemperature) {
        setTargetTemperature(targetTemperature);
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(int targetTemperature) {
        if (targetTemperature < MIN_TEMPERATURE || targetTemperature > MAX_TEMPERATURE) {
            throw new IllegalArgumentException(
                    "temperature must be between " + MIN_TEMPERATURE + " and " + MAX_TEMPERATURE);
        }
        this.targetTemperature = targetTemperature;
    }
}
