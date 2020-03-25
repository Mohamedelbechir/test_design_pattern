package patter_decorateur;

/**
 * Boisson
 */
public abstract class Boisson {

    protected String description = "Boisson inconnu";
    protected String taille;

    static final String NORMAL = "_NORMAL_";
    static final String GRANDE = "_GRAND_";
    static final String VENTI = "_VENTI_";

    /**
     * @return the description
     */
    protected String getDescription() {
        return description;
    }
    /**
     * @return the taille
     */
    public String getTaille() {
        return taille;
    }

    public abstract double cout();
}