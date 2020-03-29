package pattern_commande;

import pattern_commande.recepteur.*;
import pattern_commande.commande.*;

/**
 * ChargeurTeleCommande
 */
public class ChargeurTeleCommande {

    public static void main(String[] args) {

        TeleCommande teleCommande = new TeleCommande();
        Lampe lampeSejour = new Lampe("Séjour");
        Lampe lampeCuisine = new Lampe("Cuisine");
        Ventilateur ventilateur = new Ventilateur("Séjour");
        PorteGarage porteGarage = new PorteGarage("");
        Stereo stereo = new Stereo("Séjour");

        CommandeAllumerLampe lampeSejourAllumee = new CommandeAllumerLampe(lampeSejour);
        CommandeEteindreLampe lampeSejourEteinte = new CommandeEteindreLampe(lampeSejour);
        CommandeAllumerLampe lampeCuisineAllumee = new CommandeAllumerLampe(lampeCuisine);
        CommandeEteindreLampe lampeCuisineEteinte = new CommandeEteindreLampe(lampeCuisine);

        CommandeAllumerVentilateur ventilateurAllume = new CommandeAllumerVentilateur(ventilateur);
        CommandeEteindreVentilateur ventilateurEteint = new CommandeEteindreVentilateur(ventilateur);

        CommandeOuvrirPorteGarage porteGarageOuverte = new CommandeOuvrirPorteGarage(porteGarage);
        CommandeFermerPorteGarage porteGarageFermee = new CommandeFermerPorteGarage(porteGarage);

        CommandeAllumerStereoAvecCD stereoAvecCD = new CommandeAllumerStereoAvecCD(stereo);
        CommandeEteindreStereo stereoEteinte = new CommandeEteindreStereo(stereo);

        teleCommande.setCommande(0, lampeSejourAllumee, lampeSejourEteinte);
        teleCommande.setCommande(1, lampeCuisineAllumee, lampeCuisineEteinte);
        teleCommande.setCommande(2, ventilateurAllume, ventilateurEteint);
        teleCommande.setCommande(3, stereoAvecCD, stereoEteinte);

        System.out.println(teleCommande);
        teleCommande.boutonMarchePresse(0);
        teleCommande.boutonArretPresse(0);
        teleCommande.boutonMarchePresse(1);
        teleCommande.boutonArretPresse(1);
        teleCommande.boutonMarchePresse(2);
        teleCommande.boutonArretPresse(2);
        teleCommande.boutonMarchePresse(3);
        teleCommande.boutonArretPresse(3);
    }
}