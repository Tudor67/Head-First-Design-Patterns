import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration {
    Iterator it;

    public IteratorAdapter(Iterator it) {
        this.it = it;
    }

    public boolean hasMoreElements() {
        return it.hasNext();
    }

    public Object nextElement() {
        return it.next();
    }
}