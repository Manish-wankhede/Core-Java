import java.util.HashMap;

public class Itinerary {
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if(!revMap.containsKey(key)) 
                return key;
        }
        return null;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {        // tc =  0(n)
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bendgaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }   
        System.out.println();
    }
}
