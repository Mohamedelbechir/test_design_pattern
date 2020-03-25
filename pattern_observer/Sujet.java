package pattern_observer;

/**
 * Sujet
 */
public interface Sujet {

    void enregisterObservateur(Observateur observateur);

    void supprimerObservateur(Observateur observateur);

    /*
     * Cette methode sera appelée pour notifier toues les observateurs que l'état du
     * sujet à changer
     */
    void notifierObservateurs();
}