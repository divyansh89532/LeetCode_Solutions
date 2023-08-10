class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int curr_profit = 0;
        int buying_price = prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(buying_price>prices[i])
            {
                buying_price = prices[i];
            }
            curr_profit = prices[i]-buying_price;
            if(profit<curr_profit)
            {
                profit=curr_profit;
            }

        }
        return profit;
    }
}
