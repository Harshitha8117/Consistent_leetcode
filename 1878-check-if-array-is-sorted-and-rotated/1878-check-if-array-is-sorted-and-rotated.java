class Solution {
    public boolean check(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                a++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            a++;
        }
        return a<=1;
    }
}