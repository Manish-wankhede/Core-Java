// You are given an integer Arraylist nums. You are also given an integer key, which is present in
// nums.
// For every unique integer target in nums, count the number of times target immediately follows
// an occurrence of key in nums. In other words, count the number of indices i such that:
// 0 <= i <= nums.size() - 2,
// nums.get(i) == key and,
// nums.get(i+1) == target.
// Return the target with the maximum count.

import java.util.*;

public class Q3 {
    public static int mostFrequent(ArrayList<Integer> num, int key){
        int[] result = new int[1000];

        for(int i = 0; i < num.size() - 1; i++){
            if(num.get(i) == key){
                result[num.get(i+1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < 1000; i++){
            if(result[i] > max){
                max = result[i];
                ans = i + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(100);
        num.add(200);
        num.add(1);
        num.add(100);

        System.out.println(mostFrequent(num, 2));
    }
}
