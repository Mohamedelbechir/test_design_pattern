package pattern_patron_de_methode;

/**
 * BoisonCafeinee
 */
public abstract class BoisonCafeinee {

    // Patron de methode
    final public void suivreRecette() {
        faireBouillirEau();
        preparer();
        verserDansTasse();
        if (clientVeutSupplements()) {
            ajouterSupplements();
        }

    }

    /* Les methodes primitives abstraites */
    abstract void preparer();

    abstract void ajouterSupplements();

    public void faireBouillirEau() {
        System.out.println("Portage de l’eau à ébullition");
    }

    public void verserDansTasse() {
        System.out.println("Remplissage de la tasse");
    }

    /*
     * Ici nous avons une méthode adapteur : les sous classes peuvent le redfinier
     */
    boolean clientVeutSupplements() {
        return true;
    }

}