package FactoryMethod.NYPizza;

public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NY style cheese pizza...");
    }
}
