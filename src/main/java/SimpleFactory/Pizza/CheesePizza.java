package SimpleFactory.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("cheese pizza...");
    }
}
