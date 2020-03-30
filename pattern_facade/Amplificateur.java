package pattern_facade;

public class Amplificateur {
    private int volume;

    public void marche() {
        System.out.println("Magnifique Amplificateur en marche");
    }

    public void setDvd(LecteurDvd dvd) {
        System.out.println("Magnifique Amplificateur positionné sur le lecteur DVD" + dvd);
    }

    public void setSonSurround() {
        System.out.println("Magnifique Amplificateur réglé sur son surround (5 enceintes, 1 caisson de basses)");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Magnifique Amplificateur volume réglé sur " + volume);
    }

    public void arret() {
        System.out.println("Magnifique Amplificateur éteint");
    }

}
