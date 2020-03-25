package pattern_observer;

/**
 * AffichagesConditions
 */
public class AffichageConditions implements Affichage, Observateur {
    private float temperature;
    private float humidite;
    private float pression;
    private Sujet donneesMeteo;

    AffichageConditions(Sujet donneesMeteo) {

        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregisterObservateur(this);
    }

    @Override
    public void update(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        this.afficher();
    }

    @Override
    public void afficher() {
        System.out.println("Conditions actuelles : " + this.temperature + "°" + this.humidite + "d'humidité");

    }

}