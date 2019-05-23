public class CHPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case ConstValue.PIZZA_TYPE_GREEK:
                pizza = new CHGreekPizza();
                break;
            case ConstValue.PIZZA_TYPE_PEPPERONI:
                pizza = new CHPepperoniPizza();
                break;
            case ConstValue.PIZZA_TYPE_CLAM:
                pizza = new CHClamPizza();
                break;
            case ConstValue.PIZZA_TYPE_VEGGIE:
                pizza = new CHVeggiePizza();
                break;
            case ConstValue.PIZZA_TYPE_CHEESE:
            default:
                pizza = new CHCheesePizza();
                break;
        }

        return pizza;
    }
}
