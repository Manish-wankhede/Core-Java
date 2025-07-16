import java.util.*;

class Menu
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int a,b,choice,ans;

        System.out.print("\n Menu");
        System.out.print("\n 1. Addition");
        System.out.print("\n 2. Substraction");
        System.out.print("\n 3. Multiplication");
        System.out.println("\n 4. Division");

        System.out.print("\n Enter your choice: ");
        choice = s.nextInt();

        if( choice >= 1 && choice <= 4 )
        {
            System.out.print("\n Ente the value of a: ");
            a = s.nextInt();

            System.out.print("\n Enter the value of b: ");
            b = s.nextInt();

            if( choice == 1 )
            {
                ans = a + b;
                System.out.print("\n Addition = "+ans);
            }
            else if( choice == 2 )
            {
                ans = a - b;
                System.out.print("\n Substraction = "+ans);
            }
            else if( choice == 3 )
            {
                ans = a * b;
                System.out.print("\n Multiplication = "+ans);
            }
            else
            {
                ans = a / b;
                System.out.print("\n Division = "+ans);
            }
        }
        else
        {
            System.out.print("\n Wrong choice");
        }
        s.close();
    }
}