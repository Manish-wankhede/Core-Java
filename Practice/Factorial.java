// import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // sc.close();

        // int i = 1;
        // long fact = 0;

        // while (i <= n) {
        //     fact = fact * i;
        //     i++;
        // }
        // System.out.println(fact);

        int arr[] = {2,7,10,15,24};

        // int num;
        // for(int i = 0; i < 5; i++){
        //     num = a[i];
        //     System.out.print(num+" ");
        // }

        // for(int num : a){
        //     System.out.print(num+" ");
        // }

        int sum = 0;
        for(int i : arr){
            // if(i % 2 == 0){
            //     System.out.print(i+" ");
            // }

            sum = sum + i;
            System.out.print(sum+" ");
        }
    }
}
