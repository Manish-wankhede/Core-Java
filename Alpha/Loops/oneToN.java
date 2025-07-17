import java.util.*;

public class oneToN {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int counter = 1;
        int n = s.nextInt();

        while (counter <= n) {
            System.out.print(counter+" ");
            counter++;
        }
    }
}
