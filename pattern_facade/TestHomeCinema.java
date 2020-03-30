package pattern_facade;

/**
 * TestHomeCinema
 */
public class TestHomeCinema {

    public static void main(String[] args) {

        Amplificateur amp = new Amplificateur();
        Tuner tuner = new Tuner();
        LecteurDvd dvd = new LecteurDvd("Super Lecteur DVD");
        LecteurCd cd = new LecteurCd();
        Projecteur projecteur = new Projecteur();
        Lumieres lumieres = new Lumieres();
        Ecran ecran = new Ecran();
        MachineAPopcorn machineAPopcorn = new MachineAPopcorn();
        FacadeHomeCinema homeCinema = new FacadeHomeCinema(amp, tuner, dvd, cd, projecteur, lumieres, ecran,
                machineAPopcorn);

        homeCinema.regarderFilm("Hôtel du Nord");
        homeCinema.arreterFilm();
    }
}