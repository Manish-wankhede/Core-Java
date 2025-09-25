import java.util.Scanner;

public class W {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // int n,i,j;

        System.out.print("Enter the number of element: ");
        int n = s.nextInt();

        int row = 3, num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j % 4 == 1) || (i == 2 && j % 2 == 0) || (i == 3 && j % 4 == 3)) {
                    if (num <= n) {
                        System.out.println(num++);
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}