import java.util.*;

class Employee{
    String name;
    int id;

    Scanner s = new Scanner(System.in);

    void accept(){
        System.out.print("\n Enter your name: ");
        name = s.nextLine();

        System.out.print("\n Enter your id: ");
        id = s.nextInt();
    }

    void display(){
        System.out.println("\n Name = " + name);
        System.out.println("\n Id = " + id);
    }
}

class Manager extends Employee{
    double salary;

    void accept1(){
        System.out.print("\n Enter your salary: ");
        salary = s.nextDouble();
    }

    void display1(){
        System.out.println("\n Salary = "+salary);
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Manager m = new Manager();
        
        //Accept
        System.out.println("\n Provide Details");
        m.accept();
        m.accept1();

        //Display
        System.out.println("\n Displaying details");
        m.display();
        m.display1();
    }
}
