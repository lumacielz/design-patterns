package FactoryMethod.PizzaStore;
import FactoryMethod.NYPizza.NYCheesePizza;
import FactoryMethod.NYPizza.NYPepperoniPizza;
import FactoryMethod.NYPizza.NYVeggiePizza;
import FactoryMethod.NYPizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) throws ClassNotFoundException {
        if (type == "veggie"){
            return new NYVeggiePizza();
        }
        if (type == "pepperoni"){
            return new NYPepperoniPizza();
        }
        if (type == "cheese"){
            return new NYCheesePizza();
        }
        throw new ClassNotFoundException("this type of pizza doesn't exist");
    }
}
