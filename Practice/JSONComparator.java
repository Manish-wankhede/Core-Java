import java.util.*;

public class JSONComparator {
    
    public static List<String> findDifferentKeys(String json1, String json2) {
        // Parse JSON strings into Maps
        Map<String, String> map1 = parseJSON(json1);
        Map<String, String> map2 = parseJSON(json2);
        
        // Find keys with different values
        List<String> differentKeys = new ArrayList<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && !Objects.equals(map1.get(key), map2.get(key))) {
                differentKeys.add(key);
            }
        }
        
        // Sort the keys lexicographically
        Collections.sort(differentKeys);
        
        return differentKeys;
    }
    
    private static Map<String, String> parseJSON(String json) {
        Map<String, String> map = new HashMap<>();
        String[] pairs = json.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim().replaceAll("\"", "");
                String value = keyValue[1].trim().replaceAll("\"", "");
                map.put(key, value);
            }
        }
        return map;
    }
    
    public static void main(String[] args) {
        String json1 = "{\"key1\": \"value1\", \"key2\": \"value2\", \"key3\": \"value3\"}";
        String json2 = "{\"key1\": \"value1\", \"key2\": \"new_value\", \"key4\": \"value4\"}";
        
        List<String> differentKeys = findDifferentKeys(json1, json2);
        
        System.out.println("Keys with different values:");
        for (String key : differentKeys) {
            System.out.println(key);
        }
    }
}
