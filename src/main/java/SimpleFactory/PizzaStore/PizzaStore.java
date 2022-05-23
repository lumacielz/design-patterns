package SimpleFactory.PizzaStore;

import SimpleFactory.Pizza.CheesePizza;
import SimpleFactory.Pizza.Pizza;
import SimpleFactory.PizzaFactory.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;
    public PizzaStore (SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(String type) throws ClassNotFoundException {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
}
