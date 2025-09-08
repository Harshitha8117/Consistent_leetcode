class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc=0,dec=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                inc=1;
            if(nums[i]<nums[i+1])
                dec=1;
        }
        if(inc==1 && dec==1){
            return false;
        }
        return true;
    }
}