class PizzaTest {
    public static void main(String[] args) {
		String[] pizzaTypeStrings = {ConstValue.PIZZA_TYPE_CHEESE, ConstValue.PIZZA_TYPE_CLAM, ConstValue.PIZZA_TYPE_GREEK, ConstValue.PIZZA_TYPE_PEPPERONI, ConstValue.PIZZA_TYPE_VEGGIE};

        for (String type : pizzaTypeStrings) {
	        PizzaStore nypizzaStore = new NYPizzaStore();
	        Pizza pizza = nypizzaStore.orderPizza(type);
	        System.out.println("ordered a " + pizza.getName()+"\n");

	        PizzaStore chpizzaStore = new CHPizzaStore();
	        pizza = chpizzaStore.orderPizza(type);
	        System.out.println("ordered a " + pizza.getName()+"\n");
		}
    }
}
