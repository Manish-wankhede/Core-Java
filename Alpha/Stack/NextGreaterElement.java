import java.util.*;
public class NextGreaterElement {
    public static int[] findNestGreater(int nums[]){
        int n = nums.length;
        int[] nextGreater = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++){
            nextGreater[i] = -1;
        }

        for(int i = 0; i < n; i++){
            while (!s.isEmpty() && nums[i] > nums[s.peek()]) {
                int idx = s.pop();
                nextGreater[idx] = nums[i];
            }
            s.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] nums = {6, 8, 0, 1, 3};
        int[] nextGreater = findNestGreater(nums);

        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}