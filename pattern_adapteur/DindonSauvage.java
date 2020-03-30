package pattern_adapteur;

/**
 * DindonSauvage
 */
public class DindonSauvage implements Dindon{

    @Override
    public void glouglouter() {
       System.out.println("Glouglou");

    }

    @Override
    public void voler() {
        System.out.println("Je ne vole pas loin");

    }

    
}