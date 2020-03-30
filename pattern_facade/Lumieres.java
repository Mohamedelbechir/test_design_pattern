package pattern_facade;

public class Lumieres {
    private int pourcent;

    public void attenuer(int pourcent) {
        this.pourcent = pourcent;
        System.out.println("Lumières du Home Cinéma atténuées à " + pourcent + "%");
    }

    public void marche() {
        System.out.println("Lumières du Home Cinéma allumées");
    }

}
