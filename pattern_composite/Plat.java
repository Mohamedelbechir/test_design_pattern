package pattern_composite;

import java.util.Iterator;

/**
 * Plat
 */
public class Plat extends ComposantDeMenu {
    String nom;
    String description;
    boolean vegetarien;
    double prix;

    public Plat(String nom, String description, boolean vegetarien, double prix) {
        this.nom = nom;
        this.description = description;
        this.vegetarien = vegetarien;
        this.prix = prix;
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
    public double getPrix() {
        return prix;
    }

    @Override
    public boolean estVegetarien() {
        return vegetarien;
    }

    public void afficher() {
        System.out.print(" " + getNom());
        if (estVegetarien()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrix());
        System.out.println(" -- " + getDescription());
    }

    @Override
    public Iterator<ComposantDeMenu> creerIterateur() {
        return new IterateurNull();
    }
}