import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Cursor {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");

        ListIterator l1 = v1.listIterator();
        while (l1.hasNext()) {
            // System.out.println(l1.next());
            String str = (String) l1.next();
            if(str.equals("A")){
                l1.set("C Programming");
            } else if(str.equals("B")) {
                l1.set("C++ Programming");
            } else if(str.equals("C")){
                l1.set("Core Java");
            } else if(str.equals("D")){
                l1.remove();
            }
        }
        while (l1.hasPrevious()) {
            System.out.println(l1.previous());
        }
 
        // Enumeration k1 = v1.elements();
        // while (k1.hasMoreElements()) {
        // System.out.println(k1.nextElement());
        // }


        // Iterator e1 = v1.iterator();
        // while (e1.hasNext()) {
        //     // System.out.println(e1.next());
        //     String s1 = (String) e1.next();
        //     if (s1 == "D" || s1 == "A") {
        //         e1.remove();
        //     } else {
        //         System.out.println(s1);
        //     }
        // }
    }
}  
