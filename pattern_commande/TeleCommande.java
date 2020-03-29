package pattern_commande;

import pattern_commande.commande.PasDeCommande;
import pattern_commande.interface_to_implement.Commande;

/**
 * TeleCommande
 */
public class TeleCommande {

    Commande[] commandesMarche;
    Commande[] commandesArret;
    Commande commandeAnnulation;

    public TeleCommande() {
        commandesMarche = new Commande[7];
        commandesArret = new Commande[7];
        final Commande pasDeCommande = new PasDeCommande();
        for (int i = 0; i < 7; i++) {
            commandesMarche[i] = pasDeCommande;
            commandesArret[i] = pasDeCommande;
        }
        commandeAnnulation = pasDeCommande;
    }

    public void setCommande(final int emplacement, final Commande comMarche, final Commande comArret) {
        this.commandesMarche[emplacement] = comMarche;
        this.commandesArret[emplacement] = comArret;
    }

    public void buttonMarchePresse(final int emplacement) {
        this.commandesMarche[emplacement].executer();
        commandeAnnulation = this.commandesMarche[emplacement];

    }

    public void buttonArretPresse(final int emplacement) {
        this.commandesArret[emplacement].executer();
        commandeAnnulation = this.commandesArret[emplacement];
    }

    public void buttonAnnulPresse() {
        this.commandeAnnulation.executer();

    }

    @Override
    public String toString() {
        final StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Télécommande -------\n");
        for (int i = 0; i < commandesMarche.length; i++) {
            stringBuff.append("[empt " + i + "] " + commandesMarche[i].getClass().getName() + " "
                    + commandesArret[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}