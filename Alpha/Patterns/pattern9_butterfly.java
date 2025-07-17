public class pattern9_butterfly {
    public static void main(String args[]){

        int n = 5;

        // Upper part   
        for(int i = 1; i <= n; i++){
            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for(int i = n; i >= 1; i--){
            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
