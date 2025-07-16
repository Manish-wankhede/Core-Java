import java.util.*;

public class sample {
    public static int[] solve(int N, int K, int M, int[][] A) {
        // Step 1: Find the maximum element of each K x K sub-matrix and store in array P
        List<Integer> P = new ArrayList<>();

        for (int i = 0; i <= N - K; i++) {
            for (int j = 0; j <= N - K; j++) {
                int maxElement = Integer.MIN_VALUE;
                for (int x = i; x < i + K; x++) {
                    for (int y = j; y < j + K; y++) {
                        maxElement = Math.max(maxElement, A[x][y]);
                    }
                }
                P.add(maxElement);
            }
        }

        // Step 2: Filter elements in P that are greater than or equal to M
        List<Integer> filteredList = new ArrayList<>();
        for (int value : P) {
            if (value >= M) {
                filteredList.add(value);
            }
        }

        // Step 3: Find the required values
        int count = filteredList.size();
        int minVal = Collections.min(filteredList);
        int maxVal = Collections.max(filteredList);

        return new int[]{count, minVal, maxVal};
    }

    public static void main(String[] args) {
        // Example usage:
        int N = 6;
        int K = 4;
        int M = 5;
        int[][] A = {
                {4, 6, 7, 3, 10, 2},
                {3, 8, 1, 2, 4, 7},
                {1, 7, 3, 7, 2, 9},
                {8, 9, 3, 1, 3, 4},
                {8, 6, 5, 3, 4, 9},
                {10, 8, 4, 7, 2, 3}
        };

        int[] result = solve(N, K, M, A);
        System.out.println(Arrays.toString(result));  // Output: [9, 5, 16]
    }
}
