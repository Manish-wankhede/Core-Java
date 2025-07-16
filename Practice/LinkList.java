import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
        //step 1: create a linklist
        LinkedList<String> list = new LinkedList<>();

        //step 2: add element
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Initial list: "+list);

        //step 3: add element in a specific positions
        list.addFirst("mango");
        list.addLast("orange");
        System.out.println("After adding first & last: "+list);

        //step 4: access elements
        System.out.println("First element: "+list.getFirst());
        System.out.println("last element: "+list.getLast());

        //step 5: remove element
        list.removeFirst();
        list.removeLast();
        System.out.println("after removing first and last: "+list);

        //step 6: check for elements
        boolean hasBanana = list.contains("banana");
        System.out.println("Contains 'Banana': "+hasBanana);

        //step 7: iterate through the LinkedList
        System.out.println("Iterate through the linkedList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        //step 8: clear the linkedlist
        list.clear();
        System.out.println("List after clearing: "+list);
    }
}
