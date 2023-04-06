import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class Test {
    
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("ABC");
        strList.add("DEF");
        strList.add("H");

        Iterator iteratorObj = strList.iterator();
        Enumeration iteratorAdapter = new IteratorAdapter(iteratorObj);

        System.out.println("\nIterator Adapter ...");
        testEnumeration(iteratorAdapter);
    }

    public static void testEnumeration(Enumeration enumObj) {
        while(enumObj.hasMoreElements()){
            System.out.println(enumObj.nextElement());
        }
    }
}