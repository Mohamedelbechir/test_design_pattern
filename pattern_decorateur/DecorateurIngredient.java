package pattern_decorateur;

/**
 * DecorateurIngredient
 */
public abstract class DecorateurIngredient extends Boisson {

    /**
     * Vous allons faire en sorte que les ingrédient (decorateur) réimplementent
     * tous la methode getDescription() 
     * 
     */
    protected abstract String getDescription();
    

}