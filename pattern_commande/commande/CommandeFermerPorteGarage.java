package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.PorteGarage;

public class CommandeFermerPorteGarage implements Commande {
    PorteGarage porteGarage;

    public CommandeFermerPorteGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
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
