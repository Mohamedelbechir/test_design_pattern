package pattern_adapteur;

/**
 * AdapteurCanard
 */
public class AdapteurCanard implements Dindon {
    Canard canard;

    public AdapteurCanard(Canard canard) {
        this.canard = canard;
    }

    @Override
    public void glouglouter() {
        this.canard.cancaner();

    }

    @Override
    public void voler() {
       this.canard.voler();

    }

}