package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Ventilateur;

/**
 * CommandeVentilateurRapide
 */
public class CommandeVentilateurRapide implements Commande {

    Ventilateur ventilateur;
    int derniereVitesse;

    public CommandeVentilateurRapide(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }

    public void executer() {
        derniereVitesse = ventilateur.getVitesse();
        ventilateur.rapide();
    }

    public void annuler() {
        if (derniereVitesse == Ventilateur.RAPIDE) {
            ventilateur.rapide();
        } else if (derniereVitesse == Ventilateur.MOYEN) {
            ventilateur.moyen();
        } else if (derniereVitesse == Ventilateur.LENT) {
            ventilateur.lent();
        } else if (derniereVitesse == Ventilateur.ARRET) {
            ventilateur.arret();

        }
    }
}