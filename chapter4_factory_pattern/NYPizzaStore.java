public class NYPizzaStore extends PizzaStore {
    static private final String PIZZA_TYPE_CHEESE = "Cheese";
    static private final String PIZZA_TYPE_GREEK = "Greek";
    static private final String PIZZA_TYPE_PEPPERONI = "Pepperoni";
    static private final String PIZZA_TYPE_CLAM = "Clam";
    static private final String PIZZA_TYPE_VEGGIE = "Veggie";
        
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case PIZZA_TYPE_GREEK:
                pizza = new NYStyleGreekPizza();
                break;
            case PIZZA_TYPE_PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            case PIZZA_TYPE_CLAM:
                pizza = new NYStyleClamPizza();
                break;
            case PIZZA_TYPE_VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
            case PIZZA_TYPE_CHEESE:
            default:
                pizza = new NYStyleCheesePizza();
                break;
        }

        return pizza;
    }
}
