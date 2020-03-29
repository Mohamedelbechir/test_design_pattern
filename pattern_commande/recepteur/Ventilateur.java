package pattern_commande.recepteur;

public class Ventilateur {

    public static final int RAPIDE = 3;
    public static final int MOYEN = 2;
    public static final int LENT = 1;
    public static final int ARRET = 0;
    private int vitesse;
    private String localisation;

    public Ventilateur(String localisation) {
        this.localisation = localisation;
        vitesse = ARRET;
    }

    public void rapide() {
        vitesse = RAPIDE;
        // code pour régler la vitesse sur rapide
    }

    public void moyen() {
        vitesse = MOYEN;
        // code pour régler la vitesse sur moyen
    }

    public void lent() {
        vitesse = LENT;
        // code pour régler la vitesse sur lent
    }

    public void arret() {
        vitesse = ARRET;
        // code pour arrêter le ventilateur
    }

    public int getVitesse() {
        return vitesse;
    }

    @Override
    public String toString() {
        return "Ventillateur: " + localisation;
    }
}
