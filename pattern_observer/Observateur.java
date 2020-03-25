package pattern_observer;

/**
 * Observateur
 */
public interface Observateur {

    public void update(float temperature, float humidite, float pression);
}