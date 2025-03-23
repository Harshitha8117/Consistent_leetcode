class Solution {
    public boolean check(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
            a++;
        }
        if(nums[nums.length-1]>nums[0])
        a++;
        return a<=1;
    }
}