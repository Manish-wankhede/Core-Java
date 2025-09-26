import java.util.*;

public class Collection3 {
    public static void main(String[] args) {
        Vector v1 = new Vector(5);
        v1.addElement(10);
        v1.addElement(20);
        v1.addElement(30);
        v1.addElement(40);
        v1.addElement(50);
        v1.addElement(60);

        System.out.println(v1.capacity());
        System.out.println(v1.clone());
        // System.out.println(v1.remove(4));
    }
}
