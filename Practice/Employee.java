// WAP to find the employee name id and salary

import java.util.*;

class Employee
{
    String name;
    int id;
    float salary;

    Scanner s = new Scanner(System.in);

    Employee()
    {
        System.out.print("\n Enter the Name: ");
        name = s.nextLine();

        System.out.print("\n Enter Employee Id: ");
        id = s.nextInt();

        System.out.print("\n Enter Salary: ");
        salary = s.nextFloat();
    }
    void display()
    {
        System.out.print("\n Name = "+name);
        System.out.print("\n Id = "+id);
        System.out.print("\n Salary = "+salary);
    }
    public static void main(String args[]) throws Exception
    {
        Employee e = new Employee();
        e.display();
    }
}