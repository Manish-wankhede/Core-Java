import java.util.*;

public class Choice {
    public static void main(String[] args) {
        int a, b, ans, choise;

        Scanner s = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Addition");
        System.out.println("2. Sustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("\n Enter your Choice: ");
        choise = s.nextInt();

        if (choise >= 1 && choise <= 4) {
            System.out.print("\n Entert the First number: ");
            a = s.nextInt();

            System.out.print("\n Enter the Second number: ");
            b = s.nextInt();

            switch (choise) {
                case 1:
                    ans = a + b;
                    System.out.print("\n Addition = " + ans);
                    break;
            
                case 2:
                    ans = a - b;
                    System.out.print("\n Substraction = " + ans);
                    break;
            
                case 3:
                    ans = a * b;
                    System.out.print("\n Addition = " + ans);
                    break;
            
                default:
                    ans = a / b;
                    System.out.print("\n Division = " + ans);
                    break;
            }
        }else{
            System.out.print("Invalid Choice");
        }
        s.close();
    }    
}
