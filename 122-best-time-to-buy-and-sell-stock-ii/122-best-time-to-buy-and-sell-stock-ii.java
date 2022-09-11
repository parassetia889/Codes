class Solution {
    public int maxProfit(int[] prices) {
        
        int currPrice = prices[0];
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < currPrice)
                currPrice = prices[i];
            else{
                maxProfit += prices[i]-currPrice;
                currPrice = prices[i];
            }
        }
        return maxProfit;
    }
}