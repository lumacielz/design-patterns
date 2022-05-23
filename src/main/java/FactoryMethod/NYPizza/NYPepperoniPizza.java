package FactoryMethod.NYPizza;

public class NYPepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NY style pepperoni pizza...");
    }
}
