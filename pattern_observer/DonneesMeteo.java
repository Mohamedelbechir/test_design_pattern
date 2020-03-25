package pattern_observer;

import java.util.ArrayList;


/**
 * DonneesMetheo
 */

public class DonneesMeteo implements Sujet {

    private ArrayList<Observateur> observateurs;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {
        observateurs = new ArrayList<Observateur>();

    }

    @Override
    public void enregisterObservateur(Observateur observateur) {
        this.observateurs.add(observateur);

    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        this.observateurs.remove(observateur);

    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.update(temperature, humidite, pression);
        }
    }

    public void actualiserMesures() {
        this.notifierObservateurs();
    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        actualiserMesures();
    }
}