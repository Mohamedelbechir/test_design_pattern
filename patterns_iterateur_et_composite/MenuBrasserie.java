package patterns_iterateur_et_composite;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * MenuBrasserie
 */
public class MenuBrasserie implements Menu<Plat> {
    Hashtable<String, Plat> plats = new Hashtable<String, Plat>();

    public MenuBrasserie() {
        ajouterPlat("Omelette sarladaise", "Omelette aux champignons et pommes sautées", true, 3.99);
        ajouterPlat("Soupe de poissons", "Soupe de poissons, rouille et croûtons", false, 3.69);
        ajouterPlat("Tagliatelles Primavera", "Pâtes fraîches, brocoli, petits pois, crème fraîche", true, 4.29);
    }

    public void ajouterPlat(String nom, String description, boolean vegetarien, double prix) {
        Plat plat = new Plat(nom, description, vegetarien, prix);
        plats.put(plat.getNom(), plat);
    }

    @Override
    public Iterator<Plat> creerIterateur() {
        return plats.values().iterator();
    }

}