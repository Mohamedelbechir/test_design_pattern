package pattern_strategie.client;

import pattern_strategie.comportement_cancanement.Cancan;
import pattern_strategie.comportement_de_vol.NePasVoler;

/**
 * ProtoTypeCanard
 */
public class ProtoTypeCanard extends Canard {
    public ProtoTypeCanard() {
        this.comportementCanca = new Cancan();
        this.comportementVol = new NePasVoler();
    }

    @Override
    public void afficher() {
        System.out.println("je suis un prototype de canard");

    }

}