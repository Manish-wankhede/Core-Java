// You are given an integer arraylist nums. A number x is lonely when it appears only once, and
// no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
// Return all lonely numbers in nums. You may return the answer in any order.


import java.util.*;

public class Q2 {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> num){
        Collections.sort(num);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < num.size() - 1; i++){
            if(num.get(i-1) + 1 < num.get(i) && num.get(i) + 1 < num.get(i+1)){
                list.add(num.get(i));
            }
        }

        if(num.size() == 1){
            list.add(num.get(0));
        }

        if(num.size() > 1){
            if(num.get(0) + 1 < num.get(1)){
                list.add(num.get(0));
            }

            if(num.get(num.size() - 2) + 1 < num.get(num.size() - 1)){
                list.add(num.get(num.size() - 1));
            }
        }

        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
        ArrayList<Integer> lonelyNumbers = Q2.findLonely(numbers);
        
        System.out.println(lonelyNumbers);
    }
}
