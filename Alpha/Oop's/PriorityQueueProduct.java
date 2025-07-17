import java.util.*;

public class PriorityQueueProduct {
    public static List<Long> findProducts(int[] arr) {
        List<Long> result = new ArrayList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < arr.length; i++) {
            pq.offer((long) arr[i]);  // Convert int to Long before adding to the PriorityQueue
            
            if (pq.size() < 3) {
                result.add(-1L); // Add -1 as Long if there are less than 3 elements
            } else {
                // Get the top three largest elements
                Long first = pq.poll();
                Long third = pq.poll();
                
                // Calculate the product of the three largest elements as a long
                long product = first * second * third;
                result.add(product);
                
                // Put the elements back into the priority queue
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
            }
        }
        
        return result;
    }

        int[] arr = {1, 4, 2, 3, 1, 4};
        List<Long> result = findProducts(arr);

        for (Long val : result) {
            System.out.println(val);
        }
    }
}
