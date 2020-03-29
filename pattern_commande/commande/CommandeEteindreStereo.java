package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Stereo;

public class CommandeEteindreStereo  implements Commande{
    Stereo stereo;

    public CommandeEteindreStereo(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void annuler() {
        // TODO Auto-generated method stub

    }
}
