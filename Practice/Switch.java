import java.util.*;

class Switch
{
    public static void main(String args[]) throws Exception
    {
        Scanner s = new Scanner(System.in);

        int a,b,c,choice;

        System.out.print("\n Menu");
        System.out.print("\n 1. Addition");
        System.out.print("\n 2. Substraction");
        System.out.print("\n 3. Multiplication");
        System.out.print("\n 4. Division");

        System.out.print("\n Enter your choice: ");
        choice = s.nextInt();

        if( choice >= 1 && choice <= 4 )
        {
            System.out.print("\n Enter the value of a: ");
            a = s.nextInt();

            System.out.print("\n Enter the value of b: ");
            b = s.nextInt();

            switch( choice )
            {
                case 1: c = a + b;
                        System.out.print("\n Addition = "+c);
                        break;

                case 2: c = a - b;
                        System.out.print("\n Substraction = "+c);
                        break;
                    
                case 3: c = a * b;
                        System.out.print("\n Multiplication = "+c);
                        break;

                case 4: c = a / b;
                        System.out.print("\n Division = "+c);
            }
        }
        else
        {
            System.out.print("\n Wrong choice");
        }

        s.close();
    }
}