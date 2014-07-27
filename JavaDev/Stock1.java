public class Stock1 {
    public int maxProfit(int[] prices) {
        int buy= Integer.MAX_VALUE, profit = 0;
        for(int i = 0; i < prices.length; i++){
            if( prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
            if(prices[i] < buy){
                buy = prices[i];
            }
        }
        return profit;
    }
}