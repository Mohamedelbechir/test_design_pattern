package pattern_strategie;

import pattern_strategie.client.Canard;
import pattern_strategie.client.Colvert;
import pattern_strategie.client.ProtoTypeCanard;
import pattern_strategie.comportement_de_vol.PropulsionAReaction;

/**
 * MiniSimulateur : 
 */
public class MiniSimulateur {

    public static void main(String... args) {
        Canard colvert = new Colvert();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        Canard proto = new ProtoTypeCanard();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();

    }
}