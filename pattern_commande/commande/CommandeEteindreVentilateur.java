package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Ventilateur;

public class CommandeEteindreVentilateur implements Commande {
    Ventilateur ventillateur;

    public CommandeEteindreVentilateur(Ventilateur ventilateur) {
        this.ventillateur = ventilateur;
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
