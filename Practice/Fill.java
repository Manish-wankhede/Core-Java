import java.util.Arrays;
import java.util.Scanner;

public class Fill {
    public static void main(String[] args) {
        int a[] = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            a[i] = s.nextInt();
        }

        Arrays.fill(a, 2, 7, 9);
        for(int i = 0; i < 10; i++){
            System.out.print(a[i]+" ");
        }
        s.close();
    }
}
