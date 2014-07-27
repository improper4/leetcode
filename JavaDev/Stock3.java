public class Stock3 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int left = 0, right = 0;
        int min = prices[0], minPos = 0;
        int gain = 0, gap = 0;
        for(int i = 1; i < prices.length; i++)  //get max profit with a single transaction
            if(prices[i] <= min){
                minPos = i;
                min = prices[i];
            }
            else if(prices[i] - min > gain){
                right = i;
                left = minPos;
                gain = prices[i] - min;
            }
        min = prices[right];
        for(int i = right - 1; i > left; i--)   //break the 1st transaction into two
            if(prices[i] < min) min = prices[i];
            else gap = Math.max(gap, prices[i] - min);
        min = prices[0];
        for(int i = 1; i < left; i++)           //2nd transaction is before the 1st
            if(prices[i] < min) min = prices[i];
            else gap = Math.max(gap, prices[i] - min);
        min = prices[right];
        for(int i = right + 1; i < prices.length; i++)  //2nd transaction is after the 1st
            if(prices[i] < min) min = prices[i];
            else gap = Math.max(gap, prices[i] - min);
        return gain + gap;
    }
    /*
    public int maxProfit(int[] prices) {
        int[] f = {0,0,0};
        int[] g = {0,0,0};

        int n = prices.length - 1;
        for (int i = 0; i < n; ++i) {
            int diff = prices[i+1] - prices[i];
            int m = Math.min(i+1, 2);
            for (int j = m; j >= 1; --j) {
                f[j] = Math.max(f[j], g[j-1]) + diff;
                g[j] = Math.max(g[j], f[j]);
            }
        }
        return Math.max(g[1], g[2]);
    }
    */
}