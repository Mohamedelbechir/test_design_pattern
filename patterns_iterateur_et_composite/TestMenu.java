package patterns_iterateur_et_composite;

/**
 * TestMenu
 */
public class TestMenu {

    public static void main(String[] args) {
        MenuCreperie menuCreperie = new MenuCreperie();
        MenuCafeteria menuCafeteria = new MenuCafeteria();
        MenuBrasserie menuBrasserie = new MenuBrasserie();
        Serveuse serveuse = new Serveuse(menuCreperie, menuCafeteria, menuBrasserie);
        serveuse.afficherMenu();
    }
}