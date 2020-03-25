package pattern_decorateur;

/**
 * Lait
 */
public class Lait extends DecorateurIngredient {
    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    protected String getDescription() {
        return boisson.getDescription() + ", lait";
    }

    @Override
    public double cout() {
        return .1 + boisson.cout();
    }

}