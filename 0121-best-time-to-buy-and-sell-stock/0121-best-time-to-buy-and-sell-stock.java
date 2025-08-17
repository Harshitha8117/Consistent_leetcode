/*class Solution {
    public int maxProfit(int[] prices) {
        int a=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(a>prices[i]){
                a=prices[i];
            }
            else if(prices[i]-a>profit){
                profit=prices[i]-a;
            }
        }
        return profit;
    }
}*/

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}