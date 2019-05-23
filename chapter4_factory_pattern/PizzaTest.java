class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nypizzaStore = new NYPizzaStore();
        nypizzaStore.orderPizza(args[0]);

        PizzaStore chpizzaStore = new CHPizzaStore();
        chpizzaStore.orderPizza(args[0]);
    }
}
