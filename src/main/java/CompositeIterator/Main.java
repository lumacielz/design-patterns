package CompositeIterator;

public class Main {
    public static void main (String[] args){
        Component cake = new MenuItem("bolo", "");
        Component tiramisu = new MenuItem("tiramisu", "");

        Component pizza = new MenuItem("pizza", "");
        Component ravioli = new MenuItem("ravioli", "");
        Component risoto = new MenuItem("risoto de limao siciliano", "");

        Component dessertMenu = new Menu("dessert menu", "menu de sobremesa");
        dessertMenu.addComponent(cake);
        dessertMenu.addComponent(tiramisu);
        dessertMenu.print();

        Component dinnerMenu = new Menu("dinner menu", "menu de jantar");
        dinnerMenu.addComponent(pizza);
        dinnerMenu.addComponent(risoto);
        dinnerMenu.addComponent(ravioli);
        dinnerMenu.addComponent(dessertMenu);

        //dinnerMenu.print();

        // composite iterator permite iterar dretamente em uma estrutura composta
        Component frozenDessertMenu = new Menu("frozen dessert menu", "");
        frozenDessertMenu.addComponent(new MenuItem("ice cream", "chocolate ice cream"));
        frozenDessertMenu.addComponent(new MenuItem("gelatto", "italian gelatto"));

        dessertMenu.addComponent(frozenDessertMenu);
        CompositeIterator compositeIterator = new CompositeIterator(dinnerMenu.createIterator());
        while (compositeIterator.hasNext()){
            Component component = compositeIterator.next();
            component.print();
        }

    }
}
