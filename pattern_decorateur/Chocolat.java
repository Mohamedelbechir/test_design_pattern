package pattern_decorateur;

/**
 * Chocolat
 */
public class Chocolat extends DecorateurIngredient {
    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;

    }

    @Override
    protected String getDescription() {
        return boisson.getDescription() + ", chocolat";
    }

    @Override
    public double cout() {
        return .20 + boisson.cout();
    }

}