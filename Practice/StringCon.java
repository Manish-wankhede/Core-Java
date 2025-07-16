import java.util.Scanner;

public class StringCon {
    String fn;
    int number;
    String ln;

    StringCon(String a, int b, String c){
        a = fn;
        b = number; 
        c = ln;
    }
    void display(){
        System.out.println(fn);
        System.out.println(number);
        System.out.println(ln);
    }
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        String fn = sc.nextLine();
        String ln = sc.nextLine();
        int number = sc.nextInt();

        String n = fn +" "+ ln +" "+ number;
        System.out.println(n);

        sc.close();
    }
}
