public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 9, 11, 12, 45};
        int target = 3;
        int result = search(array, target);
        System.out.println("Index of " + target + " is: " + result);
    }
    
    public static int search(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (A[mid] == target) {
                return mid; // Found the target
            } else if (A[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }
        
        // If target is not found
        return -1;
    }
}
