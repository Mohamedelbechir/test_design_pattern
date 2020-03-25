package pattern_strategie.client;

import pattern_strategie.comportement_cancanement.ComportementCanca;
import pattern_strategie.comportement_de_vol.ComportementVol;

/**
 * Canard
 */
public abstract class Canard {

    protected ComportementCanca comportementCanca;
    protected ComportementVol comportementVol;

    public Canard() {
    }

    public void effectuerVol() {
        this.comportementVol.voler();
    }

    public void effectuerCancan() {
        this.comportementCanca.cancaner();
    }

    public abstract void afficher();

    public void nager() {
        System.out.println("Tous les cannards flottent même les leurres !");

    }

    public void setComportementCanca(ComportementCanca comportementCanca) {
        this.comportementCanca = comportementCanca;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
}