import java.util.Scanner;

public class Len {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();

        System.out.println("Given String is "+str);
        System.out.println("Length is "+str.length());
    }
}
