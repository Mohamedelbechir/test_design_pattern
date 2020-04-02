package patterns_iterateur_et_composite;

import java.util.Iterator;

/**
 * IterateurMenuCafeteria
 */
public class IterateurMenuCafeteria implements Iterator<Plat> {
    Plat[] elements;
    int position = 0;

    public IterateurMenuCafeteria(Plat[] plats) {
        this.elements = plats;
    }
    @Override
    public boolean hasNext() {
        if (position >= elements.length || elements[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Plat next() {
        Plat plat = elements[position];
        position = position + 1;
        return plat;
    }

}