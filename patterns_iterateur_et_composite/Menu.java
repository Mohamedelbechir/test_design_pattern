package patterns_iterateur_et_composite;

import java.util.Iterator;

/**
 * Menu
 */
public interface Menu<T> {
    Iterator<T> creerIterateur();
    
}