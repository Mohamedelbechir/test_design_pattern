package pattern_composite;

import java.util.Iterator;

/**
 * ComposantDeMenu
 */
public abstract class ComposantDeMenu {

    public void ajouter(ComposantDeMenu composantDeMenu) {
        throw new UnsupportedOperationException();
    }

    public void supprimer(ComposantDeMenu composantDeMenu) {
        throw new UnsupportedOperationException();
    }

    public ComposantDeMenu getEnfant(int i) {
        throw new UnsupportedOperationException();
    }

    public String getNom() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrix() {
        throw new UnsupportedOperationException();
    }

    public boolean estVegetarien() {
        throw new UnsupportedOperationException();
    }

    public void afficher() {
        throw new UnsupportedOperationException();
    }

    public Iterator<ComposantDeMenu> creerIterateur() {
        throw new UnsupportedOperationException();
    }

}