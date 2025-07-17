public class stock {

    public static int buyAndSell(int prices[]){
        // int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){   //profit
                maxProfit += prices[i] - prices[i - 1];  // today's profit
                // maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSell(prices));
    }
}
