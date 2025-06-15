class Solution {
    public int maxSubArray(int[] nums) {
        int a=nums[0];
        int sum=0;
        for(int i:nums){
            if(sum<0)
            sum=0;
            sum+=i;
            a=Math.max(sum,a);
        }
        return a;
    }
}