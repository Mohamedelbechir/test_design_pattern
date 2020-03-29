package pattern_commande.recepteur;

public class Lampe {
    String string;

    public Lampe(String string) {
        this.string = string;
    }

    public void marche() {
        System.out.println(string + ": lampe allumée");
    }

    public void arret() {
        System.out.println(string + " : lampe etteinte");
    }

}
