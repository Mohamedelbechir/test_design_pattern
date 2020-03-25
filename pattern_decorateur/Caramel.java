package patter_decorateur;

/**
 * Caramel
 */
public class Caramel extends DecorateurIngredient {
    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    protected String getDescription() {

        return boisson.getDescription() + ", caramel";
    }

    @Override
    public double cout() {

        double cout = boisson.cout();
        if (getTaille() == Boisson.NORMAL) {
            cout += .10;
        } else if (getTaille() == Boisson.GRANDE) {
            cout += .15;
        } else if (getTaille() == Boisson.VENTI) {
            cout += .20;
        }
        return cout;
    }

}