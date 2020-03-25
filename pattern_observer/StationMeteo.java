package pattern_observer;

import javax.swing.JButton;

/**
 * Le pattern Observateur définit une relation entre objets de type
 * un-à-plusieurs, de façon que, lorsque un objet change d’état, tous ceux qui
 * en dépendent en soient notifiés et soient mis à jour automatiquement.
 * 
 */
/**
 * StationMeteo
 */
public class StationMeteo {
    public static void main(String... args) {
        DonneesMeteo donneesMeteo = new DonneesMeteo();
        AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);
        

    }
}