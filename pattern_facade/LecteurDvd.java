package pattern_facade;

public class LecteurDvd {
    private String film;
    private String name;

    LecteurDvd(String name) {
        this.name = name;
    }

    public void marche() {
        System.out.println(name + "en marche");
    }

    public void jouer(String film) {
        this.film = film;
        System.out.println(name + "joue <<" + this.film + ">>");
    }

    public void stop() {
        System.out.println(name + "arrêté sur <<" + this.film + ">>");
    }

    public void ejecter() {
        System.out.println(name + " éjection");
    }

    public void arret() {
        System.out.println(name + " arrêté");
    }

    @Override
    public String toString() {
        return name;
    }

}
