public class pattern7 {

    public static void solidRhombus(int n) {
        //outer loop
        for(int i = 1; i <= n; i++){

            // spaces 
            for(int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            
            // star
            for(int j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhombus(5);
    }
}
