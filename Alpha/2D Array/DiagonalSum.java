public class DiagonalSum {

    public static int printDiaSum(int matrix[][]){
        int sum = 0;

        // for(int i = 0; i < matrix.length; i++){      // time complexity os O(n^2)
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //     
        // } else if(i + j == matrix.length - 1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        
        for(int i = 0; i < matrix.length; i++){     // time complexity is O(n)
            //primary diagonals
            sum += matrix[i][i];

            // secondary diagonals
            if(i != matrix.length - 1 - i);
                sum += matrix[i][matrix.length - i - 1];            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        System.out.println(printDiaSum(matrix));
    }
}
