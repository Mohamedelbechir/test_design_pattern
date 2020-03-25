package pattern_decorateur;

/**
 * Deca
 */
public class Deca extends Boisson {
    public Deca(String taille) {
        this.description = "Deca";
        this.taille = taille;
    }

    @Override
    public double cout() {

        return 1.05;
    }

}