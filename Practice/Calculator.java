import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplicatin");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println();

        int ch = sc.nextInt();
        System.out.println();

        if(ch >= 1 && ch <= 5){
            int a = sc.nextInt();
            System.out.println();

            int b = sc.nextInt();
            System.out.println();

            int ans;

            switch (ch) {
                case 1: ans = a + b;
                        System.out.println("Ans = "+ans);
                        break;
                
                case 2: ans = a - b;
                        System.out.println("Ans = "+ans);
                        break;

                case 3: ans = a * b;
                        System.out.println("Ans = "+ans);
                        break;

                case 4: ans = a / b;
                        System.out.println("Ans = "+ans);
                        break;
                
                case 5: ans = a % b;
                        System.out.println("Ans = "+ans);
                        break;
            }
        } else {
            System.out.println("Wrong Choice");
        }
        sc.close();
    }
}
