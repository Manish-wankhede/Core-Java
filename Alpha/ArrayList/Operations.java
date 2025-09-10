import java.util.ArrayList;

public class Operations {   
    public static void main(String[] args) {
        //Classname = objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);    //Time Complexity O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Get Operation
        // int element = list.get(3);
        // System.out.println(element);

        //Delete element
        // list.remove(2);
        // System.out.println(list);

        //Set element
        // list.set(2, 10);
        // System.out.println(list);

        //Containe
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));
    }
}