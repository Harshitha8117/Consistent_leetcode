class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            ans[i]=prices[i];
        }
        for (int i=0;i<n;i++) { 
            while (!stack.isEmpty()&& prices[i]<=prices[stack.peek()]) { 
                int a=stack.pop(); 
                ans[a]=prices[a]-prices[i]; 
            } 
            stack.push(i); 
        }
        return ans;
    }
}