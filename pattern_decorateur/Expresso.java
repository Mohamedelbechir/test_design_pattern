package pattern_decorateur;

/**
 * Expresso
 */
public class Expresso extends Boisson {
    public Expresso(String taille) {
        this.description = "Expresso";
        this.taille = taille;
    }

    @Override
    public double cout() {
        return 1.99;

    }

}