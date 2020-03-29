package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.PorteGarage;

/**
 * CommandeOuvrirPorteGarage
 */
public class CommandeOuvrirPorteGarage implements Commande {
    PorteGarage porteGarage;
    public CommandeOuvrirPorteGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }

    @Override
    public void executer() {
        porteGarage.ouvrir();
        porteGarage.lampeAllumer();
        porteGarage.stop();

    }

    @Override
    public void annuler() {
       porteGarage.fermer();
       porteGarage.lampeEteinte();
       porteGarage.stop();

    }

}