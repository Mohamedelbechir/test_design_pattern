package pattern_frabrique;

/**
 * SimpleFabriqueDePizzas
 */
public class SimpleFabriqueDePizzas {

    public Pizza creerPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "framage":
                pizza = new PizzaFromage();
                break;
            case "poivrons":
                pizza = new PizzaPoivrons();
                break;

            case "fruitDeMer":
                pizza = new PizzaFruitDeMer();
                break;
            case "vegetarienne":
                pizza = new PizzaVegetarienne();
                break;

            default:
                break;
        }
        return pizza;

    }
}