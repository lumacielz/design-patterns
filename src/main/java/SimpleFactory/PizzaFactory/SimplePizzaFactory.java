package SimpleFactory.PizzaFactory;

import SimpleFactory.Pizza.CheesePizza;
import SimpleFactory.Pizza.PepperoniPizza;
import SimpleFactory.Pizza.Pizza;
import SimpleFactory.Pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) throws ClassNotFoundException{
        if (type == "veggie"){
            return new VeggiePizza();
        }
        if (type == "pepperoni"){
            return new PepperoniPizza();
        }
        if (type == "cheese"){
            return new CheesePizza();
        }
        throw new ClassNotFoundException("this type of pizza doesn't exist");
    }
}
