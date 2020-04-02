package pattern_composite;

/**
 * Waitress
 */
public class Waitress {

    ComposantDeMenu allMenus;

    public Waitress(ComposantDeMenu allMenus) {
        this.allMenus = allMenus;
    }

    public void afficherMenu() {
        allMenus.afficher();
    }
}