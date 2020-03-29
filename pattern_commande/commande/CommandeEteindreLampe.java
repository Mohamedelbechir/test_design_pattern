package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Lampe;

/**
 * CommandeEteindreLampe
 */
public class CommandeEteindreLampe implements Commande {
    Lampe lampe;

    public CommandeEteindreLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void executer() {
       this.lampe.arret();

    }

    @Override
    public void annuler() {
        lampe.marche();

    }

}