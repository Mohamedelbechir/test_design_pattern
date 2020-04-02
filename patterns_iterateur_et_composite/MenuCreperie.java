package patterns_iterateur_et_composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * MenuCreperie
 */
public class MenuCreperie implements Menu<Plat> {
    ArrayList<Plat> plats;

    public MenuCreperie() {
        plats = new ArrayList<Plat>();
        ajouterPlat("Crêpe à l’oeuf", "Crêpe avec oeuf au plat ou brouillé", true, 2.99);
        ajouterPlat("Crêpe complète", "Crêpe avec oeuf au plat et jambon", false, 2.99);
        ajouterPlat("Crêpe forestière", "Myrtilles fraîches et sirop de myrtilles", true, 3.49);
        ajouterPlat("Crêpe du chef", "Crème fraîche et fruits rouges au choix", true, 3.59);
    }

    public void ajouterPlat(String nom, String description, boolean vegetarien, double prix) {
        Plat plat = new Plat(nom, description, vegetarien, prix);
        plats.add(plat);
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    public Iterator<Plat> creerIterateur() {
        // return new IterateurCreperie(plats);
        return plats.iterator();
    }

}