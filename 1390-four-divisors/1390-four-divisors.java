class Solution {
    public int sumFourDivisors(int[] nums) {
        int tot=0;
        for(int num:nums){
            int sum=fact(num);
            if(sum!=-1){
                tot+=sum;
            }
        }
        return tot;
    }
    static int fact(int n){
        int c=0;
        int t=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
                t+=i;
                if(c>4)
                return -1;
            }
        }
        return c==4?t:-1;
    }
}

