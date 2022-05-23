package CompositeIterator;

import java.util.Iterator;

public class MenuItem implements Component{
    String name;
    String description;
    public MenuItem(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addComponent(Component component) {
        return;
    }

    @Override
    public void removeComponent(Component component) {
        return;
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
    @Override
    public Iterator createIterator(){
        return null;
    }
}
