package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;

/**
 * MacroCommande
 */
public class MacroCommande implements Commande {

    Commande[] commandes;

    public MacroCommande(Commande[] commandes) {
        this.commandes = commandes;
    }

    public void executer() {
        for (int i = 0; i < commandes.length; i++) {
            commandes[i].executer();
        }
    }

    @Override
    public void annuler() {
        for (Commande commande : commandes) {
            commande.annuler();
        }

    }
}