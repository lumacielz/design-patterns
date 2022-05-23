package FactoryMethod.PizzaStore;
import FactoryMethod.NYPizza.Pizza;

public abstract class PizzaStore {
    public void orderPizza(String type) throws ClassNotFoundException {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        }

    protected abstract Pizza createPizza(String type) throws ClassNotFoundException;
}
