import java.util.HashMap;

public class Insert {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("Chaina", 150);
        map.put("US", 50);

        System.out.println(map);

        // Get
        int population = map.get("India");
        System.out.println(population);

        
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Indonesia"));
    }
}