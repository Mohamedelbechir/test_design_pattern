package pattern_patron_de_methode;

/**
 * Cafe
 */
public class Cafe extends BoisonCafeinee {

    @Override
    void preparer() {
        System.out.println("Passage du café");

    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajout du lait et du sucre");
    }

}