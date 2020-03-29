package pattern_commande;

import pattern_commande.interface_to_implement.Commande;

/**
 * TeleCommandeSimple
 */
public class TeleCommandeSimple {

    Commande emplacement;

    public TeleCommandeSimple() {
        super();
    }

    public void setCommande(Commande commande) {
        this.emplacement = commande;
    }

    public void buttonPresse() {
        emplacement.executer();
    }
}