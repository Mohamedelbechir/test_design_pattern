package pattern_patron_de_methode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CafeAvecAdaptateur
 */
public class CafeAvecAdaptateur extends BoisonCafeinee {

    @Override
    void preparer() {
        System.out.println("Passage du café");

    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajout du lait et du sucre");
    }
    @Override
    public boolean clientVeutSupplements() {
        String reponse = getReponseUtilisateur();
        if (reponse.toLowerCase().startsWith("o")) {
            return true;
        } else {
            return false;
        }
    }

    private String getReponseUtilisateur() {
        String reponse = null;
        System.out.print("Voulez-vous du lait etdu sucre (o/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            reponse = in.readLine();
        } catch (IOException ioe) {
            System.err.println("Erreur d’ES. Choix non proposé");
        }
        if (reponse == null) {
            return "non";
        }
        return reponse;
    }
}
