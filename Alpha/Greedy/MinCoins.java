import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int CountOfCoins = 0;
        int amount = 2500;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 1; i < coins.length; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    CountOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total used of coin = "+CountOfCoins);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

    }
}