import java.util.Arrays;
import java.util.Scanner;

public class DeepEqu {
    public static void main(String[] args) {
        Object a[] = new Object[5];
        Object b[] = new Object[5];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            a[i] = s.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.print(a[i]+" ");
        }

        for(int i = 0; i < 5; i++){
            b[i] = s.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.println(b[i]+" ");
        }
        
        boolean flag = Arrays.deepEquals(a, b);
        if(flag == true){
            System.out.println("Both are equals");
        } else {
            System.out.println("Not equ");
        }
        s.close();
    }
}
