/*class Solution{
    public int climbStairs(int n){
        if(n<2)
        return 1;
        int a=1,b=1;
        for(int i=2;i<=n;i++){
            int temp=b;
            b=a+b;
            a=temp;
        }
        return b;
    }
}*/



/*class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}*/


class Solution{
    public int climbStairs(int n){
        if(n<=3)
        return n;
        int a=1,b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            b=a;
            a=c;
        }
        return b;
    }
}