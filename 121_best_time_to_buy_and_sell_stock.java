// LeetCode: 121. Best Time to Buy and Sell Stock
class _121_best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minPrice)
                minPrice = prices[i];

            int profit = prices[i] - minPrice;

            if(profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;
    }
}
