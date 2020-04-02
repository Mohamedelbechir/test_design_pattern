package pattern_composite;

import java.util.Iterator;

public class IterateurNull implements Iterator<ComposantDeMenu> {

    @Override
    public boolean hasNext() {

        return false;
    }

    @Override
    public ComposantDeMenu next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
