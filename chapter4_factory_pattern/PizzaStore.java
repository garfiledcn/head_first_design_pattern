class PizzaStore{

    SimplePizzaFactory mPizzaFactory;

    public PizzaStore (SimplePizzaFactory factory) {
        mPizzaFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = mPizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
