
package pattern_decorateur;

public class Colombia extends Boisson {
    public Colombia(String taille) {
        this.description = "Colombia";
        this.taille = taille;
    }

    @Override
    public double cout() {
        return .89;
    }
}
