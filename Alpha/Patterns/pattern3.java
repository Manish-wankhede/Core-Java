public class pattern3 {
    public static void inverted_half_pyramidWithNumbers(int n){
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }   
    }
    public static void main(String[] args) {
        inverted_half_pyramidWithNumbers(5);
    }
}
