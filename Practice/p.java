import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pizza = sc.nextInt();
        int puffs = sc.nextInt();
        int coldDrink = sc.nextInt();

        int pi = Math.abs(pizza) * 100;
        int pf = Math.abs(puffs) * 20;
        int cd = Math.abs(coldDrink) * 10;

        int tot = pi + pf + cd;
        System.out.println(tot);

        sc.close();
    }
}
