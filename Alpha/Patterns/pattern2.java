public class pattern2 {
    public static void inverted_half_pyramid(int n){
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= n-i; j++){
                //spaces
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(5);
    }
}
