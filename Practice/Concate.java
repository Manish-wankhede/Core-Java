import java.util.Scanner;

public class Concate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fn = sc.nextLine();
        String midn = sc.nextLine();
        String ln = sc.nextLine();

        sc.close();

        // fn = fn + " " + midn + " ";
        // System.out.println(fn.concat(ln));
        // System.out.println(fn + " " + midn + " " + ln);
        System.out.println(fn + midn + ln);    //input java <space> program.                                                
    }
}
