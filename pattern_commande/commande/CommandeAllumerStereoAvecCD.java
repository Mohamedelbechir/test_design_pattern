package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Stereo;

/**
 * CommandeAllumerStereoAvecCD
 */
public class CommandeAllumerStereoAvecCD implements Commande {
    Stereo stereo;

    public CommandeAllumerStereoAvecCD(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executer() {
        this.stereo.marche();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }

    @Override
    public void annuler() {
        this.stereo.arret();
        this.stereo.setCD();
        this.stereo.setVolume(0);

    }

}