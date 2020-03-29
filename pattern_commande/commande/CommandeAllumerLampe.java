package pattern_commande.commande;

import pattern_commande.interface_to_implement.*;
import pattern_commande.recepteur.Lampe;

/**
 * CommandeAllumerLampe
 */
public class CommandeAllumerLampe implements Commande{
    Lampe lampe; // le recepteur

    public CommandeAllumerLampe(Lampe lampe) {
       this.lampe = lampe;
    }
    @Override
    public void executer() {
        lampe.marche();

    }

    @Override
    public void annuler() {
        lampe.arret();

    }

    
}