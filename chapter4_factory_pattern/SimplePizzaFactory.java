public class SimplePizzaFactory {
    static private final String PIZZA_TYPE_CHEESE = "Cheese";
    static private final String PIZZA_TYPE_GREEK = "Greek";
    static private final String PIZZA_TYPE_PEPPERONI = "Pepperoni";
    static private final String PIZZA_TYPE_CLAM = "Clam";
    static private final String PIZZA_TYPE_VEGGIE = "Veggie";

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case PIZZA_TYPE_GREEK:
                pizza = new GreekPizza();
                break;
            case PIZZA_TYPE_PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case PIZZA_TYPE_CLAM:
                pizza = new ClamPizza();
                break;
            case PIZZA_TYPE_VEGGIE:
                pizza = new VeggiePizza();
                break;
            case PIZZA_TYPE_CHEESE:
            default:
                pizza = new CheesePizza();
                break;
        }

        return pizza;
    }
}
