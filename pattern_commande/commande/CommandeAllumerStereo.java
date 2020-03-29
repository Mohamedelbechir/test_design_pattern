package pattern_commande.commande;

import pattern_commande.interface_to_implement.Commande;
import pattern_commande.recepteur.Stereo;

public class CommandeAllumerStereo implements Commande{
private Stereo stereo;
    public CommandeAllumerStereo(Stereo stereo) {
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
