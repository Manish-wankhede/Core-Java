public class pattern12_palindromic {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            // Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            // 1st half
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            // 2ns half
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
