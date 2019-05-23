class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nypizzaStore = new NYPizzaStore();
        Pizza pizza = nypizzaStore.orderPizza(args[0]);
        System.out.println("ordered a " + pizza.getName()+"\n");

        PizzaStore chpizzaStore = new CHPizzaStore();
        pizza = chpizzaStore.orderPizza(args[0]);
        System.out.println("ordered a " + pizza.getName()+"\n");
    }
}
