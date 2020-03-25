package pattern_decorateur;

/**
 * StartBuzzCoffee
 */
public class StartBuzzCoffee {

    public static void main(String[] args) {
        Boisson boisson = new Expresso(Boisson.VENTI);
        System.out.println(boisson.getDescription() + " $" + boisson.cout());

        Boisson boisson2 = new Sumatra();
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chantilly(boisson2);
        System.out.println(boisson2.getDescription() + " $" + boisson2.cout());

        Boisson boisson3 = new Colombia(Boisson.GRANDE);
        boisson3 = new Caramel(boisson3);
        boisson3 = new Chocolat(boisson3);
        boisson3 = new Chantilly(boisson3);
        System.out.println(boisson3.getDescription() + " $" + boisson3.cout());

        
          java.io.BufferedInputStream bufferedInputStream ;

    }
}