public class MissingNum {
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 3;
        nums[1] = 0;
        nums[2] = 1;
        System.out.println(missingNum(nums));
    }
    public static int missingNum(int[] nums){
        int nXor = nums.length;
        for(int i = 0; i < nums.length; i++){
            nXor = nXor ^ i ^ nums[i];
        }
        return nXor;
    }
}
