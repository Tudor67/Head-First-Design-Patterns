import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator {
    Enumeration enumObj;

    public EnumerationAdapter(Enumeration enumObj) {
        this.enumObj = enumObj;
    }

    public boolean hasNext() {
        return enumObj.hasMoreElements();
    }

    public Object next() {
        return enumObj.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}