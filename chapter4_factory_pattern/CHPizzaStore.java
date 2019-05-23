public class CHPizzaStore extends PizzaStore {
    static private final String PIZZA_TYPE_CHEESE = "Cheese";
    static private final String PIZZA_TYPE_GREEK = "Greek";
    static private final String PIZZA_TYPE_PEPPERONI = "Pepperoni";
    static private final String PIZZA_TYPE_CLAM = "Clam";
    static private final String PIZZA_TYPE_VEGGIE = "Veggie";
        
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case PIZZA_TYPE_GREEK:
                pizza = new CHGreekPizza();
                break;
            case PIZZA_TYPE_PEPPERONI:
                pizza = new CHPepperoniPizza();
                break;
            case PIZZA_TYPE_CLAM:
                pizza = new CHClamPizza();
                break;
            case PIZZA_TYPE_VEGGIE:
                pizza = new CHVeggiePizza();
                break;
            case PIZZA_TYPE_CHEESE:
            default:
                pizza = new CHCheesePizza();
                break;
        }

        return pizza;
    }
}
