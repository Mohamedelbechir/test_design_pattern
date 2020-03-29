package pattern_commande;

import pattern_commande.commande.*;
import pattern_commande.recepteur.*;

/**
 * TesterTeleCommande
 */
public class TesterTeleCommande {

    public static void main(String[] args) {
        TeleCommandeSimple teleCommandeSimple = new TeleCommandeSimple();
        Lampe lampe = new Lampe("");
        /* ici nous créons une commande et la transmettre au recepteur */
        CommandeAllumerLampe commandeAllumerLampe = new CommandeAllumerLampe(lampe);
        /* là nous transmettons la commande à l'invocateur */
        teleCommandeSimple.setCommande(commandeAllumerLampe);
        teleCommandeSimple.buttonPresse(); // simuler l'appu sur le button ; lampe alluer

        PorteGarage porteGarage = new PorteGarage("");
        CommandeOuvrirPorteGarage garaOuvert = new CommandeOuvrirPorteGarage(porteGarage);
        teleCommandeSimple.setCommande(garaOuvert);
        teleCommandeSimple.buttonPresse(); // simuler l'appu sur le button ; lampe alluer

    }
}