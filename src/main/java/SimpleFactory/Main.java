package SimpleFactory;

import SimpleFactory.PizzaFactory.SimplePizzaFactory;
import SimpleFactory.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
    }
}
