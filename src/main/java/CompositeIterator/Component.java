package CompositeIterator;

import java.util.Iterator;

public interface Component {
    public void addComponent(Component component);
    public void removeComponent(Component component);
    public String getName();
    public Component getChild(int i);
    public void print();
    public Iterator createIterator();
}
