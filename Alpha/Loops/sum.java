import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
           sum += i;
           i++;
        }
        System.out.println("Sum is: " + sum);
    }    
}
