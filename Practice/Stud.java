import java.util.Scanner;

class Stud
{
    String name;
    int rollno;
    float percentage;

    Scanner s = new Scanner(System.in);

    Stud()
    {
        System.out.print("\n Enter the Name: ");
        name = s.nextLine();

        System.out.print("\n Enter the Rollno: ");
        rollno = s.nextInt();

        System.out.print("\n Enter the percentage: ");
        percentage = s.nextFloat();
    }
    void display()
    {
        System.out.print("\n Name = "+name);
        System.out.print("\n Rollno = "+rollno);
        System.out.print("\n Percentage = "+percentage);
    }
    public static void main(String args[]) throws Exception
    {
        Stud s = new Stud();
        s.display();
    }
}