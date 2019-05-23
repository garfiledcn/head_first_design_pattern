public class NYPizzaStore extends PizzaStore {
        
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case ConstValue.PIZZA_TYPE_GREEK:
                pizza = new NYStyleGreekPizza();
                break;
            case ConstValue.PIZZA_TYPE_PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            case ConstValue.PIZZA_TYPE_CLAM:
                pizza = new NYStyleClamPizza();
                break;
            case ConstValue.PIZZA_TYPE_VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
            case ConstValue.PIZZA_TYPE_CHEESE:
            default:
                pizza = new NYStyleCheesePizza();
                break;
        }

        return pizza;
    }
}
