package patterns_iterateur_et_composite;

/**
 * Plat
 */
public class Plat {

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

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean estVegetarien() {
        return vegetarien;
    }

    public double getPrix() {
        return prix;
    }

}