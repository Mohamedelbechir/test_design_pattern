package patterns_iterateur_et_composite;

import java.util.ArrayList;

/**
 * IterateurCreperie
 */
public class IterateurCreperie implements Iterateur {
    ArrayList<Plat> elements;
    int position = 0;

    public IterateurCreperie(ArrayList<Plat> elements) {
        this.elements = elements;
    }

    @Override
    public boolean encore() {
        if (position >= elements.size() || elements.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object suivant() {
        Plat plat = elements.get(position);
        position = position + 1;
        return plat;
    }

}