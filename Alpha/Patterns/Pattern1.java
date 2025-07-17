public class Pattern1 {
    public static void hollow_reactagle(int totRow, int totCol){
        //outer loop
        for(int i = 1; i <= totRow; i++){
            // inner columns
            for(int j = 1; j <= totCol; j++){
                // cell (i,j)
                if(i == 1 || i == totRow || j == 1 || j == totCol){
                    // Boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_reactagle(10, 10);
    }
}
