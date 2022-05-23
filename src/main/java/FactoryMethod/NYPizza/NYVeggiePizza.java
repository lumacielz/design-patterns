package FactoryMethod.NYPizza;

public class NYVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NY style veggie pizza...");
    }
}
