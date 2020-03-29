package pattern_commande;

import pattern_commande.commande.CommandeAllumerJacuzzi;
import pattern_commande.commande.CommandeAllumerLampe;
import pattern_commande.commande.CommandeAllumerStereo;
import pattern_commande.commande.CommandeAllumerTV;
import pattern_commande.commande.CommandeEteindreJacuzzi;
import pattern_commande.commande.CommandeEteindreLampe;
import pattern_commande.commande.CommandeEteindreStereo;
import pattern_commande.commande.CommandeEteindreTV;
import pattern_commande.commande.MacroCommande;
import pattern_commande.interface_to_implement.Commande;
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
        TeleCommande teleCommande = new TeleCommande();

        CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
        CommandeEteindreLampe lampeEteinte = new CommandeEteindreLampe(lampe);

        CommandeAllumerStereo stereoAllumee = new CommandeAllumerStereo(stereo);
        CommandeEteindreStereo stereoEteinte = new CommandeEteindreStereo(stereo);

        CommandeAllumerTV tvAllumee = new CommandeAllumerTV(tv);
        CommandeEteindreTV tvEteinte = new CommandeEteindreTV(tv);

        CommandeAllumerJacuzzi jacuzziAllume = new CommandeAllumerJacuzzi(jacuzzi);
        CommandeEteindreJacuzzi jacuzziEteint = new CommandeEteindreJacuzzi(jacuzzi);

        Commande[] allumageGroupe = { lampeAllumee, stereoAllumee, tvAllumee, jacuzziAllume };
        Commande[] extinctionGroupe = { lampeEteinte, stereoEteinte, tvEteinte, jacuzziEteint };

        MacroCommande macroAllumageGroupe = new MacroCommande(allumageGroupe);
        MacroCommande macroExtinctionGroupe = new MacroCommande(extinctionGroupe);

        teleCommande.setCommande(0, macroAllumageGroupe, macroExtinctionGroupe);
        System.out.println(teleCommande);
        System.out.println("---Exécution de Macro Marche ---");
        teleCommande.boutonMarchePresse(0);
        System.out.println("--- Exécution de Macro Arret ---");
        teleCommande.boutonArretPresse(0);
    }
}