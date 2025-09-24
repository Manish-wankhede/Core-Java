import java.util.*;

public class BasicQ1 {
    public static void binaryNum(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for(int i = 1; i <= n; i++){
            String bin = q.peek();
            q.remove();
            System.out.print(bin+" ");

            q.add(bin + "0");
            q.add(bin + "1");
        }

    }
    public static void main(String[] args) {
        int n = 5;
        binaryNum(n);
    }    
}
