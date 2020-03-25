package patter_decorateur;

/**
 * Chantilly
 */
public class Chantilly extends DecorateurIngredient {
    Boisson boisson;

    public Chantilly(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    protected String getDescription() {
        return boisson.getDescription() + ", chantilly";
    }

    @Override
    public double cout() {
        return .10 + boisson.cout();
    }

}