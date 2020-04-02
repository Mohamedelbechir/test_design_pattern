package pattern_composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Menu
 */
public class Menu extends ComposantDeMenu {
    ArrayList<ComposantDeMenu> composantsMenu = new ArrayList<ComposantDeMenu>();
    String nom;
    String description;

    public Menu(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    public void ajouter(ComposantDeMenu composantDeMenu) {
        composantsMenu.add(composantDeMenu);
    }

    @Override
    public void supprimer(ComposantDeMenu composantDeMenu) {
        composantsMenu.remove(composantDeMenu);
    }

    @Override
    public ComposantDeMenu getEnfant(int i) {
        return (ComposantDeMenu) composantsMenu.get(i);
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void afficher() {
        System.out.print("\n" + getNom());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        Iterator<ComposantDeMenu> iterateur = composantsMenu.iterator();
        while (iterateur.hasNext()) {
            ComposantDeMenu composantDeMenu = iterateur.next();
            composantDeMenu.afficher();
        }
    }

    @Override
    public Iterator<ComposantDeMenu> creerIterateur() {

        return new IterateurComposite(composantsMenu.iterator());

    }
}