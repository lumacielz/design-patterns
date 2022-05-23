package CompositeIterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class CompositeIterator implements Iterator {
    Deque<Iterator> stack = new ArrayDeque<Iterator>();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()){
            return false;
        }
        Iterator i = stack.peek();   //ultimo elemento da fila - iterador maior
        if (!i.hasNext()){ //iterador nao tem mais elemento
            stack.pop();  //remove da fila
            return hasNext(); //retorna hasNext falso pois a lista estara vazia
        }
        return true;  //se o elemento e ramo retorna true
    }

    @Override
    public Component next() {
        if (hasNext()){
            Iterator i = stack.peek();
            Component component = (Component) i.next();
            if (component instanceof Menu){
                Iterator menuIterator = ((Menu) component).createIterator();
                stack.push(menuIterator);
            }
            return component;
        }
        return null;
    }
}
