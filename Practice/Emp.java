import java.util.Scanner;

public class Emp {
    String name;
    int id;
    float sal;

    Emp(String n, int a, float s){
        name = n;
        id = a;
        sal = s;
    }
    void display(){
        System.out.println("Name ="+name);
        System.out.println("Id = "+id);
        System.out.println("Salary ="+sal);
    }
    public static void main(String[] args) {
        String name;
        int id;
        float sal;

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        id = sc.nextInt();
        sal = sc.nextFloat();

        Emp e = new Emp(name, id, sal);
        e.display();

        sc.close();
    }
}
