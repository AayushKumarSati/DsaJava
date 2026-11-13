class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // // int[] maxValue = new int[n];
        // // maxValue[n - 1] = prices[n - 1];
        // // for (int i = n - 2; i >= 0; i--) {
        // //     maxValue[i] = Math.max(maxValue[i + 1], prices[i]);
        // // }
        // // int ans = 0;
        // // for (int i = 0; i < n; i++) {
        // //     int currentProfit = maxValue[i] - prices[i];
        // //     ans = Math.max(ans, currentProfit);
        // // }
        // // return ans;

        //edges cases
        if (prices.length == 1) {
            return 0;

        }

        int minPrice = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;//track when you sell on ith day
            if (profit > max) { //update the profit 
                max = profit;
            }
            if (prices[i] < minPrice) { //keep track minimum price 
                minPrice = prices[i];
            }
        }
        return max;

    }
}