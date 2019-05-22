class OrderPizza {
    public static void main(String[] args) {
        for (String t : args) {
            System.out.println("args: "+ t + "\n");
        }
        orderPizza(args[0]);
    }

    static private final String PIZZA_TYPE_CHEESE = "Cheese";
    static private final String PIZZA_TYPE_GREEK = "Greek";
    static private final String PIZZA_TYPE_PEPPERONI = "Pepperoni";
    static private final String PIZZA_TYPE_CLAM = "Clam";
    static private final String PIZZA_TYPE_VEGGIE = "Veggie";

    static Pizza orderPizza(String type) {
        Pizza pizza;
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

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
