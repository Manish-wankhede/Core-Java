public class pattern9 {
    public static void diamond(int n) {
        // 1st half - outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= (n-i); j++){
                // spaces
                System.out.print(" ");
            }
            
            // stars 2(i) - 1
            for(int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2ns half 
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= (2 * (i) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(5);
    }
}
