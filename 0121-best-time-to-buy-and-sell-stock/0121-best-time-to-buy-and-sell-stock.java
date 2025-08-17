/*class Solution {
    public int maxProfit(int[] prices) {
     int min=Integer.MAX_VALUE;
     int max=0;
     for(int i:prices){
        min=Math.min(i,min);
        max=Math.max(max,i-min);
     }
     return max;
    }
}*/




class Solution {
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
}
