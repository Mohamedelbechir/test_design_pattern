package pattern_composite;

import java.util.Iterator;
import java.util.Stack;

public class IterateurComposite implements Iterator<ComposantDeMenu> {
    Stack<Iterator<ComposantDeMenu>> pile = new Stack<Iterator<ComposantDeMenu>>();

    public IterateurComposite(Iterator<ComposantDeMenu> iterateur) {
        this.pile.push(iterateur);
    }

    @Override
    public boolean hasNext() {
        if (pile.empty()) {
            return false;
        } else {
            Iterator<ComposantDeMenu> iterateur = pile.peek();
            if (!iterateur.hasNext()) {
                pile.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public ComposantDeMenu next() {
        if (hasNext()) {
            Iterator<ComposantDeMenu> iterateur = pile.peek();
            ComposantDeMenu composant = iterateur.next();
            if (composant instanceof Menu) {
                pile.push(composant.creerIterateur());
            }
            return composant;
        } else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
