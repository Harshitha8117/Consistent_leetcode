class Solution {
    public int findNonMinOrMax(int[] nums) {
        int a=nums[0],b=nums[0];
        for(int num:nums){
            a=Math.min(num,a);
            b=Math.max(num,b);
        }
        for(int num:nums){
            if(num!=a && num!=b)
            return num;
        }
        return -1;
    }
}