import java.util.*;

class Sum
{
    public static void main(String args[]) throws Exception
    {
        Scanner s = new Scanner(System.in);

        int a,b,c;

        System.out.print("\n Enter the value of a: ");
        a = s.nextInt();

        System.out.print("\n Enter the value of b: ");
        b = s.nextInt();

        c = a + b;
        System.out.print("\n Sum = "+c);

        s.close();
    }
}