public class Problem13 {
    public static int friendsPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // choice
        // Single
        // int fnm1 = friendsPair(n-1);

        // pair
        // int fnm2 = friendsPair(n-2);
        // int pairWays = (n-1) * fnm2;

        // totways
        // int totWays = fnm1 + pairWays;

        // return totWays;

        return friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPair(4));
    }
}
 