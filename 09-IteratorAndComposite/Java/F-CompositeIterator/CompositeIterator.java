import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        while (!stack.empty()) {
            Iterator iterator = (Iterator)stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
            }
        }
        return false;
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator)stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}