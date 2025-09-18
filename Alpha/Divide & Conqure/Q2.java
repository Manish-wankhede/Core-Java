public class Q2 {
    // public static int majority(int[] nums){
        //     int majorityCount = nums.length / 2;
    
        //     for(int i = 0; i < nums.length; i++){
        //         int count = 0;
        //         for(int j = 0; j < nums.length; j++){
        //             if(nums[j] == nums[i]){
        //                 count += 1;
        //             } 
        //         }
        //         if(count > majorityCount){
        //             return nums[i];
        //         }
        //     }
        //     return 0;
        // }
        // }

        // time complexity is O(n^2)
    
    public static int countRange(int[] nums, int num, int hi, int low){
        int count = 0;

        for(int i = low; i <= hi; i++){
            if (nums[i] == num) {
                count++;
            }
        }

        return count;
    }
    private static int majority(int[] nums, int low, int hi){
        //base case; the only element in an array of size 1 is the majority element
        if (low == hi) {
            return nums[0];
        }

        //recurse on left and right halves of this slice
        int mid = low + (hi - low) / 2;
        int left = majority(nums, low, mid);
        int right = majority(nums, mid+1, hi);

        //if the two halves is agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        //otherwise, count each element and return the winner
        int leftCount = countRange(nums, left, low, hi);
        int rightCount = countRange(nums, right, low, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] nums){
        return majority(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    //time complexity is O(nlogn)
    
}
