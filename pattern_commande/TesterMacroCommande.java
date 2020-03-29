package pattern_commande;

import pattern_commande.commande.CommandeAllumerJacuzzi;
import pattern_commande.commande.CommandeAllumerLampe;
import pattern_commande.commande.CommandeAllumerStereo;
import pattern_commande.commande.CommandeAllumerTV;
import pattern_commande.commande.CommandeEteindreJacuzzi;
import pattern_commande.commande.CommandeEteindreLampe;
import pattern_commande.commande.CommandeEteindreStereo;
import pattern_commande.commande.CommandeEteindreTV;
import pattern_commande.recepteur.Jacuzzi;
import pattern_commande.recepteur.Lampe;
import pattern_commande.recepteur.Stereo;
import pattern_commande.recepteur.TV;

/**
 * TesterMacroCommande
 */
public class TesterMacroCommande {

    public static void main(String[] args) {
        Lampe lampe = new Lampe("Séjour");
        TV tv = new TV("Séjour");
        Stereo stereo = new Stereo("Séjour");
        Jacuzzi jacuzzi = new Jacuzzi();
        
        CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
        CommandeEteindreLampe lampeEteinte = new CommandeEteindreLampe(lampe);

        CommandeAllumerStereo stereoAllumee = new CommandeAllumerStereo(stereo);
        CommandeEteindreStereo stereoEteinte = new CommandeEteindreStereo(stereo);

        CommandeAllumerTV tvAllumee = new CommandeAllumerTV(tv);
        CommandeEteindreTV tvEteinte = new CommandeEteindreTV(tv);

        CommandeAllumerJacuzzi jacuzziAllume = new CommandeAllumerJacuzzi(jacuzzi);
        CommandeEteindreJacuzzi jacuzziEteint = new CommandeEteindreJacuzzi(jacuzzi);
    }
}