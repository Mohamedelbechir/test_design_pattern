package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Ventilateur;

public class CommandeAllumerVentilateur implements Commande {
    private Ventilateur ventilateur;
    private int derniereVitesse;

    public CommandeAllumerVentilateur(Ventilateur ventilateur) {
        this.ventilateur = ventilateur;
    }

    @Override
    public void executer() {
        derniereVitesse = this.ventilateur.getVitesse();
        this.ventilateur.rapide();

    }

    @Override
    public void annuler() {
        this.ventilateur.arret();
        if (derniereVitesse == Ventilateur.RAPIDE) {
            this.ventilateur.rapide();
        } else if (derniereVitesse == Ventilateur.MOYEN) {
            this.ventilateur.moyen();
        } else if (derniereVitesse == Ventilateur.LENT) {
            this.ventilateur.lent();
        } else if (derniereVitesse == Ventilateur.ARRET) {
            this.ventilateur.arret();
        }

    }

}
