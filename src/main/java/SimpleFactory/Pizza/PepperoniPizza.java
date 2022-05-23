package SimpleFactory.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("pepperoni pizza...");
    }
}
