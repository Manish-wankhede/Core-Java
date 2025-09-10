import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(8);

        System.out.println("Befor Sorting: " +list);
        Collections.sort(list); //Ascending 
        System.out.println("Ascending: "+list);

        // Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descendign: "+list);
    }    
}