import java.util.*;

public class Problem2 {
    public static void printInc(int n){
        if(n == 1){     // Base Case
            System.out.print(1+" ");
            return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = s.nextInt();

        printInc(n);
    }
}
