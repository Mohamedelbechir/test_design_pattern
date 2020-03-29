package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.TV;

/**
 * CommandeEteindreTV
 */
public class CommandeEteindreTV implements Commande {
    private TV tv;

    public CommandeEteindreTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void executer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void annuler() {
        // TODO Auto-generated method stub

    }

}