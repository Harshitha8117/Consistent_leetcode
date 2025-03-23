class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=0;
        for(int i=0;i<=n-1;i++){
            a=(a^nums[i])&~b;
            b=(b^nums[i])&~a;
        }
        return a;
    }
}