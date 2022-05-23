package SimpleFactory.Pizza;

import SimpleFactory.Pizza.Pizza;

public class VeggiePizza  extends Pizza {
    @Override
    public void prepare() {
        System.out.println("veggie pizza...");
    }
}
