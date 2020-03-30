package pattern_adapteur;

/**
 * TesterCanard
 */
public class TesterCanard {

    public static void main(String[] args) {
        Colver canard = new Colver();
        DindonSauvage dindon = new DindonSauvage();
        Canard adaptateurDindon = new AdapteurDindon(dindon);
        System.out.println("Dindon dit...");
        dindon.glouglouter();
        dindon.voler();

        System.out.println("\nCanard dit...");
        testerCanard(canard);

        System.out.println("\nAdaptateurDindon dit...");
        testerCanard(adaptateurDindon);

    }

    /* Ici le client ne sait jaimais que c'est un adapteur */
    public static void testerCanard(Canard canard) {
        canard.cancaner();
        canard.voler();
    }
}