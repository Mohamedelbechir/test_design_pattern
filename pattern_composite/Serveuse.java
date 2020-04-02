package pattern_composite;

import java.util.Iterator;

/**
 * Serveuse
 */
public class Serveuse {

    ComposantDeMenu tousMenus;

    public Serveuse(ComposantDeMenu tousMenus) {
        this.tousMenus = tousMenus;
    }

    public void afficherMenu() {
        tousMenus.afficher();
    }

    public void afficherMenuVegetarien() {
        Iterator<ComposantDeMenu> iterateur = tousMenus.creerIterateur();
        System.out.println("\nMENU VÉGÉTARIEN\n----");
        while (iterateur.hasNext()) {
            ComposantDeMenu composantDeMenu = (ComposantDeMenu) iterateur.next();
            try {
                if (composantDeMenu.estVegetarien()) {
                    composantDeMenu.afficher();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}