import java.util.Arrays;

public class MinimizeDifference {
    
    public static int minimizeDifference(int[] arr, int k) {
        int n = arr.length;
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // Initialize the result as the difference between the last and first element
        int result = arr[n - 1] - arr[0];
        
        // Calculate the minimum and maximum possible values after modifications for each element
        int min, max;
        for (int i = 0; i < n - 1; i++) {
            // Calculate minimum and maximum possible values after modifications
            min = Math.min(arr[0] + k, arr[i + 1] - k);
            max = Math.max(arr[i] + k, arr[n - 1] - k);
            
            // Update the result if necessary
            result = Math.min(result, max - min);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        System.out.println("Minimum difference after modifications: " + minimizeDifference(arr, k));
    }
}
