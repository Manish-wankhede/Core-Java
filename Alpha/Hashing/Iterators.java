import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Iterators {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Mumbai");
        set.add("Delhi");
        set.add("Noida");
        set.add("Banglore");
        System.out.println(set);
        // Iterator it = set.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it. next());
        // }

        // for (String Sets : set) {
        //     System.out.println(Sets);
        // }
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Mumbai");
        set2.add("Delhi");
        set2.add("Noida");
        set2.add("Banglore");
        System.out.println(set2);

        set2.remove("Delhi");
        System.out.println(set2);

        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(10);
        set3.add(15);
        set3.add(5);

        System.out.println(set3);
    }
}
