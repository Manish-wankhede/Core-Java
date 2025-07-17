public class pattern11 {

    public static void palindromNumbers(int n) {
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= n - i; j++){
                //spaces
                System.out.print(" ");
            }

            // descending order numbers
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            // Ascending order numbers
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromNumbers(5);
    }
}
