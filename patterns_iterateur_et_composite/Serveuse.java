package patterns_iterateur_et_composite;

import java.util.Iterator;

/**
 * Serveuse
 */
public class Serveuse {

    Menu<Plat> menuCreperie;
    Menu<Plat> menuCafeteria;
    Menu<Plat> menuBrasserie;

    public Serveuse(Menu<Plat> menuCreperie, Menu<Plat> menuCafeteria, Menu<Plat> menuBrasserie) {
        this.menuCreperie = menuCreperie;
        this.menuCafeteria = menuCafeteria;
        this.menuBrasserie = menuBrasserie;

    }

    public void afficherMenu() {
        Iterator<Plat> iterateurCrepe = menuCreperie.creerIterateur();
        Iterator<Plat> iterateurCafet = menuCafeteria.creerIterateur();
        Iterator<Plat> iterateurBrasserie = menuBrasserie.creerIterateur();
        
        System.out.println("MENU\n----\nBRUNCH");
        afficherMenu(iterateurCrepe);
        System.out.println("\nDÉJEUNER");
        afficherMenu(iterateurCafet);
        System.out.println("\nDINER");
        afficherMenu(iterateurBrasserie);
    }

    private void afficherMenu(Iterator<Plat> iterateur) {
        while (iterateur.hasNext()) {
            Plat plat = (Plat) iterateur.next();
            System.out.print(plat.getNom() + " ,");
            System.out.print(plat.getPrix() + " --");
            System.out.println(plat.getDescription());
        }
    }
}