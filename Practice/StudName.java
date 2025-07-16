import java.util.Scanner;

class StudName
{
    String first_name;
    String middle_name;
    String last_name;

    StudName(String a,String b,String c)
    {
        first_name = a;
        middle_name = b;
        last_name = c;
    }
    void display()
    {
        System.out.print("\n First Name = "+first_name);
        System.out.print("\n Middle Name = "+middle_name);
        System.out.print("\n Last Name = "+last_name);
    }
    public static void main(String args[]) 
    {
        String first_name;
        String middle_name;
        String last_name;

        Scanner s = new Scanner(System.in);

        System.out.print("\n Enter First Name: ");
        first_name = s.nextLine();

        System.out.print("\n Enter Middle Name: ");
        middle_name = s.nextLine();

        System.out.print("\n Enter Last Name: ");
        last_name = s.nextLine();

        String n = first_name + middle_name + last_name;
        System.out.print("\n Name = "+n);

        s.close();
    }

}