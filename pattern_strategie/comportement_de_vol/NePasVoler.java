package patter_strategie.comportement_de_vol;

/**
 * NePasVoler
 */
public class NePasVoler implements ComportementVol{

    @Override
    public void voler() {
        System.out.println("Je ne sais pas voler");

    }

    
}