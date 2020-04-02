package pattern_patron_de_methode;

/**
 * TestBoisson
 */
public class TestBoisson {

    public static void main(String[] args) {
        TheAvecAdaptateur theAdapt = new TheAvecAdaptateur();
        CafeAvecAdaptateur cafeAdapt = new CafeAvecAdaptateur();
        System.out.println("\nPréparation du thé...");
        theAdapt.suivreRecette();
        System.out.println("\nPréparation du café...");
        cafeAdapt.suivreRecette();
    }
}