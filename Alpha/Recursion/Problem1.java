import java.util.*;

public class Problem1 {
    public static void printDec(int n){
        if(n == 1){     // Base case
            System.err.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n - 1);
    }
    public static void main(String[] args) {
        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = s.nextInt(); 

        printDec(n);
    }    
}