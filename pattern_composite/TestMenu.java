package pattern_composite;

/**
 * TestMenu
 */
public class TestMenu {

    public static void main(String[] args) {
        ComposantDeMenu menuCreperie = new Menu("MENU CRÊPERIE", "Brunch");
        ComposantDeMenu menuCafeteria = new Menu("MENU CAFETERIA", "Déjeuner");
        ComposantDeMenu menuBrasserie = new Menu("MENU BRASSERIE", "Dîner");
        ComposantDeMenu menuDesserts = new Menu("MENU DESSERT", "Rien que des desserts !");
        ComposantDeMenu tousMenus = new Menu("TOUS LES MENUS", "Toutes nos offres");

        tousMenus.ajouter(menuCreperie);
        tousMenus.ajouter(menuCafeteria);
        tousMenus.ajouter(menuBrasserie);

        // ajout plat pour le menu creperie
        menuCreperie.ajouter(new Plat("Crêpe à l’oeuf", "Crêpe avec oeuf au plat ou brouillé", true, 2.99));
        menuCreperie.ajouter(new Plat("Crêpe complète", "Crêpe avec oeuf au plat et jambon", false, 2.99));
        menuCreperie.ajouter(new Plat("Crêpe forestière", "Myrtilles fraîches et sirop de myrtilles", true, 3.49));
        menuCreperie.ajouter(new Plat("Crêpe du chef", "Crème fraîche et fruits rouges au choix", true, 3.59));

        // ajout plat pour le menu brasserie
        menuBrasserie
                .ajouter(new Plat("Omelette sarladaise", "Omelette aux champignons et pommes sautées", true, 3.99));
        menuBrasserie.ajouter(new Plat("Soupe de poissons", "Soupe de poissons, rouille et croûtons", false, 3.69));
        menuBrasserie.ajouter(
                new Plat("Tagliatelles Primavera", "Pâtes fraîches, brocoli, petits pois, crème fraîche", true, 4.29));

        menuCafeteria.ajouter(new Plat("Pasta al pesto", "Spaghetti, ail, basilic et parmesan", true, 3.89));
        menuCafeteria.ajouter(menuDesserts);
        menuDesserts.ajouter(new Plat("Tarte du chef", "Tarte du chef", true, 1.59));

        Serveuse serveuse = new Serveuse(tousMenus);
        serveuse.afficherMenu();
    }
}