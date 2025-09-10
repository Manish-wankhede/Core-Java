import java.util.ArrayList;

public class MaxVal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(8);

        // time complexity is 0(n) - Linear 
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element = "+max);
    }
}
