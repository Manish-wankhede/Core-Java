import java.util.Scanner;

public class TwoD {
    // public static void main(String[] args) {
    //     int a[][] = new int[3][3];
    //     int sum = 0;

    //     Scanner s = new Scanner(System.in);

    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             a[i][j] = s.nextInt();
    //             sum = sum + a[i][j];
    //         }
    //     }

    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             System.out.print(a[i][j]+" ");
    //         }
    //     }
    //     System.out.println("Sum :"+sum);
    //     s.close();
    // }
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               System.out.print(a[i][j]+" ");
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                b[i][j] = a[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(b[i][j]+" ");
            }
        }
        s.close();
    }
}
