import java.util.ArrayList;

public class CollectionFram {
    public static void main(String[] args) {
        // step 1: create an arrayList
        ArrayList<String> fruit = new ArrayList<>();

        //step 2: add element to the arrayList
        fruit.add("banana");
        fruit.add("pineapple");
        fruit.add("apple");
        fruit.add("graphs");
        System.out.println("Fruit list after adding: "+fruit);

        // step 3: access an element by index
        String firstFruit = fruit.get(0);
        System.out.println("First fruit: "+firstFruit);

        //step 4: update an element
        fruit.set(1, "BlueBarry");
        System.out.println("fruits list after updating"+fruit);

        //step 5: remove an element by index
        fruit.remove(2);
        System.out.println("fruits list after removing by index"+fruit);

        // Step 6: Remove an element by value 
        fruit.remove("Blueberry"); 
        System.out.println("Fruits List After Removing by Value: " + fruit); 
        // Step 7: Check if an element exists 
        boolean hasApple = fruit.contains("Apple"); System.out.println("Contains 'Apple': " + hasApple); 
        // Step 8: Get the size of the ArrayList int 
        int size = fruit.size(); System.out.println("Size of Fruits List: " + size); 
        // Step 9: Iterate through the ArrayList
        System.out.println("Iterating through the ArrayList:"); 
        for (String fruits : fruit) { 
            System.out.println(fruit); 
        } 
        // Step 10: Clear the ArrayList 
        fruit.clear(); System.out.println("Fruits List After Clearing: " + fruit); 
        // Step 11: Check if ArrayList is empty 
        boolean isEmpty = fruit.isEmpty(); 
        System.out.println("Is Fruits List Empty? " + isEmpty);
    }
}
