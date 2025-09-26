import java.util.*;

public class Collection1 {

    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(5);
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add(2, "G");
        l1.set(3, "D");
        l1.remove(3);
        l1.size();

        // l1.clear();
        // l1.size();

        // Iterator g1 = l1.iterator();
        // try {
        //     while (g1.hasNext()) {
        //         String s1 = (String) g1.next();
        //         if (s1 != "G") {
        //             System.out.println(g1.next());
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println(l1);
        // }

        System.out.println(l1);
    }

}