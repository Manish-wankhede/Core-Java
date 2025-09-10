import java.util.*;

public class PSsortedAndRotate {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int bp = -1;    //bp -> breakPoint
        int n = list.size();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){    //Breaking point
                bp = i; 
                break;
            }
        }

        int lp = bp + 1;    //Smallest
        int rp = bp;  //Largest

        while (lp != rp) {
            if(list.get(lp) + list.get(rp) == target){  //Case 1
                return true;
            } else if(list.get(lp) + list.get(rp) < target){    //Case 2
                lp = (lp + 1) % n;
            } else {  // Case 3
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16));
    }
}
