class OrderPizza {
    public static void main(String[] args) {
        orderPizza();
    }

    static Pizza orderPizza() {
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
