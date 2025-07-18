import java.util.*;

class Staff{
    String name;
    int id;

    Scanner s = new Scanner(System.in);

    void accept(){
        System.out.print("\n Enter the name: ");
        name = s.nextLine();

        System.out.print("\n Enter the id: ");
        id = s.nextInt();
    }

    void display(){
        System.out.println("\n Name = "+name);
        System.out.print("\n Id = "+id);
    }
}

class Teacher extends Staff{
    String subject;

    void accept1(){
        System.out.print("\n Enter the subject: ");
        subject = s.nextLine();
    }

    void display1(){
        System.out.println("\n Subject = "+subject);
    }
}

class Workers extends Staff{
    String department;

    void accept2(){
        System.out.print("\n Enter the department: ");
        department = s.nextLine();
    }

    void display2(){
        System.out.println("\n Department");
    }
}

public class College {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        
        System.out.println("\n Teacher Details");
        t.accept();
        t.accept1();

        System.out.println("\n Disaply teacher");
        t.display();
        t.display1();

        Workers w = new Workers();
        System.out.println("\n Workers Details");
        w.accept();
        w.accept2();

        System.out.println("\n Display Workers");
        w.display();
        w.display2();
    }
}
