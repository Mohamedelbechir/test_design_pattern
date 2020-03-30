package pattern_adapteur;

/**
 * Colver
 */
public class Colver implements Canard{

    @Override
    public void cancaner() {
       System.out.println("Coincoin");
    }

    @Override
    public void voler() {
        System.out.println("Je vole");

    }

    
}