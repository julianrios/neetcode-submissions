class Solution {
    public int maxProfit(int[] prices) {
        // brute force
    //     int maxProfit = 0;
    //     for(int i=0; i < prices.length; i++) { // buy day
    //         for(int j=i+1; j < prices.length; j++) { // sell day
    //             int profit = prices[j] - prices[i];
            
    //             if(profit > maxProfit) {
    //                 maxProfit = profit;
    //             } 
    //         }
    //     }
    //     return maxProfit;
    // }

    // optimal approach
    int minBuy = prices[0];
    int maxProfit = 0;

    for(int sell : prices) {
        minBuy = Math.min(minBuy, sell);
        maxProfit = Math.max(maxProfit, sell - minBuy);
    }
    
    return maxProfit;
    }
}
