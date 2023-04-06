import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test {
    
    public static void main(String[] args) {
        Vector<String> strVector = new Vector<>();
        strVector.add("ABC");
        strVector.add("DEF");
        strVector.add("H");

        Enumeration<String> enumObj = strVector.elements();
        Iterator enumAdapter = new EnumerationAdapter(enumObj);

        System.out.println("\nEnumeration Adapter ...");
        testIterator(enumAdapter);
    }

    public static void testIterator(Iterator it) {
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}