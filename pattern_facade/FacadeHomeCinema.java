package pattern_facade;

/**
 * FacadeHomeCinema
 */
public class FacadeHomeCinema {

    Amplificateur amp;
    Tuner tuner;
    LecteurDvd dvd;
    LecteurCd cd;
    Projecteur projecteur;
    Lumieres lumieres;
    Ecran ecran;
    MachineAPopcorn machineAPopcorn;

    public FacadeHomeCinema(Amplificateur amp, Tuner tuner, LecteurDvd dvd, LecteurCd cd, Projecteur projecteur,
            Lumieres lumieres, Ecran ecran, MachineAPopcorn machineAPopcorn) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projecteur = projecteur;
        this.lumieres = lumieres;
        this.ecran = ecran;
        this.machineAPopcorn = machineAPopcorn;
    }

    public void regarderFilm(String film) {
        System.out.println("Vous allez voir un bon film...");
        machineAPopcorn.marche();
        machineAPopcorn.eclater();
        lumieres.attenuer(10);
        ecran.baisser();
        projecteur.marche();
        projecteur.modeGrandEcran();
        amp.marche();
        amp.setDvd(dvd);
        amp.setSonSurround();
        amp.setVolume(5);
        dvd.marche();
        dvd.jouer(film);
    }

    public void arreterFilm() {
        System.out.println("C’est la fin du film...");
        machineAPopcorn.arret();
        lumieres.marche();
        ecran.monter();
        projecteur.arret();
        amp.arret();
        dvd.stop();
        dvd.ejecter();
        dvd.arret();
    }

}