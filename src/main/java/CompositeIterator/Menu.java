package CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements Component {
    ArrayList<Component> menuComponents  =  new ArrayList();
    String name;
    String description;
    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addComponent(Component menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void removeComponent(Component menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public Component getChild(int i) {
        return  (Component) menuComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println(getName());
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            Component menuComponent = (Component) iterator.next();
            menuComponent.print();
        }
        return;
    }

    @Override
    public Iterator createIterator(){
        Iterator iterator = menuComponents.iterator();
        return iterator;
    }
}
