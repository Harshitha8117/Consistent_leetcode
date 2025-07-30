class Solution {
    public int maxSubArray(int[] nums) {
        int a=nums[0];
        int sum=0;
        for(int n:nums){
            if(sum<0)
            sum=0;
            
            sum+=n;
            a=Math.max(a,sum);
        }
        return a;
    }
}



