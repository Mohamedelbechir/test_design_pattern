package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Jacuzzi;

public class CommandeEteindreJacuzzi implements Commande {
    private Jacuzzi jacuzzi;

    public CommandeEteindreJacuzzi(Jacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
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
