package pattern_patron_de_methode;

/**
 * The
 */
public class The extends BoisonCafeinee {

    @Override
    void preparer() {
        System.out.println("Infusion du thé");

    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajout du citron");

    }

}