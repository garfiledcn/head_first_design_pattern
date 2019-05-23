class PizzaTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza(args[0]);
    }
}
