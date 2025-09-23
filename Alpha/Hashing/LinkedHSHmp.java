import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHSHmp {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Chaina", 50);
        lhm.put("US", 5);
        
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Chaina", 50);
        hm.put("US", 5);
        
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("Chaina", 150);
        tm.put("US", 5);
        tm.put("Indonesia", 6);


        
        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);

    }    
}
