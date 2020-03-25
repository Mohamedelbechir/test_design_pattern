package pattern_strategie.client;

import pattern_strategie.comportement_cancanement.Cancan;
import pattern_strategie.comportement_de_vol.VolerAvecDesAiles;

/**
 * Colvert
 */
public class Colvert extends Canard {

    public Colvert() {
        this.comportementCanca = new Cancan();
        this.comportementVol = new VolerAvecDesAiles();
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un vrai colvert");

    }

}