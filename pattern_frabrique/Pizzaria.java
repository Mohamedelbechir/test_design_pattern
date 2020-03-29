package pattern_frabrique;

/**
 * Pizzaria
 */
public abstract class Pizzaria {

   // SimpleFabriqueDePizzas simpleFabriqueDePizzas;

    public Pizzaria(SimpleFabriqueDePizzas simpleFabriqueDePizzas) {
        ///this.simpleFabriqueDePizzas = simpleFabriqueDePizzas;

    }

    final public Pizza commanderPizza(String type) {
        Pizza pizza;
       // pizza = simpleFabriqueDePizzas.creerPizza(type);
        pizza = creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();
        return pizza;
    }
    public abstract Pizza creerPizza(String type);
}