import java.util.LinkedList;
import java.util.Stack;

public class Collection2 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.addFirst("Coding");
        l1.addLast("Sikho");
        l1.add(1, "College");
        System.out.println(l1.get(1));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.search(30));
    }
}
